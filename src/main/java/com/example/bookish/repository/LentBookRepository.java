package com.example.bookish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookish.model.LentBookEntity;

@Repository
public interface LentBookRepository extends JpaRepository<LentBookEntity, Integer> {

}
