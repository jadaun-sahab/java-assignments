package com.masai.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createNewUser(User user) throws UserException {
		Optional<User> user2 = userRepository.findById(user.getUserId());

		if (user2 != null)
			throw new UserException("User Already Registered ");

		return userRepository.save(user);
	}

	@Override
	public User loginUser(String email, String password) throws UserException {
		User user = userRepository.findByEmail(email);

		if (user == null)
			throw new UserException("Incorrect Credintial");

		return user;
	}

	@Override
	public User createCustomer(User customer) throws UserException {
		
		return null;
	}

}

