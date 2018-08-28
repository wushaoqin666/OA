package com.oa.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Tb_person {
	@Id
	@GeneratedValue
  private Integer id_c;
  private String idcard;
  private String jobintension;
  private String jobtype;
  private Double forprice;
  private String foraddress;
  private String worked;
  private String personinfo;
  private String resumeurl;
  private String status;
  private Integer createby;
  private Date createtime;
  private Integer updateby;
  private Date updatetime;
  private String remark;

  	@ManyToOne
	@JoinColumn(name="id")
	  private Tb_customer customer;


  public String getIdcard() {
    return idcard;
  }

  public void setIdcard(String idcard) {
    this.idcard = idcard;
  }

  public String getJobintension() {
    return jobintension;
  }

  public void setJobintension(String jobintension) {
    this.jobintension = jobintension;
  }

  public String getJobtype() {
    return jobtype;
  }

  public void setJobtype(String jobtype) {
    this.jobtype = jobtype;
  }

  public Double getForprice() {
    return forprice;
  }

  public void setForprice(Double forprice) {
    this.forprice = forprice;
  }

  public String getForaddress() {
    return foraddress;
  }

  public void setForaddress(String foraddress) {
    this.foraddress = foraddress;
  }

  public String getWorked() {
    return worked;
  }

  public void setWorked(String worked) {
    this.worked = worked;
  }

  public String getPersoninfo() {
    return personinfo;
  }

  public void setPersoninfo(String personinfo) {
    this.personinfo = personinfo;
  }

  public String getResumeurl() {
    return resumeurl;
  }

  public void setResumeurl(String resumeurl) {
    this.resumeurl = resumeurl;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getCreateby() {
    return createby;
  }

  public void setCreateby(Integer createby) {
    this.createby = createby;
  }

  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  public Integer getUpdateby() {
    return updateby;
  }

  public void setUpdateby(Integer updateby) {
    this.updateby = updateby;
  }

  public Date getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(Date updatetime) {
    this.updatetime = updatetime;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

public Integer getId_c() {
	return id_c;
}

public void setId_c(Integer id_c) {
	this.id_c = id_c;
}

public Tb_customer getCustomer() {
	return customer;
}

public void setCustomer(Tb_customer customer) {
	this.customer = customer;
}
  
}
