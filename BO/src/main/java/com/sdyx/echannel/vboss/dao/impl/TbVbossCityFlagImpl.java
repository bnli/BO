package com.sdyx.echannel.vboss.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.sdyx.echannel.vboss.dao.TbVbossCityFlagDao;
import com.sdyx.echannel.vboss.model.TbVbossCityFlag;

public class TbVbossCityFlagImpl extends SqlSessionDaoSupport implements 
	TbVbossCityFlagDao {

	@Override
	public int insert(TbVbossCityFlag record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(TbVbossCityFlag record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TbVbossCityFlag selectByCityFlag(String cityFlag) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.sdyx.echannel.vboss.dao.TbVbossCityFlagDao.selectByCityFlag", cityFlag);
	}

}
