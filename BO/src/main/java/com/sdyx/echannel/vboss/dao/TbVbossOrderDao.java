package com.sdyx.echannel.vboss.dao;

import com.sdyx.echannel.vboss.model.TbVbossOrder;

public interface TbVbossOrderDao {
    int deleteByPrimaryKey(Long id);

    int insert(TbVbossOrder record);

    int insertSelective(TbVbossOrder record);

    TbVbossOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbVbossOrder record);

    int updateByPrimaryKey(TbVbossOrder record);
}