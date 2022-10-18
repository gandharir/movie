package com.example.movieservice.service;

import com.example.movieservice.controller.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MovieService {

  @Autowired
  RestTemplate restTemplate;
  public List<String> getMovies(){
    return  List.of("KGF","BB","SR");
  }


  public Movie getMovieDetails(String movieName) {
    String url = "http://movie-info-service/api/v1/movie/" + movieName;
    return restTemplate.getForObject(url, Movie.class);
  }
}
