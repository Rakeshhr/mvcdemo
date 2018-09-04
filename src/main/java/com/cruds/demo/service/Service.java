package com.cruds.demo.service;

import com.cruds.demo.dao.insertDao;

public class Service {
	
	public static boolean create(String FirstName,String LastName)
	{
		insertDao dao = new insertDao();
		return dao.create(FirstName,LastName);
	}
}
