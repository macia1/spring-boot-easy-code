package com.easy.springbooteasycode.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Test)实体类
 *
 * @author makejava
 * @since 2022-03-07 23:34:04
 */
public class Test implements Serializable {
    private static final long serialVersionUID = 273779358115590910L;
    
    private Integer id;
    
    private String username;
    
    private String sex;
    
    private Date birthday;
    
    private String address;
    
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

