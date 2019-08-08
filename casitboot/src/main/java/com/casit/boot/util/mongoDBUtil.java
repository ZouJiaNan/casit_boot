package com.casit.boot.util;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class mongoDBUtil {
    public  String localhost;
    public  int port;
    public  String dataBaseName;
    public  String collectionName;

    public mongoDBUtil(String sendlocalhost, int sendport, String senddataBaseName, String sendcollectionName){
        localhost=sendlocalhost;
        port=sendport;
        dataBaseName=senddataBaseName;
        collectionName=sendcollectionName;
    }

    public MongoCollection getConllection(){
        MongoClient mongoClient=new MongoClient(localhost,port);
        MongoDatabase mongoDatabase=mongoClient.getDatabase(dataBaseName);
        MongoCollection<Document> mongoCollection=mongoDatabase.getCollection(collectionName);
        return mongoCollection;
    }
}
