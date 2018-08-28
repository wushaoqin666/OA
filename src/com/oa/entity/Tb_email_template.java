package com.oa.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb_email_template")
public class Tb_email_template {
  private Integer id;
  private String subject;
  private String content;
  private Integer order_id;
  private Date createtime;
  private Integer createby;
  private Date updatetime;
  private Integer updateby;
  @Id
  @GeneratedValue
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public Integer getOrder_id() {
    return order_id;
  }

  public void setOrder_id(Integer order_id) {
    this.order_id = order_id;
  }

  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  public Integer getCreateby() {
    return createby;
  }

  public void setCreateby(Integer createby) {
    this.createby = createby;
  }

  public Date getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(Date updatetime) {
    this.updatetime = updatetime;
  }

  public Integer getUpdateby() {
    return updateby;
  }

  public void setUpdateby(Integer updateby) {
    this.updateby = updateby;
  }
}