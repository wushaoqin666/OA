package com.oa.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Tb_person_job {
@Id
@GeneratedValue
  private Integer id_a;
  private String idcard;

  private String jobtype;
  private Double companyprice;
  private Double personprice;
  private String jobcontent;
  private java.sql.Date starttime;
  private java.sql.Date endtime;
  private String contracturl;
  private String status;
  private Integer createby;
  private Date createtime;
  private Integer updateby;
  private Date updatetime;
  private String remark;
 @ManyToOne
@JoinColumn(name="id")
  private Tb_customer customer;
 
 @ManyToOne
	@JoinColumn(name="companyId")
	private Tb_company tb_companys;
 


public Integer getId_a() {
	return id_a;
}

public void setId_a(Integer id_a) {
	this.id_a = id_a;
}

public Tb_company getTb_companys() {
	return tb_companys;
}

public void setTb_companys(Tb_company tb_companys) {
	this.tb_companys = tb_companys;
}

public String getIdcard() {
    return idcard;
  }

  public void setIdcard(String idcard) {
    this.idcard = idcard;
  }

  

  public String getJobtype() {
    return jobtype;
  }

  public void setJobtype(String jobtype) {
    this.jobtype = jobtype;
  }

  public Double getCompanyprice() {
    return companyprice;
  }

  public void setCompanyprice(Double companyprice) {
    this.companyprice = companyprice;
  }

  public Double getPersonprice() {
    return personprice;
  }

  public void setPersonprice(Double personprice) {
    this.personprice = personprice;
  }

  public String getJobcontent() {
    return jobcontent;
  }

  public void setJobcontent(String jobcontent) {
    this.jobcontent = jobcontent;
  }

  public java.sql.Date getStarttime() {
    return starttime;
  }

  public void setStarttime(java.sql.Date starttime) {
    this.starttime = starttime;
  }

  public java.sql.Date getEndtime() {
    return endtime;
  }

  public void setEndtime(java.sql.Date endtime) {
    this.endtime = endtime;
  }

  public String getContracturl() {
    return contracturl;
  }

  public void setContracturl(String contracturl) {
    this.contracturl = contracturl;
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

public Tb_customer getCustomer() {
	return customer;
}

public void setCustomer(Tb_customer customer) {
	this.customer = customer;
}
  
}
