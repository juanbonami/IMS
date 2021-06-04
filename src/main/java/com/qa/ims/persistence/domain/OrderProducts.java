package com.qa.ims.persistence.domain;

public class OrderProducts {
	
	private long orderId;
	private long itemId;
	
	public OrderProducts(long orderId, long itemId) {
		super();
		this.setOrderId(orderId);
		this.setItemId(itemId);
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	@Override
	public String toString() {
		return "order-id: " + orderId + " item-id: " + itemId;
	}
	
}
