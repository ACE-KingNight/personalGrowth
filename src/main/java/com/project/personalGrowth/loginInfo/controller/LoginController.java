package com.project.personalGrowth.loginInfo.controller;

import com.project.personalGrowth.base.entity.BaseResult;
import com.project.personalGrowth.base.util.ResultFactory;
import com.project.personalGrowth.loginInfo.entity.LoginInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

/**
 * @program: personalGrowth
 * @description: 系统登录控制器
 * @author: WangZhenXin
 * @create: 2020-05-19 14:44
 * @memo 备注信息
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {


    /**
     * 登录控制器
     * @param loginInfo 登录信息
     * @param bindingResult 登录验证请求
     * @return BaseResult
     */
    @CrossOrigin
    @RequestMapping(value = "login.json",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    @ResponseBody
    public BaseResult login(@Valid @RequestBody LoginInfo loginInfo, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultFactory.buildFailResult("登录失败："+ Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        }
        if (loginInfo.getUsername().equals("admin") && loginInfo.getPassword().equals("1234")){
            return ResultFactory.buildSuccessResult("登录成功");
        }else {
            return ResultFactory.buildFailResult("登录失败：用户名不存在或密码信息不正确");
        }
    }

    @CrossOrigin
    @RequestMapping(value = "register.json",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    @ResponseBody
    public BaseResult register(@Valid @RequestBody LoginInfo loginInfo, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultFactory.buildFailResult("注册失败:"+ Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        }
        loginInfo.setAddress("test");
        loginInfo.setIdNo("sss");
        loginInfo.setIdType("2");
        loginInfo.setSex("1");
        loginInfo.setUserStatus("1");
        loginInfo.save();
        return ResultFactory.buildSuccessResult("注册成功");
    }




}
