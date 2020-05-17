package com.tmdev.jpa.relationship.comparison;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private Logger logger = LoggerFactory.getLogger(MovieService.class);

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieDto> getAll() {
        List<MovieDto> allMovies = new ArrayList<>();
        List<Movie> all = movieRepository.findAllMoviesWithHeroes();
        logger.info("*********** Will fill the DTO ***********");
        all.forEach(i -> allMovies.add(new MovieDto(i.getId(), i.getMovieName(), i.hero.getHeroName())));
        return allMovies;
    }

    public List<MovieNameDto> getAllNames() {
        List<MovieNameDto> allMovies = new ArrayList<>();
        List<Movie> all = movieRepository.findAll();
        logger.info("*********** Will fill the DTO ***********");
        all.forEach(i -> allMovies.add(new MovieNameDto(i.getId(), i.getMovieName())));
        return allMovies;
    }
}
