package com.sdyx.echannel.vboss.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdyx.echannel.vboss.dao.TbVbossCityFlagDao;
import com.sdyx.echannel.vboss.dao.TbVbossHallDao;
import com.sdyx.echannel.vboss.dao.impl.TbVbossHallDaoImpl;
import com.sdyx.echannel.vboss.model.TbVbossCityFlag;
import com.sdyx.echannel.vboss.model.TbVbossHall;
import com.sdyx.echannel.vboss.service.ServiceInfoService;

@Service("serviceInfoService")
public class ServiceInfoServiceImpl implements ServiceInfoService {

	
	@Autowired
	private TbVbossHallDao tbVbossHallDao;
	
	@Autowired
	private TbVbossCityFlagDao tbVbossCityFlagDao;
	
	ObjectMapper mapper = new ObjectMapper();

	@Override
	public String sayHi(String name) {
		return "hello " + name;
	}
	
	@Override
	public int addHall(TbVbossHall record) {
		// TODO Auto-generated method stub
		tbVbossHallDao.insert(record);
		return 0;
	}

	@Override
	public String getHallByOperationRoleCode(String operationRoleCode) {
		// TODO Auto-generated method stub
		//System.out.println("1");
		try {
		Map<String, Object> result = new HashMap<String, Object>();
		//System.out.println("2");
		result.put("status", "0");
		result.put("errorMessage", "获取成功");
		//System.out.println("3");
		List<Object> halls = new ArrayList<Object>();
		List<TbVbossHall> tbVbossHalls = tbVbossHallDao.selectByOperationRoleCode(operationRoleCode);
		for (TbVbossHall tbVbossHall:tbVbossHalls) {
			Map<String, String> hall = new HashMap<String, String>();
			hall.put("name", tbVbossHall.getName());
			hall.put("address", tbVbossHall.getAddress());
			hall.put("telephone", tbVbossHall.getTelephone());
			halls.add(hall);
			
		}
		//System.out.println("4");
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("halls", halls);
		//System.out.println("5");
		result.put("data", data);
		
		//System.out.println("6");
		
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
	public String getCityFlag(String cityFlag) {
		// TODO Auto-generated method stub
		String stdCityFlag = null;
		TbVbossCityFlag tbVbossCityFlag = tbVbossCityFlagDao.selectByCityFlag(cityFlag);
		if (tbVbossCityFlag != null ) {
			stdCityFlag = tbVbossCityFlag.getStdCityFlag(); 
		}
		if (stdCityFlag == null) {
			return "{\"status\":\"1\",\"errorMessage\":\"获取运营商编码失败\",\"data\":{}}";
		} else {
			return "{\"status\":\"0\",\"errorMessage\":\"获取运营商编码成功\",\"data\":{\"cityFlag\":\""
					+ stdCityFlag
					+ "\"}}";
		}
	}

}
