package com.hexagonal.movies.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonal.movies.domain.models.Movie;
import com.hexagonal.movies.infrastructure.entities.MovieEntity;

public interface JpaMovieRepository extends JpaRepository<MovieEntity, Long>{

    MovieEntity save(Movie movie);
    
}
