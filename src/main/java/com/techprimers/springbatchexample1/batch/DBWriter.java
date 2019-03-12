package com.techprimers.springbatchexample1.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techprimers.springbatchexample1.Repository.UserRepository;
import com.techprimers.springbatchexample1.model.User;

@Component
public class DBWriter implements ItemWriter<User>{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Data saved for Users: "+users);
		userRepository.save(users);
		
		
	}
	
	

}
