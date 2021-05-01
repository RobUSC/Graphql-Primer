package com.robcodes.graphqlprimer.repository;

import com.robcodes.graphqlprimer.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
