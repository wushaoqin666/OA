package com.oa.service.impl;

import java.util.List;

import com.oa.dao.Tb_newsDao;
import com.oa.entity.Tb_news;
import com.oa.service.Tb_newsService;

public class Tb_newsServiceImpl implements Tb_newsService {

	private Tb_newsDao Tb_newsDao;
	
	public Tb_newsDao getTb_newsDao() {
		return Tb_newsDao;
	}

	public void setTb_newsDao(Tb_newsDao tb_newsDao) {
		Tb_newsDao = tb_newsDao;
	}

	@Override
	public List<Tb_news> sheBaoList() {
		// TODO Auto-generated method stub
		return Tb_newsDao.show();
	}

	@Override
	public Tb_news showById(int id) {
		// TODO Auto-generated method stub
		return Tb_newsDao.showById(id);
	}

	@Override
	public void addnews(Tb_news Tb_news) {
		Tb_newsDao.addnews(Tb_news);
		
	}

	@Override
	public void updatenews(Tb_news Tb_news) {
		Tb_newsDao.updatenews(Tb_news);
		
	}

}
