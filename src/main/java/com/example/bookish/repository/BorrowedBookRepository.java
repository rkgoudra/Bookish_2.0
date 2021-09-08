package com.example.bookish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookish.model.BorrowedBookEntity;

public interface BorrowedBookRepository extends JpaRepository<BorrowedBookEntity, Integer> {

}
