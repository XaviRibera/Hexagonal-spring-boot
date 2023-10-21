package com.hexagonal.movies.application.usecases;

import java.util.List;
import java.util.Optional;

import com.hexagonal.movies.domain.models.Movie;
import com.hexagonal.movies.domain.ports.in.RetrieveMovieUseCase;
import com.hexagonal.movies.domain.ports.out.MovieRepositoryPort;

public class RetriveMovieUseCaseImpl implements RetrieveMovieUseCase{
    private final MovieRepositoryPort movieRepositoryPort;

    public RetriveMovieUseCaseImpl(MovieRepositoryPort movieRepositoryPort) {
        this.movieRepositoryPort = movieRepositoryPort;
    }

    @Override
    public Optional<Movie> getMovie(int id) {
        return movieRepositoryPort.findById(id);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepositoryPort.getAll();
    }

    
}
