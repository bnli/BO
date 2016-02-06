package com.sdyx.test;

import java.util.List;

import org.junit.Test;

import com.huge.iunifiedechannelservice.CommonTradeInfo;
import com.huge.iunifiedechannelservice.CustomerBalanceInfo;
import com.huge.iunifiedechannelservice.RechargeInfo;
import com.sysway.boss.service.internal.customer.echannel.IUnifiedEChannelService;
import com.sysway.boss.service.internal.customer.echannel.UnifiedEChannelServiceService;

public class TestWS {

	@Test
	public void Test1() {
		UnifiedEChannelServiceService serviceFactory = new UnifiedEChannelServiceService();
		IUnifiedEChannelService service = serviceFactory.getUnifiedEChannelServicePort();
		
		CommonTradeInfo ct = new CommonTradeInfo();
		ct.setServiceChannel("218");
		ct.setVerificationCode("");
		ct.setOperationRoleCode("DY");
		
		String cc = "05060027813";
		
		RechargeInfo ri = new RechargeInfo();
		ri.setPaymentMode(6);
		ri.setTradeDate("20151207");
		ri.setTradeSerialNumber("20151207181100");
		ri.setDeposit(10000);
		ri.setPaymentWay("?");
		
		System.out.println(service.recharge(ct, cc, ri).getMessage());
		
	}
	
	@Test
	public void Test2() {
		UnifiedEChannelServiceService serviceFactory = new UnifiedEChannelServiceService();
		IUnifiedEChannelService service = serviceFactory.getUnifiedEChannelServicePort();
		
		CommonTradeInfo ct = new CommonTradeInfo();
		ct.setServiceChannel("218");
		ct.setOperationRoleCode("DY");
		
		String cc = "05060027813";
		
		List<CustomerBalanceInfo> result = service.findCustomerBalanceInfo(ct, cc);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getAmount());
		}
	}
}
