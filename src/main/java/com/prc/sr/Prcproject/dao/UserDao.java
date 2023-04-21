package com.prc.sr.Prcproject.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prc.sr.Prcproject.Repo.UserRepo;
import com.prc.sr.Prcproject.dto.User;

@Repository
public class UserDao {

	@Autowired
	private UserRepo userRepo;

	public User saveUser(User user) {
		return userRepo.save(user);
	}

	public User updateUser(User user) {
		return userRepo.save(user);
	}
	
	public User findUserById(int id) {
		return userRepo.findById(id).get();
	}
	
	public String deleteUser(int id) {
		userRepo.deleteById(id);
		return "Deleted";
	}
}
