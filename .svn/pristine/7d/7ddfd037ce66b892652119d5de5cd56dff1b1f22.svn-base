package com.oa.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.oa.entity.Tb_accumulation_fund;
import com.oa.entity.Tb_customer;
import com.oa.entity.tb_user;
import com.oa.service.impl.Accumulation_fund_Service_impl;
import com.oa.utils.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")	//消除黄线
public class Accumulation_fund_action extends ActionSupport{
	@Autowired
	private Accumulation_fund_Service_impl acc_Service_impl;
	private Tb_accumulation_fund tb_accumulation_fund;			//公积金表
	private Tb_customer customer;												//客户表																								
	private Integer aid;																		//删除所用的id
	private List<Tb_customer> cusList;											//接收到客户表的信息
	private Page<Tb_accumulation_fund> pagetb_accList;							//分页
	//模糊查询用到的条件
	private String idCard;
	private String accountNo;
	//分页所用条件
	private String now;
	private String size;

//-------------------------------------------------------------------------------------------------------------------------------------
	


	/**
	 * 模糊查询并分页
	 * @return
	 */
	public String SelectAll() {
	/*	AccList = acc_Service_impl.accumulation_fundSelect(idCard,accountNo);
		return "selectAll";*/
		pagetb_accList = acc_Service_impl.accumulation_fundSelect(now, size, idCard, accountNo);
		return "success";
	}
	/**
	 * 删除
	 * @return
	 */
	public String DeleteById() {
		acc_Service_impl.DeleteTb_accumulation_fundById(aid);
		return null;
	}
	//--------------------------下---------------------------

	/**
	 * 下拉框显示客户信息，传到添加页面
	 * @return
	 */
	public String AddAccumulation_fund() {
		cusList = acc_Service_impl.customersBy();
		return "success";
	}
	/**
	 * 添加公积金
	 * @return
	 */
	public String AddAll() {
		acc_Service_impl.AddTb_accumulation_fund(tb_accumulation_fund);
		//得到当前在线系统用户
		//HttpSession session = ServletActionContext.getRequest().getSession();
		//tb_user user = (tb_user) session.getAttribute("");
		//得到当前用户的id
		//tb_accumulation_fund.setCreateBy(user.getId());
		return "success";
	}
	//------------------------上------------------------
	/**
	 * 通过id得到要修改的值
	 * @return   公积金和客户姓名
	 */
	public String selectById() {
		tb_accumulation_fund = acc_Service_impl.selectTb_accumulation_fundById(aid);
		//下拉框显示客户姓名
		cusList = acc_Service_impl.customersBy();
		
		
		return "success";
	}
	/**
	 * 修改
	 * @return
	 */
	public String UpdateGjj() {
		acc_Service_impl.updateGjj(tb_accumulation_fund);
		return "success";
	}
	//****************************************************************************
	public Accumulation_fund_Service_impl getAcc_Service_impl() {
		return acc_Service_impl;
	}


	public void setAcc_Service_impl(Accumulation_fund_Service_impl acc_Service_impl) {
		this.acc_Service_impl = acc_Service_impl;
	}


	public Tb_accumulation_fund getTb_accumulation_fund() {
		return tb_accumulation_fund;
	}


	public void setTb_accumulation_fund(Tb_accumulation_fund tb_accumulation_fund) {
		this.tb_accumulation_fund = tb_accumulation_fund;
	}


	public Tb_customer getCustomer() {
		return customer;
	}


	public void setCustomer(Tb_customer customer) {
		this.customer = customer;
	}


	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public List<Tb_customer> getCusList() {
		return cusList;
	}
	public void setCusList(List<Tb_customer> cusList) {
		this.cusList = cusList;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Page<Tb_accumulation_fund> getPagetb_accList() {
		return pagetb_accList;
	}
	public void setPagetb_accList(Page<Tb_accumulation_fund> pagetb_accList) {
		this.pagetb_accList = pagetb_accList;
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
	
}
