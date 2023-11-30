package com.hexagonal.movies.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hexagonal.movies.application.services.MovieService;
import com.hexagonal.movies.application.usecases.*;
import com.hexagonal.movies.domain.ports.out.MovieRepositoryPort;

@Configuration
public class ApplicationConfig {
    
    @Bean
    public MovieService movieService(MovieRepositoryPort movieRepositoryPort){
        return new MovieService(
            new CreateMovieUseCaseImpl(movieRepositoryPort), 
            new DeleteMovieUseCaseImpl(movieRepositoryPort),
            new RetriveMovieUseCaseImpl(movieRepositoryPort), 
            new UpdateMovieUseCaseImpl(movieRepositoryPort)
            );
    }
}
