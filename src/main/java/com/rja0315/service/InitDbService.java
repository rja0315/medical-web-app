package com.rja0315.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rja0315.entity.Item;
import com.rja0315.entity.Record;
import com.rja0315.entity.Role;
import com.rja0315.entity.User;
import com.rja0315.repository.ItemRepository;
import com.rja0315.repository.RecordRepository;
import com.rja0315.repository.RoleRepository;
import com.rja0315.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RecordRepository  recordRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostConstruct
	public void init(){
		
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin  = new User();
		userAdmin.setName("Ryan Acklin");
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Record medRecord = new Record();
		medRecord.setName("Patient Record");
		medRecord.setSymptom("Dizzy, Cough, Headache, Sore throat");
		medRecord.setUser(userAdmin);
		recordRepository.save(medRecord);
		
		Item item1 = new Item();
		item1.setRecord(medRecord);
		item1.setTitle("Lack of sleep");
		item1.setLink("http://www.webmd.com");
		item1.setPublisheddate(new Date());
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setRecord(medRecord);
		item2.setTitle("Flu");
		item2.setLink("http://www.webmd.com");
		item2.setPublisheddate(new Date());
		itemRepository.save(item2);
	}
}
	