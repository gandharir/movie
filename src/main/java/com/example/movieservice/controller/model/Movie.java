package com.example.movieservice.controller.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Movie {
  private String name;
  private String hero;
  private LocalDate releaseDate;
  private Double rating;
}
