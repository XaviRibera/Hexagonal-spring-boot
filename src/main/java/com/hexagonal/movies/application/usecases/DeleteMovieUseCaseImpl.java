package com.hexagonal.movies.application.usecases;

import com.hexagonal.movies.domain.ports.in.DeleteMovieUseCase;
import com.hexagonal.movies.domain.ports.out.MovieRepositoryPort;

public class DeleteMovieUseCaseImpl implements DeleteMovieUseCase{
    
    private final MovieRepositoryPort movieRepositoryPort;

    public DeleteMovieUseCaseImpl(MovieRepositoryPort movieRepositoryPort) {
        this.movieRepositoryPort = movieRepositoryPort;
    }

    @Override
    public boolean deleteMovie(int id) {
        return movieRepositoryPort.deleteById(id);
    }

    
}
