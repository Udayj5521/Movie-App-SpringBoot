package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.model.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    @Override
    @Query(value = "SELECT * FROM movie.movies ORDER BY year",nativeQuery = true)
    List<Movie> findAll();

    @Query(value="SELECT * FROM movie.movies WHERE name like %:keyword%  or genre like %:keyword%",nativeQuery = true)
    List<Movie> findByKeyword(@Param("keyword") String keyword);
}
