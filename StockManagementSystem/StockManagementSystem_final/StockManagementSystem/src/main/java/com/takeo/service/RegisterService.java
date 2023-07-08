package com.takeo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.takeo.Entity.Inventory;
import com.takeo.Entity.Register;

@Service
public interface RegisterService {
	public boolean addUser(Register register);

	public Register verifyUser(Register register);

	public Register getUserByEmail(String email);
	
	public boolean updateUser(Register register);

}
