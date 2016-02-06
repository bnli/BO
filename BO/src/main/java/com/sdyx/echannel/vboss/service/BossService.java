package com.sdyx.echannel.vboss.service;

import com.sdyx.echannel.vboss.model.TbVbossOrder;

public interface BossService {

	public String getCustomerCommonBalanceInfo(String operatorId, String customerNumber);
	
	public String getCustomerNumber(String operatorId, String caNumber);
	
	public String getCustomerInfo(String operatorID, String caNumber);
	
	public String getValueAddedProductInfo(String operatorID, String caNumber);
	
}
