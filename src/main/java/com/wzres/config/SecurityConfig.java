package com.wzres.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.lang.annotation.Annotation;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    //private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;

    //创建BCryptPasswordEncoder注入容器
    //使用BCryptPasswordEncoder对用户密码进行加密存入数据库
    /*@Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }*/


    // 通过传入参数AuthenticationConfiguration的方法获取AuthenticationManager
    /*@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }*/

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //关闭csrf
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> {
                    //对于登录接口 允许匿名访问
                    auth.requestMatchers("/users/login").anonymous();
                    //对于hallo接口，需要有test权限字段
                    //auth.requestMatchers("/test").hasAuthority("test");
                    //对于登录接口 允许随意访问
                    //auth.requestMatchers("/users/login").permitAll())

                    //上面外的所有请求全部需要鉴权认证
                    auth.anyRequest().authenticated();
                });

                //.formLogin(Customizer.withDefaults()); //使用表单方式登录页
                //.httpBasic(Customizer.withDefaults()); //使用基本方式登录页

        //把token校验过滤器添加到过滤器链中
        //http.addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);

        //配置异常处理器
        /*http.exceptionHandling()
                //配置认证失败处理器对象
                .authenticationEntryPoint(authenticationEntryPoint).
                //配置授权失败处理器对象
                 accessDeniedHandler(accessDeniedHandler);*/

        //允许跨域
        //.cors();

        return http.build();
    }


}