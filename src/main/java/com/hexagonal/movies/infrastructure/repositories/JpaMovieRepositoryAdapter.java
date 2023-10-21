package com.hexagonal.movies.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexagonal.movies.domain.models.Movie;
import com.hexagonal.movies.domain.ports.out.MovieRepositoryPort;
import com.hexagonal.movies.infrastructure.entities.MovieEntity;

public class JpaMovieRepositoryAdapter implements MovieRepositoryPort{

    @Autowired
    private final JpaMovieRepository jpaMovieRepository;


    @Override
    public Movie save(Movie movie) {
        MovieEntity movieEntity = MovieEntity.fromDomainModel(movie);
        MovieEntity savedMovieEntity = jpaMovieRepository.save(movieEntity);
        return savedMovieEntity.toDamainModel();
    }

    @Override
    public Optional<Movie> findById(int id) {
        return jpaMovieRepository.findById(id);
    }

    @Override
    public List<Movie> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Optional<Movie> update(Movie movie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean deleteById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
