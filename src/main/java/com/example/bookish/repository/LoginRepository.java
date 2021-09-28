package com.example.bookish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookish.model.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity,Integer> {

	@Query(value = "SELECT * FROM LOGIN WHERE FIRST_NAME = ?1 AND PASSWORD = ?2", nativeQuery = true)
	LoginEntity findUser(String userName,String password);
}
