package com.tmdev.jpa.relationship.comparison;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Query("Select m From Movie m Join Fetch m.hero h")
    List<Movie> findAllMoviesWithHeroes();
}
