package com.casit.boot.bean;


/**
 * @author Dawn
 */

public class User {
    private String UserName;
    private String password;


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
