package com.hexagonal.movies.application.services;

import java.util.List;
import java.util.Optional;

import com.hexagonal.movies.domain.models.Movie;
import com.hexagonal.movies.domain.ports.in.CreateMovieUseCase;
import com.hexagonal.movies.domain.ports.in.DeleteMovieUseCase;
import com.hexagonal.movies.domain.ports.in.RetrieveMovieUseCase;
import com.hexagonal.movies.domain.ports.in.UpdateMovieUseCase;

public class MovieService implements CreateMovieUseCase,DeleteMovieUseCase,RetrieveMovieUseCase,UpdateMovieUseCase{

    private final CreateMovieUseCase createMovieUseCase;
    private final DeleteMovieUseCase deleteMovieUseCase;
    private final RetrieveMovieUseCase retriveMovieUseCase;
    private final UpdateMovieUseCase updateMovieUseCase;

    public MovieService(CreateMovieUseCase createMovieUseCase,
                        DeleteMovieUseCase deleteMovieUseCase,
                        RetrieveMovieUseCase retriveMovieUseCase,
                        UpdateMovieUseCase updateMovieUseCase) {
        this.createMovieUseCase = createMovieUseCase;
        this.deleteMovieUseCase = deleteMovieUseCase;
        this.retriveMovieUseCase = retriveMovieUseCase;
        this.updateMovieUseCase = updateMovieUseCase;
    }

    @Override
    public Optional<Movie> updateMovie(int id, Movie movie) {
        return updateMovieUseCase.updateMovie(id, movie);
    }

    @Override
    public Optional<Movie> getMovie(int id) {
        return retriveMovieUseCase.getMovie(id);
    }

    @Override
    public List<Movie> getAllMovies() {
        return retriveMovieUseCase.getAllMovies();
    }

    @Override
    public boolean deleteMovie(int id) {
        return deleteMovieUseCase.deleteMovie(id);
    }

    @Override
    public Movie createMovie(Movie movie) {
        return createMovieUseCase.createMovie(movie);
    }
    
}
