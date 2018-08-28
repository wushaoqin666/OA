package com.oa.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.oa.dao.Accumulation_fund_Dao;
import com.oa.entity.Tb_accumulation_fund;
import com.oa.entity.Tb_customer;

@Repository("accumulation_fund_Dao")
public class Accumulation_fund_Dao_impl implements Accumulation_fund_Dao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// ****************************************************************************************************
	/**
	 * 查询客户表的信息
	 */
	@Override
	public List<Tb_customer> customersBy() {
		String hql = "from Tb_customer";
		List<Tb_customer> list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	/**
	 * 查询出公积金表条数
	 */
	@Override
	public Long GjjCount() {
		String hql = "SELECT COUNT(1) FROM Tb_accumulation_fund";
		Long count = (Long) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
		return count;
	}

	/**
	 * 模糊查询全部并分页
	 */
	@Override
	public List<Object> SelectAccumulation_fundAll(String idCard, String accountNo,Integer pageNow,Integer pageSize) {
		StringBuffer hql = new StringBuffer(
				"from Tb_accumulation_fund AS a,Tb_customer AS c where a.idCard = c.idCard");
		if(idCard != null) {
			hql.append("  and a.idCard like:idCard");
		}
		if(accountNo != null) {
			hql.append("  and a.accountNo like:accountNo");
		}
		@SuppressWarnings("unchecked") // 注解解决黄线问题
		List<Object> list = sessionFactory.getCurrentSession().createQuery(hql.toString())
				.setString("idCard",  idCard  ).setString("accountNo",  accountNo )
				.setFirstResult((pageNow-1)*pageSize)
				.setMaxResults(pageSize)
				.list();
		return list;
	}

	/**
	 * 通过id得到值后删除
	 */
	@Override
	public void DeleteTb_accumulation_fundById(Integer id) {
		Tb_accumulation_fund tb_accumulation_fund = (Tb_accumulation_fund) sessionFactory.getCurrentSession()
				.load(Tb_accumulation_fund.class, id);
		sessionFactory.getCurrentSession().delete(tb_accumulation_fund);
	}

	/**
	 * 添加公积金
	 */
	@Override
	public void AddTb_accumulation_fund(Tb_accumulation_fund acc_fund) {
		sessionFactory.getCurrentSession().save(acc_fund); // 添加公积金
	}
	
	/**
	 * 修改之前的查询
	 */
	@Override
	public Tb_accumulation_fund selectAccumulation_fundById(Integer id) {
		Tb_accumulation_fund fund = (Tb_accumulation_fund) sessionFactory.getCurrentSession().load(Tb_accumulation_fund.class, id);
		return fund;
		
	}
	/**
	 * 修改
	 */
	@Override
	public void updateGjj(Tb_accumulation_fund tb_acc) {
		sessionFactory.getCurrentSession().update(tb_acc);
	}

}
