package com.tmdev.jpa.relationship.comparison;

public class MovieNameDto {

    private Integer id;

    private String movieName;

    public MovieNameDto(Integer id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

}

