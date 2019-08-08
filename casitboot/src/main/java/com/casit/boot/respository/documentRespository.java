package com.casit.boot.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.casit.boot.bean.document;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface documentRespository extends MongoRepository<document,Long> {
    document findByContent(String content);
}
