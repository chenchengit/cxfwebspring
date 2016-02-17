package com.rvho.cxfserver.ws.impl;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.rvho.cxfserver.dao.HelloDao;
import com.rvho.cxfserver.ws.HelloWS;

@WebService(endpointInterface = "com.rvho.cxfserver.ws.HelloWS", portName = "HelloWSPort", serviceName = "HelloWSService", targetNamespace = "http://www.tmp.com/services/hello")
@Service("helloWS")
public class HelloWSImpl implements HelloWS {
	@Resource
	private HelloDao helloDao;

	@Override
	public String welcome(String name) {
		return helloDao.welcome(name);
	}
}
