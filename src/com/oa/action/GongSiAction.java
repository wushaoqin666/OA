package com.oa.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.oa.entity.Tb_company;
import com.oa.service.impl.GongSiServiceImpl;
import com.oa.utils.Page;
import com.opensymphony.xwork2.ActionSupport;

public class GongSiAction extends ActionSupport{
	@Autowired
	private GongSiServiceImpl gongsiService;
	private Page<Tb_company> gongSiPage;
	private Tb_company gongSi;
	private Integer id;
	private String now;
	private String size;
	private String name;
	private String idCard;
	private String companyNo;
	
	public String gongSiList(){
		gongSiPage= gongsiService.gongSiPage(now, size, name, companyNo, idCard);
		return "gongSiList";
	}
	
	
	
	
	
	
	
	
	
	public Page<Tb_company> getGongSiPage() {
		return gongSiPage;
	}
	public void setGongSiPage(Page<Tb_company> gongSiPage) {
		this.gongSiPage = gongSiPage;
	}
	public Tb_company getGongSi() {
		return gongSi;
	}
	public void setGongSi(Tb_company gongSi) {
		this.gongSi = gongSi;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}
	
	
	
}
