package com.rja0315.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rja0315.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

