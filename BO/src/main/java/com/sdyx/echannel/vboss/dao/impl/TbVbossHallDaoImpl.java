package com.sdyx.echannel.vboss.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.sdyx.echannel.vboss.dao.TbVbossHallDao;
import com.sdyx.echannel.vboss.model.TbVbossHall;

public class TbVbossHallDaoImpl extends SqlSessionDaoSupport implements
		TbVbossHallDao {

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(TbVbossHall record) {
		// TODO Auto-generated method stub
		this.getSqlSession().insert("com.sdyx.echannel.vboss.dao.TbVbossHallDao.insert", record);
		return 0;
	}

	@Override
	public int insertSelective(TbVbossHall record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TbVbossHall selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.sdyx.echannel.vboss.dao.TbVbossHallDao.selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(TbVbossHall record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TbVbossHall record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TbVbossHall> selectByOperationRoleCode(String operationRoleCode) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.sdyx.echannel.vboss.dao.TbVbossHallDao.selectByOperationRoleCode", operationRoleCode);
	}

}
