package com.hexagonal.movies.domain.ports.in;

import java.util.Optional;

import com.hexagonal.movies.domain.models.Movie;

public interface UpdateMovieUseCase {
    Optional<Movie> updateMovie(int id, Movie movie);
}
