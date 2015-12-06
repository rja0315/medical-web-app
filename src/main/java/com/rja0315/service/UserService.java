package com.rja0315.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.rja0315.entity.Item;
import com.rja0315.entity.Record;
import com.rja0315.entity.User;
import com.rja0315.repository.ItemRepository;
import com.rja0315.repository.RecordRepository;
import com.rja0315.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();

	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}

	@Transactional
	public User findOneWithRecords(int id) {
		User user = findOne(id);
		List<Record> records = recordRepository.findByUser(user);
		for(Record record : records){
			List<Item> items = itemRepository.findByRecord(record, new PageRequest(0, 10, Direction.DESC, "publisheddate"));
			record.setItems(items);
		}
		user.setRecords(records);
		return user;
	}

	public void save(User user) {
userRepository.save(user);		
	}
	
	
}
