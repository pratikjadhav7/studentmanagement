package com.sm.studentmanagement.dto;

public class StudentResponseDTO <T>{

	int statusCode;
	String msg;
	T data;
	
	
	public StudentResponseDTO(int statusCode, String msg, T data) {
		this.statusCode = statusCode;
		this.msg = msg;
		this.data = data;
	}
	
	public StudentResponseDTO() {
		
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
