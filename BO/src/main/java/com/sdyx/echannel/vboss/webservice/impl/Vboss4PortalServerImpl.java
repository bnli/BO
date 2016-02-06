package com.sdyx.echannel.vboss.webservice.impl;


import java.io.IOException;
import java.util.Map;

import javax.jws.WebService;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sdyx.echannel.vboss.service.BossService;
import com.sdyx.echannel.vboss.service.OrderService;
import com.sdyx.echannel.vboss.service.SdyxService;
import com.sdyx.echannel.vboss.service.ServiceInfoService;
import com.sdyx.echannel.vboss.service.impl.ServiceInfoServiceImpl;
import com.sdyx.echannel.vboss.webservice.Vboss4PortalServer;

@WebService(name="Vboss4PortalServer")
public class Vboss4PortalServerImpl implements Vboss4PortalServer {
	
	@Autowired
	private ServiceInfoService serviceInfoService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private BossService bossService;
	@Autowired
	private SdyxService sdyxService;
	
	ObjectMapper mapper = new ObjectMapper();
	
	String response = "bad method";
	
	public String doRequest(String arg0) {
		
		try {
			Map<String, Object> request = mapper.readValue(arg0, Map.class);
			if (((String) request.get("method")).equals("getCustomerInfo")) {
				String caNumber = (String) ((Map<String, Object>) request.get("parameters")).get("caNumber");
				String operatorID = (String) ((Map<String, Object>) request.get("parameters")).get("operatorID");
				response = bossService.getCustomerInfo(operatorID, caNumber);
				return response;
			} else if (((String) request.get("method")).equals("getUserProInfo")) {
				String caNumber = (String) ((Map<String, Object>) request.get("parameters")).get("caNumber");
				String operatorID = (String) ((Map<String, Object>) request.get("parameters")).get("operatorID");
				response = sdyxService.getUserProInfo(operatorID, caNumber);
				return response;
			} else if (((String) request.get("method")).equals("getRenewalInfo")) {
				String caNumber = (String) ((Map<String, Object>) request.get("parameters")).get("caNumber");
				String operatorID = (String) ((Map<String, Object>) request.get("parameters")).get("operatorID");
				response = sdyxService.getRenewalInfo(operatorID, caNumber);
				return response;
			} else if (((String) request.get("method")).equals("getCityFlag")) {
				String cityFlag = (String) ((Map<String, Object>) request.get("parameters")).get("cityFlag");
				response = serviceInfoService.getCityFlag(cityFlag);
				return response;
			} else if (((String) request.get("method")).equals("getCustomerNumber")) {
				String caNumber = (String) ((Map<String, Object>) request.get("parameters")).get("caNumber");
				String operatorID = (String) ((Map<String, Object>) request.get("parameters")).get("operatorID");
				response = bossService.getCustomerNumber(operatorID, caNumber);
				return response;
			} else if (((String) request.get("method")).equals("getCustomerBalanceInfo")) {
				String operatorId = (String) ((Map<String, Object>) request.get("parameters")).get("operatorID");
				String customerNumber = (String) ((Map<String, Object>) request.get("parameters")).get("customerNumber"); 
				//response = bossService.getCustomerCommonBalanceInfo(operatorId, customerNumber);
				response = sdyxService.getCustomerCommonBalanceInfo(operatorId, customerNumber);
				return response;
			} else if (((String) request.get("method")).equals("createOrder4Recharge")) {
				String amount = (String) ((Map<String, Object>) request.get("parameters")).get("amount");
				String customerNumber = (String) ((Map<String, Object>) request.get("parameters")).get("customerNumber");
				String operatorID = (String) ((Map<String, Object>) request.get("parameters")).get("operatorID");
				response = "createOrder4Recharge";
				return response;
			} else if (((String) request.get("method")).equals("getAlipayUrl")) {
				String totalPrice = (String) ((Map<String, Object>) request.get("parameters")).get("totalPrice");
				String userCode = (String) ((Map<String, Object>) request.get("parameters")).get("userCode");
				String encryptKey = (String) ((Map<String, Object>) request.get("parameters")).get("encryptKey");
				String orderID = (String) ((Map<String, Object>) request.get("parameters")).get("orderID");
				String passThrough = (String) ((Map<String, Object>) request.get("parameters")).get("passThrough");
				String goodsAmount = (String) ((Map<String, Object>) request.get("parameters")).get("goodsAmount");
				String orderDate = (String) ((Map<String, Object>) request.get("parameters")).get("orderDate");
				String orderDes = (String) ((Map<String, Object>) request.get("parameters")).get("orderDes");
				//response = orderService.getAlipayUrl();
				return response;
			} else if (((String) request.get("method")).equals("getHallInfo")) { 
				String operatorId = (String) ((Map<String, Object>) request.get("parameters")).get("operatorID");
				response = serviceInfoService.getHallByOperationRoleCode(operatorId);
				/*ServiceInfoServiceImpl hello = new ServiceInfoServiceImpl();
				response = hello.getHallByOperationRoleCode(operationRoleCode);
				*/
				return response;
			}else {
				response = "bad method";
				return response;
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response = "runtime error";
		return response;

	}

}
