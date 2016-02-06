package com.sdyx.echannel.vboss.service;

import com.sdyx.echannel.vboss.model.TbVbossOrder;

public interface SdyxService {

	public String getUserProInfo(String operatorId, String caNumber);
	
	
	public String getRenewalInfo(String operatorId, String caNumber);
	
	public String getCustomerCommonBalanceInfo(String operatorId, String customerNumber);
	
}
