package com.tmdev.jpa.relationship.comparison;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movie")
    public List<MovieDto> getAll() {
        return movieService.getAll();
    }

    @GetMapping("/movie/names")
    public List<MovieNameDto> getAllNames() {
        return movieService.getAllNames();
    }
}
