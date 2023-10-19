package com.hexagonal.movies.domain.models;

import lombok.Getter;

@Getter
public class AdditionalMovieInfo {
    private final int id;
    private final String title;
    private final int year;
    private final String image;
    private final int runtime;
    private final String description;
    private final int director_id;

    public AdditionalMovieInfo(int id, String title, int year, String image, int runtime, String description, int director_id) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.image = image;
        this.runtime = runtime;
        this.description = description;
        this.director_id = director_id;
    }

    
}
