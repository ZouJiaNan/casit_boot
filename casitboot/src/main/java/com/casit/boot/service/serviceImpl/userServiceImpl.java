package com.casit.boot.service.serviceImpl;
import com.casit.boot.bean.t_user;
import com.casit.boot.service.userService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.casit.boot.mapper.userMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements  userService{
    @Autowired
    userMapper mapper;

    @Override
    public List<t_user> list() {
        return mapper.list();
    }

    @Override
    public t_user get() {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}
