package com.tmdev.jpa.relationship.comparison;

public class MovieDto {

    private Integer id;

    private String movieName;

    private String heroName;

    public MovieDto(Integer id, String movieName, String heroName) {
        this.id = id;
        this.movieName = movieName;
        this.heroName = heroName;
    }

    public MovieDto(Integer id, String movieName) {
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

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
