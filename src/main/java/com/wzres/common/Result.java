package com.wzres.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wzres.enums.Status;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public Result<?> error(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    public Result<?> ok(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        return this;
    }

    //本类内部使用
    public Result() {
        this.code = Status.SUCCESS.getCode();
        this.msg = Status.SUCCESS.getMsg();
    }

    //本类内部使用
    public static Result okSelect(int code, String msg) {
        Result result = new Result();
        return result.ok(code, null, msg);
    }

    /*public ResponseResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }*/

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Result errorResult(int code, String msg) {
        Result result = new Result();
        return result.error(code, msg);
    }

    //操作成功，无数据
    public static Result okSuccess() {
        Result result = new Result();
        return result;
    }

    //操作成功，有数据
    public static Result okSuccess(Object data) {
        Result result = setStatusEnum(Status.SUCCESS, Status.SUCCESS.getMsg());
        if(data!=null) {
            result.setData(data);
        }
        return result;
    }

    //增删改成功
    public static Result okDML(Status enums) {
        return setStatusEnum(enums, enums.getMsg());
    }


    //查询成功，有数据
    public static Result okSelect(Object data) {
        Result result = setStatusEnum(Status.SELECT_SUCCESS, Status.SELECT_SUCCESS.getMsg());
        if(data!=null) {
            result.setData(data);
        }
        return result;
    }


    //全局异常会使用(较多)
    /*public static Result errorResult(Status enums){
        return setStatusEnum(enums,enums.getMsg());
    }*/


    //全局异常会使用(一条)
    /*public static Result errorResult(Status enums, String msg){
        return setStatusEnum(enums,msg);
    }*/

    private static Result setStatusEnum(Status enums, String msg){
        return okSelect(enums.getCode(),msg);
    }

}