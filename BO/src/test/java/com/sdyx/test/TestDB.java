package com.sdyx.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.sdyx.echannel.vboss.model.TbVbossHall;
import com.sdyx.echannel.vboss.model.TbVbossOrder;
import com.sdyx.echannel.vboss.service.BossService;
import com.sdyx.echannel.vboss.service.OrderService;
import com.sdyx.echannel.vboss.service.SdyxService;
import com.sdyx.echannel.vboss.service.ServiceInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestDB {

	private static final Logger LOGGER = Logger
			.getLogger(TestDB.class);

	@Autowired
	private OrderService orderService;
	@Autowired
	private ServiceInfoService serviceInfoService;
	@Autowired
	private BossService bossService;
	@Autowired
	private SdyxService sdyxService;
	
	@Test
	public void Test10() {
		System.out.println(bossService.getCustomerInfo("ZB", "8533002140343810"));
		System.out.println(sdyxService.getUserProInfo("ZB", "8533002140343810"));
		System.out.println(sdyxService.getRenewalInfo("ZB", "8533002140343810"));
		System.out.println(serviceInfoService.getCityFlag("4608"));
		System.out.println(bossService.getCustomerNumber("ZB", "8533002140343810"));
		System.out.println(sdyxService.getCustomerCommonBalanceInfo("ZB", "030730000462"));
	}
	
	@Test
	public void Test9() {
		System.out.println(sdyxService.getRenewalInfo("DY", "8546002492845193"));
		
	}
	
	@Test
	public void Test8() {
		System.out.println(sdyxService.getUserProInfo("DY", "8546002492845193"));
		
	}
	
	@Test
	public void Test4() {
		System.out.println(bossService.getCustomerCommonBalanceInfo("DY", "05060027813"));
		
	}
	
	@Test
	public void Test7() {
		System.out.println(bossService.getCustomerInfo("ZB", "8533002140343810"));
		
	}
	
	@Test
	public void Test6() {
		System.out.println(serviceInfoService.getCityFlag("4096"));
		
	}
	
	@Test
	public void Test5() {
		System.out.println(bossService.getCustomerNumber("DY", "8546002492845193"));
		
	}
	
	@Test
	public void Test1() {
		TbVbossOrder tbVbossOrder = orderService.getOrderById((long) 123);
		LOGGER.info(JSON.toJSON(tbVbossOrder));
		
	}
	
	@Test
	public void Test2() {
		System.out.println(serviceInfoService.getHallByOperationRoleCode("DY"));
	}

	
	@Test
	public void Test3() {
		
		
		
		try {
			Scanner cin = new Scanner(
					new FileInputStream(
							"C:\\workspaces\\MyEclipse 10\\PortalServer-App\\src\\test\\resources\\dy.txt"));
			long num = Long.parseLong(cin.nextLine());
			for (int i = 0; i < num; i++) {
				TbVbossHall record = new TbVbossHall();
				
				record.setCreateAt(new Date());
				record.setOperationRoleCode("DY");
				record.setOrganizationUnitCode(cin.nextLine());
				record.setName(cin.nextLine());
				record.setAddress(cin.nextLine());
				record.setTelephone(cin.nextLine());

				serviceInfoService.addHall(record);
				
			}

			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
