package com.harvey.www;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.harvey.www.Exception.ValidatorException;
import com.harvey.www.util.ValidatorUtils;

@RestController
public class TestValidateController {
	
	@RequestMapping(value= "index",method = RequestMethod.GET)
	public User index(User user) throws ValidatorException {
		
		ValidatorUtils.validateBean(user);
		
		System.out.println(user);
		
		return user;
		
	}
}
