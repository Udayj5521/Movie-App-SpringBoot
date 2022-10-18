package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.model.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
