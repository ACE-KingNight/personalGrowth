package com.project.personalGrowth.loginInfo.entity;

import com.project.personalGrowth.base.entity.BaseModel;
import io.ebean.Finder;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @program: personalGrowth
 * @description: 登录信息基础类
 * @author: WangZhenXin
 * @create: 2020-05-19 11:30
 * @memo 备注信息
 */
@Entity
@Table(name = "user")
public class LoginInfo extends BaseModel implements Serializable {


    //定义静态查找finder类
    public static final Finder<Long, LoginInfo> finder = new Finder<>(LoginInfo.class);

    private static final long serialVersionUID = -5885003764943534811L;

    @NotNull(message = "登录名不能为空")
    private String loginName;

    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;

    //用户状态
    private String userStatus;

    //证件类型
    private String idType;

    //证件号码
    private String idNo;

    //性别
    private String sex;

    //电话号码
    private String  phone;

    //邮箱
    private String email;

    //地址
    private String address;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
