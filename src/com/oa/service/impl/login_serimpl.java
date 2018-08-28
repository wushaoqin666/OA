package com.oa.service.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.service.login_ser;

import com.oa.dao.impl.loginimpl;

import com.oa.entity.Tb_system_function;

import com.oa.entity.tb_system_role;
import com.oa.entity.tb_user;
@Service
public class login_serimpl implements login_ser{

	@Autowired
	private loginimpl loginimpl;
	
	
	
	
	
	
	public loginimpl getLoginimpl() {
		return loginimpl;
	}

	public void setLoginimpl(loginimpl loginimpl) {
		this.loginimpl = loginimpl;
	}

	
	@Override
	public Set<String> login(String username,String password) {
		//查询用户
		tb_user t=loginimpl.selectuser(username, password);
		//遍历role集合
		
		if(t!=null) {
			Iterator<tb_system_role> role=t.getRole().iterator();
			//定义set集合存放网址
			Set<String> urls=new HashSet<>();
			while(role.hasNext()) {
				//遍历function集合
				Iterator<Tb_system_function> function=role.next().getFunction().iterator();
				while(function.hasNext()) {
					//取得网址注入set集合防重复
					String url=function.next().getFuncurl();
					System.out.println(url);
					urls.add(url);
				}
			}
			return urls;
		}return null;
		
	}

	@Override
	public List<tb_user> list() {
		// TODO Auto-generated method stub
		return loginimpl.list();
	}

	@Override
	public List<tb_user> showusers(String name, String phone,Integer status) {
		// TODO Auto-generated method stub
		return loginimpl.showusers(name, phone,status);
	}

	@Override
	public tb_user userByName(String name) {
		// TODO Auto-generated method stub
		return loginimpl.userByName(name);
	}
	
	
	
	
	
	

}
