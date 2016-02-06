package com.sdyx.echannel.vboss.service.impl;

import org.springframework.stereotype.Service;

import com.sdyx.boss.service.internal.customer.echannel.webservice.impl.IUnifiedEChannelService;
import com.sdyx.boss.service.internal.customer.echannel.webservice.impl.UnifiedEChannelServiceService;
import com.sdyx.echannel.vboss.service.SdyxService;

@Service("sdyxService")
public class SdyxServiceImpl implements SdyxService {

	@Override
	public String getUserProInfo(String operatorId, String caNumber) {
		// TODO Auto-generated method stub
		
		UnifiedEChannelServiceService serviceFactory = new UnifiedEChannelServiceService();
		IUnifiedEChannelService service = serviceFactory.getIUnifiedEChannelServicePort();
		
		return service.doRequest("{\"parameters\":{\"caNumber\":\"" + caNumber + "\",\"operatorID\":\"" + operatorId + "\"},\"method\":\"getUserProInfo\"}");
	}

	@Override
	public String getRenewalInfo(String operatorId, String caNumber) {
		// TODO Auto-generated method stub
		UnifiedEChannelServiceService serviceFactory = new UnifiedEChannelServiceService();
		IUnifiedEChannelService service = serviceFactory.getIUnifiedEChannelServicePort();
		
		return service.doRequest("{\"parameters\":{\"caNumber\":\"" + caNumber + "\",\"operatorID\":\"" + operatorId + "\"},\"method\":\"getRenewalInfo\"}");
	}

	@Override
	public String getCustomerCommonBalanceInfo(String operatorId,
			String customerNumber) {
		// TODO Auto-generated method stub
		UnifiedEChannelServiceService serviceFactory = new UnifiedEChannelServiceService();
		IUnifiedEChannelService service = serviceFactory.getIUnifiedEChannelServicePort();
		
		return service.doRequest("{\"parameters\":{\"customerNumber\":\"" + customerNumber + "\",\"operatorID\":\"" + operatorId + "\"},\"method\":\"getCustomerCommonBalanceInfo\"}");
	}

}
