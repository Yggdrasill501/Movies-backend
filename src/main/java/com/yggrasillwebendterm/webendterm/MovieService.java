package com.yggrasillwebendterm.webendterm;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepostory movieRepostory;
    public List<Movie> allMovies(){
        return movieRepostory.findAll();
    }
    public Optional<Movie> singleMovie(ObjectId id){
        return movieRepostory.findById(id);
    }
}
