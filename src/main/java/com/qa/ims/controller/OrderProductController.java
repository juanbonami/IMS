package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderProductDAO;
import com.qa.ims.persistence.domain.OrderProducts;
import com.qa.ims.utils.Utils;

public class OrderProductController implements CrudController<OrderProducts> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderProductDAO orderProductDao;
	private Utils utils;

	public OrderProductController(OrderProductDAO orderProductDao, Utils utils) {
		super();
		this.orderProductDao = orderProductDao;
		this.utils = utils;
	}

	@Override
	public List<OrderProducts> readAll() {
		List<OrderProducts> orderProducts = orderProductDao.readAll();
		for (OrderProducts product : orderProducts) {
			LOGGER.info(product);
		}
		return orderProducts;
	}

	@Override
	public OrderProducts create() {
		LOGGER.info("Please enter order id");
		long orderId = utils.getLong();
		LOGGER.info("Please enter the item id");
		long itemId = utils.getLong();
		OrderProducts orderProducts = orderProductDao.create(new OrderProducts(orderId, itemId));
		LOGGER.info("Item added!");
		return orderProducts;
	}

	@Override
	public OrderProducts update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter new item id");
		long itemId = utils.getLong();
		OrderProducts orderProducts = orderProductDao.update(new OrderProducts(orderId, itemId));
		LOGGER.info("Order Updated");
		return orderProducts;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long orderId = utils.getLong();
		return orderProductDao.delete(orderId);
	}

}
