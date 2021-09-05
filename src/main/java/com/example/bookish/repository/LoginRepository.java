package com.example.bookish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookish.model.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity,Integer> {

}
