package com.naya.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by Evegeny on 03/06/2017.
 */
public interface SerialUserDao extends MongoRepository<SerialsUser, Long> {

    @RestResource(path = "byage")
    List<SerialsUser> findByAgeGreaterThan(@Param("age") int age);

}
