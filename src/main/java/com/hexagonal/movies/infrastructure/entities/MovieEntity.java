package com.hexagonal.movies.infrastructure.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.hexagonal.movies.domain.models.Movie;

import lombok.Getter;

@Entity
@Getter
public class MovieEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int year;
    private String image;
    private int runtime;
    private String description;
    private int director_id;

    public MovieEntity(){

    }

    public MovieEntity(int id, String title, int year, String image, int runtime, String description, int director_id) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.image = image;
        this.runtime = runtime;
        this.description = description;
        this.director_id = director_id;
    }

    public static MovieEntity fromDomainModel(Movie movie){
        return new MovieEntity(movie.getId(), movie.getTitle(), movie.getYear(), movie.getImage(), movie.getRuntime(), movie.getDescription(), movie.getDirector_id());
    }

    public Movie toDamainModel(){
        return new Movie(id, title, year, image, runtime, description, director_id);
    }
}
