package com.hexagonal.movies.domain.ports.in;

public interface DeleteMovieUseCase {
    boolean deleteMovie(int id);
}
