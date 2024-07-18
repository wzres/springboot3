package com.wzres.enums;

import lombok.Getter;

@Getter
public enum Status {
    SUCCESS(200,"操作成功"),
    SELECT_SUCCESS(200, "查询成功"),
    INSERT_SUCCESS(200, "新增成功"),
    UPDATE_SUCCESS(200, "修改成功"),
    DELETE_SUCCESS(200, "删除成功"),
    REGISTER_FAIL(402, "用户名已占用"),
    LOGIN_FAIL(403, "用户名或密码错误");

    private Integer code;
    private String msg;

    Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
