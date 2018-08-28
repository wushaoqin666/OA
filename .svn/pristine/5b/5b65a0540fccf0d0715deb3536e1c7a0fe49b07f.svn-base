package com.oa.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oa.entity.Tb_social_insurance;
import com.oa.service.impl.Tb_Social_InsuranceServiceImpl;
import com.oa.utils.Page;

public class BaoBiaoAction {
	@Autowired
	private Tb_Social_InsuranceServiceImpl tb_Social_InsuranceServiceImpl;
	
	private Page<Tb_social_insurance> page;
	private String now;
	private String size;
	private String name;
	private String idCard;
	private String sbCard;
	

	public String sheBaoCount(){
		page=tb_Social_InsuranceServiceImpl.sheBaoPage(now, size, name, idCard, sbCard);
		return "sheBaoCount";
	}
	
	public String gongJiJinCount(){
			
			return "gongJiJinCount";
	}


	public String gongZiCount(){
	
		return "gongZiCount";
	}


	public String renCaiCount(){
		
		return "renCaiCount";
	}


	public String caiWuCount(){
		
		return "caiWuCount";
	}
	
	

	public Page<Tb_social_insurance> getPage() {
		return page;
	}

	public void setPage(Page<Tb_social_insurance> page) {
		this.page = page;
	}

	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSbCard() {
		return sbCard;
	}

	public void setSbCard(String sbCard) {
		this.sbCard = sbCard;
	}

}
