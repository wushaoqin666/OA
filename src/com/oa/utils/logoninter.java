package com.oa.utils;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 拦截器
 * @author Administrator
 *
 */
public class logoninter implements Interceptor{
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		HttpServletRequest req=ServletActionContext.getRequest();
		String ur=req.getParameter("ur");
		System.out.println(ur);
		Map<String, Object> session=arg0.getInvocationContext().getSession();
		Set<String> url=(Set<String>) session.get("url");
		for (String string : url) {
			if(ur.equals(url)) {
				return arg0.invoke();
			}
		}
		return "login";
	}

	

}
