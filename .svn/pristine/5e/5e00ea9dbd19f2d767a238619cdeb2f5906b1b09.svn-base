package com.oa.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.oa.entity.Tb_email_template;
import com.oa.service.impl.youJianServiceImpl;
import com.oa.utils.Page;
import com.opensymphony.xwork2.ActionSupport;

public class youJianAction extends ActionSupport{
	@Autowired
	private youJianServiceImpl youJianService;
	
	private Page<Tb_email_template> youJianPage;
	private Tb_email_template youJian;
	private Integer id;
	private String subject;
	private String now;
	private String size;
	/**
	 * 进入到邮件模板列表页面
	 * @return
	 */
	public String youJianList(){
		youJianPage=youJianService.youJianPage(now, size, subject);
		return "youJianList";
	}
	/**
	 * 进入到添加邮件页面
	 * @return
	 */
	public String addYouJian(){
		return "addYouJian";
	}
	/**
	 * 添加邮件
	 * @return
	 */
	public String toAddYouJian(){
		youJianService.addYouJian(youJian);
		return "toAddYouJian";
	}
	/**
	 * 进入到修改邮件页面
	 * @return
	 */
	public String upYouJian(){
		youJian=youJianService.youJianById(id);
		return "upYouJian";
	}
	/**
	 * 修改邮件
	 * @return
	 */
	public String toUpYouJian(){
		youJianService.upYouJian(youJian);
		 return "toUpYouJian";
	}
	/**
	 * 删除邮件模板信息
	 * @return
	 */
	public String delYouJian(){
		youJianService.delYouJian(id);
		return "delYouJian";
	}
	
	
	
	
	
	
	public Page<Tb_email_template> getYouJianPage() {
		return youJianPage;
	}
	public void setYouJianPage(Page<Tb_email_template> youJianPage) {
		this.youJianPage = youJianPage;
	}
	public Tb_email_template getYouJian() {
		return youJian;
	}
	public void setYouJian(Tb_email_template youJian) {
		this.youJian = youJian;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
