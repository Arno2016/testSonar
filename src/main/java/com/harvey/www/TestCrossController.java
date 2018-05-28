package com.harvey.www;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin //支持跨域
public class TestCrossController {
	
	@RequestMapping(value = "/testGet",method = RequestMethod.GET)
	public String testGet() {
		return "this is test get method return";
	}
	
	@RequestMapping(value = "/testPost",method = RequestMethod.POST)
	public String testPost() {
		return "this is test post method return";
	}
}
