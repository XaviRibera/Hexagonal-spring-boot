package com.hexagonal.movies.application.usecases;

import java.util.Optional;

import com.hexagonal.movies.domain.models.Movie;
import com.hexagonal.movies.domain.ports.in.UpdateMovieUseCase;
import com.hexagonal.movies.domain.ports.out.MovieRepositoryPort;

public class UpdateMovieUseCaseImpl implements UpdateMovieUseCase{
    private final MovieRepositoryPort movieRepositoryPort;

    public UpdateMovieUseCaseImpl(MovieRepositoryPort movieRepositoryPort) {
        this.movieRepositoryPort = movieRepositoryPort;
    }

    @Override
    public Optional<Movie> updateMovie(int id, Movie movie) {
        return movieRepositoryPort.update(movie);
    }

    
}
