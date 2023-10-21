package com.hexagonal.movies.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.hexagonal.movies.domain.models.Movie;

public interface MovieRepositoryPort {
    Movie save(Movie movie);
    Optional<Movie> findById(int id);
    List<Movie> getAll();
    Optional<Movie> update(Movie movie);
    boolean deleteById(int id);
}
