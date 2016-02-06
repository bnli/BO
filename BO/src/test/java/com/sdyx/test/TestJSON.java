package com.sdyx.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sdyx.echannel.vboss.dao.TbVbossHallDao;
import com.sdyx.echannel.vboss.dao.impl.TbVbossHallDaoImpl;
import com.sdyx.echannel.vboss.model.TbVbossHall;
import com.sdyx.echannel.vboss.service.OrderService;
import com.sdyx.echannel.vboss.service.ServiceInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestJSON {

	private static final Logger LOGGER = Logger
			.getLogger(TestDB.class);

	@Autowired
	private OrderService orderService;
	@Autowired
	private ServiceInfoService serviceInfoService;
	
	@Test
	public void Test2() {
		System.out.println(serviceInfoService.getHallByOperationRoleCode("WF"));
	}
	
	@Test
	public void Test1() {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Map<String, Object> request = mapper.readValue(new File("C:\\workspaces\\MyEclipse 10\\PortalServer-App\\src\\test\\resources\\JSON.txt"), Map.class);
			if (((String)request.get("method")).equals("createOrder4Recharge")) {
				
				String amount = (String) ((Map<String, Object>) request.get("parameters")).get("amount");
				String customerNumber = (String) ((Map<String, Object>) request.get("parameters")).get("customerNumber");
				String operatorID = (String) ((Map<String, Object>) request.get("parameters")).get("operatorID");
				
				System.out.println(amount + " " + customerNumber + " " + operatorID);
				
				
			} if (((String)request.get("method")).equals("createOrder4Products")) {
				System.out.println("createOrder4Products");
			}

			
			
			
		
			Map<String, Object> userData = new HashMap<String, Object>();
			Map<String,String> nameStruct = new HashMap<String,String>();
			nameStruct.put("first", "Joe");
			nameStruct.put("last", "Hankcs");
			userData.put("name", nameStruct);
            userData.put("gender", "MALE");
            userData.put("verified", Boolean.FALSE);
            userData.put("userImage", "Rm9vYmFyIQ==");
            System.out.println(mapper.writeValueAsString(userData));
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
	}
}
