package com.sdyx.echannel.vboss.dao;

import java.util.List;

import com.sdyx.echannel.vboss.model.TbVbossHall;

public interface TbVbossHallDao {
    int deleteByPrimaryKey(Long id);

    int insert(TbVbossHall record);

    int insertSelective(TbVbossHall record);

    TbVbossHall selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbVbossHall record);

    int updateByPrimaryKey(TbVbossHall record);
    
    List<TbVbossHall> selectByOperationRoleCode(String operationRoleCode);
}