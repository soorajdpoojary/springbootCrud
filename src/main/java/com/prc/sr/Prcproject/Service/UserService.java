package com.prc.sr.Prcproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prc.sr.Prcproject.Repo.UserRepo;
import com.prc.sr.Prcproject.dao.UserDao;
import com.prc.sr.Prcproject.dto.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	UserRepo repo;

	public User saveUser(User user) {
		return userDao.saveUser(user);
	}

	public User udateUser(int id, User user) {
		User user2 = repo.getById(id);

		if (user2 != null) {
			return userDao.updateUser(user);
		} else {
			throw null;
		}
	}

	public User getUser(int id) {
		return userDao.findUserById(id);
	}

	public String deleteUser(int id) {
		return userDao.deleteUser(id);
		
	}
}
