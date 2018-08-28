package com.oa.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Tb_email_record {
	@Id
	@GeneratedValue
  private Integer id;
  private String to_addr;
  private String subject;
  private String content;
  private Date sendtime;
  private String status;
  @ManyToOne
  @JoinColumn(name="user_id")
   private Tb_customer customer;
  
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

 
  public String getTo_addr() {
    return to_addr;
  }

  public void setTo_addr(String to_addr) {
    this.to_addr = to_addr;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getSendtime() {
    return sendtime;
  }

  public void setSendtime(Date sendtime) {
    this.sendtime = sendtime;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

public Tb_customer getCustomer() {
	return customer;
}

public void setCustomer(Tb_customer customer) {
	this.customer = customer;
}
  
}
