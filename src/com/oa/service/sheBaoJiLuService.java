package com.oa.service;

import com.oa.entity.Tb_social_insurance_record;
import com.oa.utils.Page;

public interface sheBaoJiLuService {
	
	public Page<Tb_social_insurance_record> sheBaoJiLuPage(String now,String size,String name,String idCard,String sbCard);
	
	public void delSheBaoJiLu(Integer id);
	
	public void upSheBaoJiLu(Tb_social_insurance_record tb_social_insurance_record);
	
	public Tb_social_insurance_record sheBaoJiLuById(Integer id);
}
