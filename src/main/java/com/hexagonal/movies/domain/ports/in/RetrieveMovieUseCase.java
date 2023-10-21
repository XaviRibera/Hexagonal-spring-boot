package com.hexagonal.movies.domain.ports.in;

import java.util.List;
import java.util.Optional;

import com.hexagonal.movies.domain.models.Movie;

public interface RetrieveMovieUseCase {
    Optional<Movie> getMovie(int id);
    List<Movie> getAllMovies();
}
