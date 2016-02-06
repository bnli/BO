package com.sdyx.echannel.vboss.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.huge.iunifiedechannelservice.CommonTradeInfo;
import com.huge.iunifiedechannelservice.CustomerBalanceInfo;
import com.sdyx.echannel.vboss.dao.TbVbossOrderDao;
import com.sdyx.echannel.vboss.model.TbVbossOrder;
import com.sdyx.echannel.vboss.service.BossService;
import com.sdyx.echannel.vboss.service.OrderService;
import com.sysway.boss.service.internal.customer.echannel.IUnifiedEChannelService;
import com.sysway.boss.service.internal.customer.echannel.UnifiedEChannelServiceService;

@Service("bossService")
public class BossServiceImpl implements BossService {



	ObjectMapper mapper = new ObjectMapper();

	@Override
	public String getCustomerCommonBalanceInfo(String operatorId,
			String customerNumber) {
		// TODO Auto-generated method stub
		
		UnifiedEChannelServiceService serviceFactory = new UnifiedEChannelServiceService();
		IUnifiedEChannelService service = serviceFactory.getUnifiedEChannelServicePort();
		
		CommonTradeInfo ct = new CommonTradeInfo();
		ct.setServiceChannel("218");
		ct.setOperationRoleCode(operatorId);
		
		List<CustomerBalanceInfo> result = service.findCustomerBalanceInfo(ct, customerNumber);
		for (int i = 0; i < result.size(); i++) {
			if (result.get(i).getAccountType().equals("01") && result.get(i).getBalanceType().equals("01")) {

				return "{\"status\":\"0\",\"errorMessage\":\"获取通用余额信息成功\",\"data\":{\"amount\":\""
						+ String.valueOf(result.get(i).getAmount())
						+ "\"}}";
			}
		}
		
		return "{\"status\":\"0\",\"errorMessage\":\"获取通用余额信息成功\",\"data\":{\"amount\":\"0\"}}";
	}

	@Override
	public String getCustomerNumber(String operatorId, String caNumber) {
		// TODO Auto-generated method stub
		
		UnifiedEChannelServiceService serviceFactory = new UnifiedEChannelServiceService();
		IUnifiedEChannelService service = serviceFactory.getUnifiedEChannelServicePort();
		
		CommonTradeInfo ct = new CommonTradeInfo();
		ct.setServiceChannel("218");
		ct.setOperationRoleCode(operatorId);
		
		
		return "{\"status\":\"0\",\"errorMessage\":\"获取客户编码信息成功\",\"data\":{\"customerNumber\":\""
				+ service.findCustomerInfo(ct, caNumber, 2).getCode()
				+ "\"}}";
	}

	@Override
	public String getCustomerInfo(String operatorId, String caNumber) {
		// TODO Auto-generated method stub
		
		UnifiedEChannelServiceService serviceFactory = new UnifiedEChannelServiceService();
		IUnifiedEChannelService service = serviceFactory.getUnifiedEChannelServicePort();
		
		CommonTradeInfo ct = new CommonTradeInfo();
		ct.setServiceChannel("218"); 
		ct.setOperationRoleCode(operatorId);
		
		try {
			Map<String, Object> result = new HashMap<String, Object>();
			
			result.put("status", "0");
			result.put("errorMessage", "获取成功");
			
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("customerNumber", service.findCustomerInfo(ct, caNumber, 2).getCode());
			data.put("customerName", service.findCustomerInfo(ct, caNumber, 2).getName());
			data.put("customerMobile", service.findCustomerInfo(ct, caNumber, 2).getMobile());
			data.put("customerFixedTel", service.findCustomerInfo(ct, caNumber, 2).getFixedTel());
			data.put("customerInstallAddress", service.findCustomerInfo(ct, caNumber, 2).getInstallAddress());
			
			result.put("data", data);
		
		
			return mapper.writeValueAsString(result);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "1";
	}

	@Override
	public String getValueAddedProductInfo(String operatorID, String caNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
