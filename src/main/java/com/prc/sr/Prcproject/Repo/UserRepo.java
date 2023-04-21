package com.prc.sr.Prcproject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prc.sr.Prcproject.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
