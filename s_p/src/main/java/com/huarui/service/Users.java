package com.huarui.service;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/8.
 */
public class Users implements Serializable{

    private Integer uid;
    private String uname;

    public Users() {
    }

    public Users(Integer uid, String uname) {

        this.uid = uid;
        this.uname = uname;
    }

    public Integer getUid() {

        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
