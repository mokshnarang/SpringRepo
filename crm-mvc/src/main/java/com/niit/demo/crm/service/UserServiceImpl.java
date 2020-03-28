package com.niit.demo.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.demo.crm.dao.UserDAO;
import com.niit.demo.crm.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	@Transactional
	public User checkUser(User theUser) {
		
		return userDao.checkUser(theUser);
	}

}
