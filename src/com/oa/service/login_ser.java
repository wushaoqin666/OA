package com.oa.service;


import java.util.List;
import java.util.Set;

import com.oa.entity.tb_user;


public interface login_ser {


	Set<String> login(String username, String password);

	List<tb_user> list();//查询所有用户
	List<tb_user> showusers(String name,String phon,Integer status);//模糊查询个别用户
	
	
	tb_user userByName(String name);
}