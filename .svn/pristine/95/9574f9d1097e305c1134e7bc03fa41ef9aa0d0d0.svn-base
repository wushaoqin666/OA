package com.oa.action;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.oa.entity.tb_user;
import com.oa.service.impl.login_serimpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	
	@Autowired
	private login_serimpl login_serimpl;
	
	
	
	
	
	private String  username;
	private String password;
	private Integer id;
	
	
	public String tologin(){
		Set<String> url=login_serimpl.login(username, password);
		ActionContext req=ActionContext.getContext();
		if(url==null||url.size()==0) {
			req.put("mas", "当前用户无权登陆");
			return "no";
		}else {
			Map<String, Object> session=ActionContext.getContext().getSession();
			session.put("url", url);
			return "ok";
		}
		
	}

	//public String show
	
	public String saved_resource() {
		List<tb_user> list=login_serimpl.list();
		ActionContext req=ActionContext.getContext();
		req.put("list", list);
		return "ok";
	}

	/*public String userUp() {
		tb_user user=;
		ActionContext req2=ActionContext.getContext();
		req2.put("user", user);
		return "ok";
	}
	*/
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public login_serimpl getLogin_serimpl() {
		return login_serimpl;
	}



	public void setLogin_serimpl(login_serimpl login_serimpl) {
		this.login_serimpl = login_serimpl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}




}
