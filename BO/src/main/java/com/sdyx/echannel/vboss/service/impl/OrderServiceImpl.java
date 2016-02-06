package com.sdyx.echannel.vboss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sdyx.echannel.vboss.dao.TbVbossOrderDao;
import com.sdyx.echannel.vboss.model.TbVbossOrder;
import com.sdyx.echannel.vboss.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private TbVbossOrderDao tbVbossOrderDao;
	
	@Override
	public TbVbossOrder getOrderById(Long id) {
		// TODO Auto-generated method stub
		return tbVbossOrderDao.selectByPrimaryKey(id);
	}

}
