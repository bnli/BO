package com.sdyx.echannel.vboss.dao;

import java.util.List;

import com.sdyx.echannel.vboss.model.TbVbossCityFlag;

public interface TbVbossCityFlagDao {
    int insert(TbVbossCityFlag record);

    int insertSelective(TbVbossCityFlag record);
    
    TbVbossCityFlag selectByCityFlag(String cityFlag);
}