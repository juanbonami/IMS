package com.qa.ims.persistence.domain;

public class Order {
	
	private long orderId;
	private long customerId;
	
	public Order(long orderId, long customerId) {
		this.setOrderId(orderId);
		this.setCustomerId(customerId);
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	
	@Override
	public String toString() {
		return "id:" + orderId + " customer number:" + customerId;
	}

}
