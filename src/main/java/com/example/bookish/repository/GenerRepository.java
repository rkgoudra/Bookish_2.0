package com.example.bookish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookish.model.GenerEntity;

@Repository
public interface GenerRepository extends JpaRepository<GenerEntity, Integer> {

}
