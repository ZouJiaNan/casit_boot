package com.casit.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.casit.boot.respository.documentRespository;
import com.casit.boot.bean.document;
import java.util.List;

@RestController
public class documentController {
    @Autowired
    documentRespository respository;

    @RequestMapping("/insert")
    public void insert(){
        respository.insert(new document("test"));
    }

    @RequestMapping("/findAll")
    public List<document> findAll(){
        return respository.findAll();
    }

    @RequestMapping("/findByContent")
    public document findByContent(){
//        System.out.println(respository.findByContent("test").getContent());
        return respository.findByContent("test");
    }


}
