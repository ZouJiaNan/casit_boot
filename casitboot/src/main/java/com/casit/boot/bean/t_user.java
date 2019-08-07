package com.casit.boot.bean;

import java.util.List;

public class t_user {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String nickName;
    private String mobile;
    private String email;
    private String address;
    private String street;
    private String sex;
    private String passStrength;
    private String avatar = "1";
    private Integer type = 1;
    private Integer status = 1;
    private String description;
    private String departmentId;
    private String departmentTitle;
    private List roles;
    private List permissions;
    private Integer defaultRole;
}
