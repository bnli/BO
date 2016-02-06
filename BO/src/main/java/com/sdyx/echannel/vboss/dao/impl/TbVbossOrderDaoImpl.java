package com.sdyx.echannel.vboss.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.sdyx.echannel.vboss.dao.TbVbossOrderDao;
import com.sdyx.echannel.vboss.model.TbVbossOrder;

public class TbVbossOrderDaoImpl extends SqlSessionDaoSupport implements
		TbVbossOrderDao {

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TbVbossOrder record) {
		// TODO Auto-generated method stub
		this.getSqlSession().insert("com.sdyx.echannel.vboss.dao.TbVbossOrderDao.insert", record);
		return 0;
	}

	@Override
	public int insertSelective(TbVbossOrder record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TbVbossOrder selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.sdyx.echannel.vboss.dao.TbVbossOrderDao.selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(TbVbossOrder record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TbVbossOrder record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
