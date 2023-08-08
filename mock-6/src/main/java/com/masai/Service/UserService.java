package com.masai.Service;

import com.masai.exception.UserException;
import com.masai.model.User;

public interface UserService {
	public User createNewUser(User user) throws UserException;
	public User loginUser(String email,String password) throws UserException;
	public User createCustomer(User customer)throws UserException;
}
