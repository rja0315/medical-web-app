package com.rja0315.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rja0315.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
