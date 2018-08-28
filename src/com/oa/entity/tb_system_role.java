package com.oa.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class tb_system_role {
	
	private Integer id;
	private String roleName;
	private Integer sortnum;
	private String status;
	private Integer createBy;
	private Date createTime;
	private Integer updateBy;
	private Date updateTime;
	private String roleNote;
	private Set<Tb_system_function> function;
	private Set<tb_user> user;
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	public String getRoleNote() {
		return roleNote;
	}
	public void setRoleNote(String roleNote) {
		this.roleNote = roleNote;
	}
	
	@ManyToMany
	@JoinTable(
			name="tb_role_function",
			joinColumns=@JoinColumn(name="roleId"),
			inverseJoinColumns=@JoinColumn(name="funcId")
			)
	public Set<Tb_system_function> getFunction() {
		return function;
	}
	public void setFunction(Set<Tb_system_function> function) {
		this.function = function;
	}
	
	
	@ManyToMany(mappedBy="role")
	public Set<tb_user> getUser() {
		return user;
	}
	public void setUser(Set<tb_user> user) {
		this.user = user;
	}
	
	
	
}
