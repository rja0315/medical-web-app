package com.rja0315.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rja0315.entity.Record;
import com.rja0315.entity.User;

public interface RecordRepository extends JpaRepository<Record, Integer> {

List<Record> findByUser(User user); 
}
