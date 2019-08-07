package com.casit.boot.service.serviceImpl;

import com.casit.boot.bean.Category;
import com.casit.boot.mapper.categoryMapper;
import com.casit.boot.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class categoryServiceImpl implements categoryService{
    @Autowired
    categoryMapper mapper;

    @Override
    public List<Category> list() {
        return mapper.list();
    }

    @Override
    public List<Category> get(Category category) {
        return mapper.get(category);
    }

    @Override
    public void add(Category category) {
        mapper.add(category);
    }

    @Override
    public Category edit(Category category) {
        return null;
    }

    @Override
    public Category delete(Category category) {
        return null;
    }
}
