package com.oa.entity;

import java.security.KeyStore.PrivateKeyEntry;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="tb_customer")
public class Tb_customer {
  private Integer id;						//自增id
  private String name;						//客户名称
  private String idCard;					//身份证号 (和公积金表形成主外键)
  private String sex;						//性别
  private java.sql.Date birthday;			//出生年月日
  private String phone;						//电话
  private String email;						//电子邮件
  private String address;					//客户联系地址
  private String zipCode;					//邮编
  private String school;					//毕业学校
  private String specialty;					//专业
  private String graduation;				//毕业时间
  private Integer companyId;				//所属公司
  private String customerType;				//客户类型(0本公司员工 ,1代理公司,2个人客户,3外包客户)
  private String isSalary;					//代发工资0是1否
  private String isShebao;					//代缴社保0是1否
  private String isGongjijin;				//代缴公积金0是1否
  private String status;					//状态0正常1封存
  private String delFlag;					//删除标志0正常1删除
  private Date createTime;					//创建时间
  private Integer createBy;					//创建者
  private Date updateTime;					//更新时间
  private Integer updateBy;					//更新者
  private String remark;					//备注
  
  private Tb_social_insurance tb_social_insurance;
  
  @Id
  @GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public java.sql.Date getBirthday() {
	return birthday;
}
public void setBirthday(java.sql.Date birthday) {
	this.birthday = birthday;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getSpecialty() {
	return specialty;
}
public void setSpecialty(String specialty) {
	this.specialty = specialty;
}
public String getGraduation() {
	return graduation;
}
public void setGraduation(String graduation) {
	this.graduation = graduation;
}
public Integer getCompanyId() {
	return companyId;
}
public void setCompanyId(Integer companyId) {
	this.companyId = companyId;
}
public String getCustomerType() {
	return customerType;
}
public void setCustomerType(String customerType) {
	this.customerType = customerType;
}
public String getIsSalary() {
	return isSalary;
}
public void setIsSalary(String isSalary) {
	this.isSalary = isSalary;
}
public String getIsShebao() {
	return isShebao;
}
public void setIsShebao(String isShebao) {
	this.isShebao = isShebao;
}
public String getIsGongjijin() {
	return isGongjijin;
}
public void setIsGongjijin(String isGongjijin) {
	this.isGongjijin = isGongjijin;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getDelFlag() {
	return delFlag;
}
public void setDelFlag(String delFlag) {
	this.delFlag = delFlag;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public Integer getCreateBy() {
	return createBy;
}
public void setCreateBy(Integer createBy) {
	this.createBy = createBy;
}
public Date getUpdateTime() {
	return updateTime;
}
public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
}
public Integer getUpdateBy() {
	return updateBy;
}
public void setUpdateBy(Integer updateBy) {
	this.updateBy = updateBy;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}



@OneToOne(mappedBy="tb_customer")
public Tb_social_insurance getTb_social_insurance() {
	return tb_social_insurance;
}
public void setTb_social_insurance(Tb_social_insurance tb_social_insurance) {
	this.tb_social_insurance = tb_social_insurance;
}





 
}
