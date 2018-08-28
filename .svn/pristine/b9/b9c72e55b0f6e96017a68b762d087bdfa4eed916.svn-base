 package com.oa.entity;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_accumulation_fund")
public class Tb_accumulation_fund {
	private Integer id; // 编号
	private String idCard; // 身份证号(这里与个人客户表tb_customer形成主外键,通过身份证一致来得到值)
	private String accountNo; // 公积金账户
	private String payDate; // 缴费时间
	private Double payMoney; // 缴费金额
	private Double proxyFee; // 代理费用(应该是手续费)
	private String status; // 状态(是否缴费:0:缴费,1:未缴费)
	private Integer createBy; // 创建者:与用户表一致
	private Date createTime; // 创建时间
	private Integer updateBy; // 更新者
	private Date updateTime; // 更新时间
	private String remark; // 备注
	private Tb_customer customer;	//封装客户实体类

	@Transient
	public Tb_customer getCustomer() {
		return customer;
	}

	public void setCustomer(Tb_customer customer) {
		this.customer = customer;
	}

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public Double getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(Double payMoney) {
		this.payMoney = payMoney;
	}

	public Double getProxyFee() {
		return proxyFee;
	}

	public void setProxyFee(Double proxyFee) {
		this.proxyFee = proxyFee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
