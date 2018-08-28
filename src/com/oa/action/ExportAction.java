package com.oa.action;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.KeyStore.PrivateKeyEntry;

import org.springframework.beans.factory.annotation.Autowired;

import com.oa.entity.Tb_social_insurance;
import com.oa.service.impl.Tb_Social_InsuranceServiceImpl;
import com.oa.utils.ExportUtil;
import com.oa.utils.Page;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;


public class ExportAction extends ActionSupport{
	@Autowired
	private Tb_Social_InsuranceServiceImpl tb_Social_InsuranceServiceImpl;
	private OutputStream outputStream;
	private String contentType;
	private String contentDisposition;
	private String fileName;
	
	private String now;
	private String size;
	private String name;
	private String idCard;
	private String sbCard;
	
	public String exportDown() throws UnsupportedEncodingException{
		fileName="社保信息列表";
		contentType="appliaction/vnd.ms-excel;charset=utf-8";
		contentDisposition=("attachment;fileName="+ new String(fileName.getBytes(),"iso-8859-1")+".xls");
		Page<Tb_social_insurance> page=tb_Social_InsuranceServiceImpl.sheBaoPage(now, size, name, idCard, sbCard);
		ExportUtil.exportExcel(page, outputStream);
		return "exportDown";
	}

	public OutputStream getOutputStream() {
		return outputStream;
	}

	public void setOutputStream(OutputStream outputStream) {
		this.outputStream = outputStream;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentDisposition() {
		return contentDisposition;
	}

	public void setContentDisposition(String contentDisposition) {
		this.contentDisposition = contentDisposition;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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

	public String getSbCard() {
		return sbCard;
	}

	public void setSbCard(String sbCard) {
		this.sbCard = sbCard;
	}
	
	
}
