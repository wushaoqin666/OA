package com.oa.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oa.entity.tb_user;
import com.oa.service.impl.login_serimpl;
import com.opensymphony.xwork2.ActionSupport;

public class JsonFrozzy extends ActionSupport{
	@Autowired
	private login_serimpl login_serimpl;
	
	
	private List<tb_user> users;
	private String name;
	private String phone;
	private Integer status;
	
	public String showusers() {
		System.out.println("sjwlked");
		users=new ArrayList<>();
		if(name==null) {
			name="";
		}
		if(phone==null) {
			phone="";
		}
		if(status==null) {
			status=0;
		}
		users=login_serimpl.showusers(name, phone,status);
	
		return "success";
	}

	public login_serimpl getLogin_serimpl() {
		return login_serimpl;
	}

	public void setLogin_serimpl(login_serimpl login_serimpl) {
		this.login_serimpl = login_serimpl;
	}

	public List<tb_user> getUsers() {
		return users;
	}

	public void setUsers(List<tb_user> users) {
		this.users = users;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	
}
