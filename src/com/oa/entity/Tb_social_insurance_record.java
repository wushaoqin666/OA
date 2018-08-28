package com.oa.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="tb_social_insurance_record")
public class Tb_social_insurance_record {
  private Integer id;
  private String sdCard;
  private Double yanglao;
  private Double yiliao;
  private Double gongshang;
  private Double shiye;
  private Double shengyu;
  private Double payMoney;
  private String payMonth;
  private String status;
  private Integer createBy;
  private Date createTime;
  private Integer updateBy;
  private Date updateTime;
  private String remark;
  private Tb_customer tb_customer;
  
@Id
  @GeneratedValue
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

 

  public String getSdCard() {
	return sdCard;
}

public void setSdCard(String sdCard) {
	this.sdCard = sdCard;
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

  

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  
  public Double getPayMoney() {
	return payMoney;
}

public void setPayMoney(Double payMoney) {
	this.payMoney = payMoney;
}

public String getPayMonth() {
	return payMonth;
}

public void setPayMonth(String payMonth) {
	this.payMonth = payMonth;
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
  @ManyToOne(fetch=FetchType.EAGER)
  @JoinColumn(name="customerId")
public Tb_customer getTb_customer() {
	return tb_customer;
}

public void setTb_customer(Tb_customer tb_customer) {
	this.tb_customer = tb_customer;
}
  
  
  
}
