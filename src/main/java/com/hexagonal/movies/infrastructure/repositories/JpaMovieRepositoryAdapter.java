package com.hexagonal.movies.infrastructure.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.hexagonal.movies.domain.models.Movie;
import com.hexagonal.movies.domain.ports.out.MovieRepositoryPort;
import com.hexagonal.movies.infrastructure.entities.MovieEntity;

public class JpaMovieRepositoryAdapter implements MovieRepositoryPort{

    private final JpaMovieRepository jpaMovieRepository;
    
    public JpaMovieRepositoryAdapter(JpaMovieRepository jpaMovieRepository) {
        this.jpaMovieRepository = jpaMovieRepository;
    }

    @Override
    public Movie save(Movie movie) {
        MovieEntity movieEntity = MovieEntity.fromDomainModel(movie);
        MovieEntity savedMovieEntity = jpaMovieRepository.save(movieEntity);
        return savedMovieEntity.toDamainModel();
    }

    @Override
    public Optional<Movie> findById(int id) {
        return jpaMovieRepository.findById(id).map(MovieEntity::toDamainModel);
    }

    @Override
    public List<Movie> getAll() {
        return jpaMovieRepository.findAll().stream()
                .map(MovieEntity::toDamainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Movie> update(Movie movie) {
        if(jpaMovieRepository.existsById(movie.getId())){
            MovieEntity movieEntity = MovieEntity.fromDomainModel(movie);
            MovieEntity updateMovieEntity = jpaMovieRepository.save(movieEntity);
            return Optional.of(updateMovieEntity.toDamainModel());
        };

        return Optional.empty();
    }

    @Override
    public boolean deleteById(int id) {
        if(jpaMovieRepository.existsById(id)){
            jpaMovieRepository.deleteById(id);
            return true;
        }

        return false;
    }
    
}
