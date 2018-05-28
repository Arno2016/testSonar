package com.harvey.www.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleException {
	
	@ExceptionHandler(ValidatorException.class)
	public void processValidatorException(ValidatorException ex) {
		System.out.println("验证错误信息：code:"+ex.getCode()+",msg:{"+ex.getMsg()+"}");
	}
	
	@ExceptionHandler(Exception.class)
	public void processException(Exception ex) {
		System.out.println(ex.getMessage());
	}
}
