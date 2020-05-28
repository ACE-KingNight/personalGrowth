package com.project.personalGrowth.base.util;

import com.project.personalGrowth.base.emnu.ResultCode;
import com.project.personalGrowth.base.entity.BaseResult;

/**
 * @program: personalGrowth
 * @description: 返回状态工厂类
 * @author: WangZhenXin
 * @create: 2020-05-19 11:44
 * @memo 备注信息
 */
public class ResultFactory {

    /**
     * 返回正常响应
     * @param data 返回参数
     * @return BaseResult
     */
    public static BaseResult buildSuccessResult(Object data){
        return buildResult(ResultCode.SUCCESS,"success",data);
    }

    /**
     * 返回错误响应
     * @param message 异常原因
     * @return BaseResult
     */
    public static  BaseResult buildFailResult(String message){
        return buildResult(ResultCode.FAIL,message,null);
    }

    /**
     * 返回接口不存在异常
     * @param message 异常原因
     * @return BaseResult
     */
    public static  BaseResult buildNotFoundResult(String message){
        return buildResult(ResultCode.NOT_FOUND,message,null);
    }

    /**
     * 返回服务器内部异常
     * @param message 异常原因
     * @return BaseResult
     */
    public static  BaseResult buildInternalServerErrorResult(String message){
        return buildResult(ResultCode.INTERNAL_SERVER_ERROR,message,null);
    }

    /**
     * 创建返回信息封装，枚举转换
     * @param resultCode 返回码
     * @param message 返回信息
     * @param data 返回参数
     * @return BaseResult
     */
    public static BaseResult buildResult(ResultCode resultCode, String message, Object data) {
        return buildResult(resultCode.code, message, data);
    }

    /**
     * 创建返回信息封装
     * @param resultCode 返回码
     * @param message 返回信息
     * @param data 返回参数
     * @return BaseResult
     */
    public static BaseResult buildResult(int resultCode,String message, Object data){
        return new BaseResult(resultCode,message,data);
    }

}
