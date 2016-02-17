package com.rvho.cxfserver.dao.impl;

import org.springframework.stereotype.Repository;

import com.rvho.cxfserver.dao.HelloDao;

@Repository("helloDao")
public class HelloDaoImpl implements HelloDao {

	@Override
	public String welcome(String name) {
		return "欢迎使用CXF！" + name;
	}
}