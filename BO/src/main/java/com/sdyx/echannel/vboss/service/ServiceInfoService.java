package com.sdyx.echannel.vboss.service;

import java.util.List;

import com.sdyx.echannel.vboss.model.TbVbossHall;

public interface ServiceInfoService {

	
	public int addHall(TbVbossHall record);
	
	public String getHallByOperationRoleCode(String operationRoleCode);

	public String sayHi(String name);
	
	public String getCityFlag(String cityFlag);
}
