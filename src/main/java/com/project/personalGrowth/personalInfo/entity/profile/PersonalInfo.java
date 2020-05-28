package com.project.personalGrowth.personalInfo.entity.profile;


import com.project.personalGrowth.base.entity.BaseModel;
import io.ebean.Finder;

import javax.persistence.Entity;

@Entity
public class PersonalInfo extends BaseModel {

    //定义静态查找finder类
    public static final Finder<Long,PersonalInfo> finder = new Finder<>(PersonalInfo.class);

    private String name;

    private String age;

    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
