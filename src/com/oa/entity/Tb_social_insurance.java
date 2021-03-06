package com.oa.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sun.org.apache.bcel.internal.generic.NEW;
@Entity
@Table(name="tb_social_insurance")
public class Tb_social_insurance{
  private Integer id;
  private String idCard;
  private String sbCard;
  private Double basePay;
  private Double mustPay;
  private String personRatio;
  private String companyRatio;
  private Double yanglao;
  private Double yiliao;
  private Double gongshang;
  private Double shiye;
  private Double shengyu;
  private Date payDate;
  private Tb_customer tb_customer;
 // private Set<Tb_social_insurance_record> tb_social_insurance_record=new HashSet<>();
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
public String getSbCard() {
	return sbCard;
}
public void setSbCard(String sbCard) {
	this.sbCard = sbCard;
}
public Double getBasePay() {
	return basePay;
}
public void setBasePay(Double basePay) {
	this.basePay = basePay;
}
public Double getMustPay() {
	return mustPay;
}
public void setMustPay(Double mustPay) {
	this.mustPay = mustPay;
}
public String getPersonRatio() {
	return personRatio;
}
public void setPersonRatio(String personRatio) {
	this.personRatio = personRatio;
}
public String getCompanyRatio() {
	return companyRatio;
}
public void setCompanyRatio(String companyRatio) {
	this.companyRatio = companyRatio;
}
public Double getYanglao() {
	return yanglao;
}
public void setYanglao(Double yanglao) {
	this.yanglao = yanglao;
}
public Double getYiliao() {
	return yiliao;
}
public void setYiliao(Double yiliao) {
	this.yiliao = yiliao;
}
public Double getGongshang() {
	return gongshang;
}
public void setGongshang(Double gongshang) {
	this.gongshang = gongshang;
}
public Double getShiye() {
	return shiye;
}
public void setShiye(Double shiye) {
	this.shiye = shiye;
}
public Double getShengyu() {
	return shengyu;
}
public void setShengyu(Double shengyu) {
	this.shengyu = shengyu;
}
public Date getPayDate() {
	return payDate;
}
public void setPayDate(Date payDate) {
	this.payDate = payDate;
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



private Double proxyFee;
  private String status;
  private Integer createBy;
  private Date createTime;
  private Integer updateBy;
  private Date updateTime;
  private String remark;
 
@OneToOne(fetch=FetchType.EAGER)
@JoinColumn(name="customerId")
public Tb_customer getTb_customer() {
	return tb_customer;
}
public void setTb_customer(Tb_customer tb_customer) {
	this.tb_customer = tb_customer;
}



/*public Set<Tb_social_insurance_record> getTb_social_insurance_record() {
	return tb_social_insurance_record;
}
public void setTb_social_insurance_record(Set<Tb_social_insurance_record> tb_social_insurance_record) {
	this.tb_social_insurance_record = tb_social_insurance_record;
}*/


  

 
}
