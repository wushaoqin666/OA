package com.oa.dao.impl;

import static org.hamcrest.CoreMatchers.endsWith;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.Tb_Social_InsuranceDao;
import com.oa.entity.Tb_company;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_sms_template;
import com.oa.entity.Tb_social_insurance;
@Repository
public class Tb_Social_InsuranceDaoImpl implements Tb_Social_InsuranceDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Tb_social_insurance> sheBaoList(StringBuffer hql,Integer pageNow,Integer pageSize,Map<String,Object> map) {
		
		List<Tb_social_insurance> list = sessionFactory.getCurrentSession()
				.createQuery(hql.toString())
				.setProperties(map)
				.setFirstResult((pageNow-1)*pageSize)
				.setMaxResults(pageSize)
				.list();
		return list;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long sheBaoCount(String idCard,String sbCard,String name) {
		Map<String, Object> map=new HashMap<>();
		StringBuffer hql=new StringBuffer("select count(1) from Tb_social_insurance s where s.status = 0");
		if(name!=null && name!=""){
			hql.append(" and s.tb_customer.name like:name");
			map.put("name", "%"+name+"%");
		}
		if(idCard!=null && idCard!=""){
			hql.append(" and s.idCard like:idCard");
			map.put("idCard", "%"+idCard+"%");
		}
		if(sbCard!=null && sbCard!=""){
			hql.append(" and s.sbCard like:sbCard");
			map.put("sbCard", "%"+sbCard+"%");
		}
		Long count =(Long) sessionFactory.getCurrentSession().createQuery(hql.toString())
				.setProperties(map)
				.uniqueResult();
		return count;
	}

	@Override
	public void addSheBao(Tb_social_insurance tb_social_insurance) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(tb_social_insurance);	
	}

	@Override
	public void delSheBao(Integer id) {
		Tb_social_insurance tb = (Tb_social_insurance) sessionFactory.getCurrentSession().get(Tb_social_insurance.class, id);
		sessionFactory.getCurrentSession().delete(tb);
	}

	@Override
	public void upSheBao(Tb_social_insurance she) {
		String hql="update Tb_social_insurance s set s.sbCard=:sbCard,s.basePay=:basePay,s.mustPay=:mustPay,s.personRatio=:personRatio,s.companyRatio=:companyRatio,"
				+ "s.yanglao=:yanglao,s.yiliao=:yiliao,s.shiye=:shiye,s.gongshang=:gongshang,s.shengyu=:shenyu,s.payDate=:payDate,s.proxyFee=:proxyFee,s.status=:status,s.remark=:remark where s.id=:id";
		Query u = sessionFactory.getCurrentSession().createQuery(hql);
		Map<String, Object> map=new HashMap<>();
		map.put("sbCard", she.getSbCard());
		map.put("basePay", she.getBasePay());
		map.put("mustPay", she.getMustPay());
		map.put("personRatio", she.getPersonRatio());
		map.put("companyRatio", she.getCompanyRatio());
		map.put("yanglao", she.getYanglao());
		map.put("yiliao", she.getYiliao());
		map.put("shiye", she.getShiye());
		map.put("gongshang", she.getGongshang());
		map.put("shenyu", she.getShengyu());
		map.put("payDate", she.getPayDate());
		map.put("proxyFee", she.getProxyFee());
		map.put("status", she.getStatus());
		map.put("remark", she.getRemark());
		map.put("id", she.getId());
		u.setProperties(map);
		u.executeUpdate();
	} 

	@Override
	public Tb_social_insurance sheBaoById(Integer id) {
		// TODO Auto-generated method stub
		Tb_social_insurance tb_social_insurance = (Tb_social_insurance) sessionFactory.getCurrentSession().get(Tb_social_insurance.class, id);
		return tb_social_insurance;
	}

	@Override
	public Tb_customer keHuByIdCard(String idCard) {
		// TODO Auto-generated method stub
		String hql="from Tb_customer where idCard=:idCard";
		Tb_customer tb_customer = (Tb_customer) sessionFactory
				.getCurrentSession()
				.createQuery(hql)
				.setString("idCard", idCard)
				.uniqueResult();
		return tb_customer;
	}

	@Override
	public List<Tb_company> gongSiList() {
		String hql="from Tb_company";
		List<Tb_company> list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public List<Tb_customer> keHuList() {
		String hql="from Tb_customer";
		List<Tb_customer> list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public Tb_customer keHuById(Integer id) {
		Tb_customer tb_customer = (Tb_customer) sessionFactory.getCurrentSession().get(Tb_customer.class, id);
		return tb_customer;
	}

	
	

}
