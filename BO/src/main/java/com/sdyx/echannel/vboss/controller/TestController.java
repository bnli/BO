package com.sdyx.echannel.vboss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sdyx.echannel.vboss.model.TbVbossOrder;
import com.sdyx.echannel.vboss.service.OrderService;
import com.sdyx.echannel.vboss.service.ServiceInfoService;

@Controller
/*@RequestMapping("/order")*/
public class TestController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private ServiceInfoService serviceInfoService;
	
	@RequestMapping("/Test2/{operationRoleCode}")
	public String showHallInfo(ModelMap modelMap, @PathVariable String operationRoleCode){
		String hallInfo = serviceInfoService.getHallByOperationRoleCode(operationRoleCode);
		modelMap.addAttribute("hall", hallInfo);
		return "/Test2";
	}
}
