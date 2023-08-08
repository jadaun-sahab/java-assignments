package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.masai.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String username);
	User findByPassword(String password);
}
