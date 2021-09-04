package com.example.bookish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookish.model.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer>{

}
