package com.yggrasillwebendterm.webendterm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepostory movieRepostory;
    public List<Movie> allMovies(){
        return movieRepostory.findAll();
    }
}
