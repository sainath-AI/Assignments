package com.example.retrofitassignment_02;

import java.io.Serializable;

public class ResponseModel implements Serializable {

	private int id;

	private String title;

	private int userId;

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public int getUserId(){
		return userId;
	}
}