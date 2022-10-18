package com.example.movieservice.controller;

import com.example.movieservice.controller.model.Movie;
import com.example.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

  @Autowired
  MovieService movieService;

  @GetMapping("/movies")
  public ResponseEntity<List<String>> getMovies() {
    return new ResponseEntity<>(movieService.getMovies(), HttpStatus.OK);
  }

  @GetMapping("/movie/{movieName}")
  public ResponseEntity<Movie> getMovieDetails(@PathVariable String movieName) {
    return new ResponseEntity<>(movieService.getMovieDetails(movieName), HttpStatus.OK);
  }


}
