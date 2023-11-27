package com.yggrasillwebendterm.webendterm;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepostory extends MongoRepository<Movie, ObjectId> {
}