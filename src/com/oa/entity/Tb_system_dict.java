package com.oa.entity;

import java.sql.Date;

public class Tb_system_dict {
  private Integer id;
  private String name;
  private String value;
  private String label;
  private String description;
  private Integer sort;
  private Integer parentid;
  private String status;
  private Integer createby;
  private Date createtime;
  private Integer updateby;
  private Date updatetime;

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

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
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
}
