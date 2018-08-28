package com.oa.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oa.dao.impl.Tb_newsDaoImpl;
import com.oa.entity.Tb_news;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Tb_newsAction extends ActionSupport{
	private int id;
	private List<Tb_news> tb_newsList;
	private Tb_news tb_news;
	@Autowired
	private Tb_newsDaoImpl tb_newsDaoImpl;
	
	public String xinwenlist(){
		List<Tb_news> list = tb_newsDaoImpl.show();
		ActionContext.getContext().put("list", list);
		return "xinwenlist";
				
	}
	public String showById(){
		tb_news =tb_newsDaoImpl.showById(id);
		return "showById";
				
	}
	
	public String updatenews(){
		tb_newsDaoImpl.updatenews(tb_news);
		return "updatenews";
				
	}
	public String addnews(){
		tb_newsDaoImpl.addnews(tb_news);
		return "addupdate";
				
	}
	public String add(){
		
		return "add";
				
	}
			
	public Tb_newsDaoImpl getTb_newsDaoImpl() {
		return tb_newsDaoImpl;
	}


	public void setTb_newsDaoImpl(Tb_newsDaoImpl tb_newsDaoImpl) {
		this.tb_newsDaoImpl = tb_newsDaoImpl;
	}

	public List<Tb_news> getTb_newsList() {
		return tb_newsList;
	}

	public void setTb_newsList(List<Tb_news> tb_newsList) {
		this.tb_newsList = tb_newsList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Tb_news getTb_news() {
		return tb_news;
	}
	public void setTb_news(Tb_news tb_news) {
		this.tb_news = tb_news;
	}
	
	

	
	
}
