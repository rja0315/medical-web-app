package com.rja0315.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rja0315.entity.Item;
import com.rja0315.entity.Record;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	List<Item> findByRecord(Record record, Pageable pageable);
}
