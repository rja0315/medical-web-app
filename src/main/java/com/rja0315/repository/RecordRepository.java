package com.rja0315.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rja0315.entity.Record;

public interface RecordRepository extends JpaRepository<Record, Integer> {

}
