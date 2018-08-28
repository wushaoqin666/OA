package com.oa.service;




import java.util.List;
import java.util.Map;

import com.oa.entity.Tb_company;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_sms_template;
import com.oa.entity.Tb_social_insurance;
import com.oa.utils.Page;

public interface Tb_Social_InsuranceService {
	public Page<Tb_social_insurance> sheBaoPage(String now,String size,String name,String idCard,String sbCard);
	
	
	public void addSheBao(Tb_social_insurance tb_social_insurance);
	
	public void delSheBao(Integer id);
	
	public void upSheBao(Tb_social_insurance tb_social_insurance);
	
	public Tb_social_insurance sheBaoById(Integer id);
	
	public Tb_customer keHuByIdCard(String idCard);
	
	public List<Tb_company> gongSiList();
	
	public List<Tb_customer> keHuList();
	
	public Tb_customer keHuById(Integer id);
	
	
	
	
}
