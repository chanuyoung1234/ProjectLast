package com.a.project.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.a.project.model.CreateUser;

@Repository
public class CreateDaoImp implements CreateDao{
	@Autowired
	private SqlSessionTemplate sst;
	
	public void insert(CreateUser createuser) {
		int result = sst.insert("createuser.insert", createuser);
		System.out.println("result = "+result);
		
	}
}