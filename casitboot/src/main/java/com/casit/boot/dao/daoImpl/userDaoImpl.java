package com.casit.boot.dao.daoImpl;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.springframework.stereotype.Component;
import com.casit.boot.dao.userDao;
import com.casit.boot.util.mongoDBUtil;

import java.util.ArrayList;
import java.util.List;

@Component
public class userDaoImpl implements userDao{

    mongoDBUtil util;
    {
        util=new mongoDBUtil(
                "localhost",
                27017,
                "test",
                "testcollection");
    }

    public void insert(){
        MongoCollection collection=util.getConllection();
        Document document=new Document("username","zou").append("age",18);
        List<Document> documents=new ArrayList<Document>();
        documents.add(document);
        collection.insertMany(documents);
    }

    public void quary(){
        MongoCollection collection=util.getConllection();
        //条件
        Document document=new Document("username","zou").append("age",18);
        //获取迭代器
        FindIterable<Document> findIterable=collection.find(document);
        //获取迭代游标
        MongoCursor<Document> mongoCursor=findIterable.iterator();
        //执行迭代检索文档
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
    }

    public void update(){
        MongoCollection collection=util.getConllection();
        collection.updateMany(Filters.eq("age",18),new Document("$set",new Document("age",20)));

    }

    public void delete(){
        MongoCollection collection=util.getConllection();
        collection.deleteMany(Filters.eq("age",20));
    }

}
