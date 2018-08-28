package com.oa.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.oa.entity.tb_user;


public class test {
	@Autowired
	private SessionFactory sessionfactory;
	@Test
	public void test1(){
		Object load = sessionfactory.getCurrentSession().load(tb_user.class, 1);
		System.out.println(load);
	}
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	
	
	
}
