package com.hexagonal.movies.application.usecases;

import com.hexagonal.movies.domain.models.Movie;
import com.hexagonal.movies.domain.ports.in.CreateMovieUseCase;
import com.hexagonal.movies.domain.ports.out.MovieRepositoryPort;

public class CreateMovieUseCaseImpl implements CreateMovieUseCase{
    
    private final MovieRepositoryPort movieRepositoryPort;

    public CreateMovieUseCaseImpl(MovieRepositoryPort movieRepositoryPort) {
        this.movieRepositoryPort = movieRepositoryPort;
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepositoryPort.save(movie);
    }

    
}
