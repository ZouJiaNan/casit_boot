package com.casit.boot.service;

import java.util.List;
import com.casit.boot.bean.t_user;
public interface userService {
    List<t_user> list();
    t_user get();
    void delete();
    void edit();
}
