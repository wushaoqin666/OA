package com.oa.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="tb_system_function")
public class Tb_system_function {
  private Integer id;
  private String funcname;
  private String funcurl;
  private Integer functype;
  private Integer parentid;
  private String iconclass;
  private String iconurl;
  private Integer sortnum;
  private String status;
  private Integer createby;
  private Date createtime;
  private Integer updateby;
  private Date updatetime;
  private String funcnote;
  private Set<tb_system_role> sysrole;
  @Id
  @GeneratedValue
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFuncname() {
    return funcname;
  }

  public void setFuncname(String funcname) {
    this.funcname = funcname;
  }

  public String getFuncurl() {
    return funcurl;
  }

  public void setFuncurl(String funcurl) {
    this.funcurl = funcurl;
  }

  public Integer getFunctype() {
    return functype;
  }

  public void setFunctype(Integer functype) {
    this.functype = functype;
  }

  public Integer getParentid() {
    return parentid;
  }

  public void setParentid(Integer parentid) {
    this.parentid = parentid;
  }

  public String getIconclass() {
    return iconclass;
  }

  public void setIconclass(String iconclass) {
    this.iconclass = iconclass;
  }

  public String getIconurl() {
    return iconurl;
  }

  public void setIconurl(String iconurl) {
    this.iconurl = iconurl;
  }

  public Integer getSortnum() {
    return sortnum;
  }

  public void setSortnum(Integer sortnum) {
    this.sortnum = sortnum;
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

  public String getFuncnote() {
    return funcnote;
  }

  public void setFuncnote(String funcnote) {
    this.funcnote = funcnote;
  }



  
  @ManyToMany(mappedBy="function")
  public Set<tb_system_role> getSysrole() {
		return sysrole;
	}

	public void setSysrole(Set<tb_system_role> sysrole) {
		this.sysrole = sysrole;
	}

}

