package com.harvey.www.Exception;

public class ValidatorException extends Exception{
	
	private static final long serialVersionUID = 9165071317983671444L;
	
	private String code;
	private String msg;
	public ValidatorException(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	public ValidatorException(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
