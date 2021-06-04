package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDao;
	private Utils utils;
	
	public OrderController(OrderDAO orderDao, Utils utils) {
		super();
		this.orderDao = orderDao;
		this.utils = utils;
	}
	
	
	
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDao.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}
	
	@Override
	public Order create() {
		LOGGER.info("Please enter new order id");
		long orderId = utils.getLong();
		LOGGER.info("Please enter the corresponding customer id");
		long customerId = utils.getLong();
		Order order = orderDao.create(new Order(orderId, customerId));
		LOGGER.info("Order created");
		return order;
	}
	
	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long orderId = utils.getLong();
		LOGGER.info("Please enter a customer id");
		long customerId = utils.getLong();
		Order order = orderDao.update(new Order(orderId, customerId));
		LOGGER.info("Order Updated");
		return order;
	}
	
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long orderId = utils.getLong();
		return orderDao.delete(orderId);
	}

}
