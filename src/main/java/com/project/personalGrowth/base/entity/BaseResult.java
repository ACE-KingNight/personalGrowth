package com.project.personalGrowth.base.entity;

/**
 * @program: personalGrowth
 * @description: 统一API响应结果封装
 * @author: WangZhenXin
 * @create: 2020-05-19 11:34
 * @memo 备注信息
 */
public class BaseResult {

    //响应状态码
    private int code;

    //响应返回信息
    private String message;

    //响应返回对象
    private Object data;

    public BaseResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
