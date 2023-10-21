package com.hexagonal.movies.domain.ports.in;

import com.hexagonal.movies.domain.models.Movie;

public interface CreateMovieUseCase {
    Movie creatMovie(Movie movie);
}
