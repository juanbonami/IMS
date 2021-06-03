package com.qa.ims.persistence.domain;

public class Item {
	
	private long itemId;
	private String itemName;
	private long value;
	
	public Item(long itemId, String itemName, long value) {
		this.setItemId(itemId);
		this.setItemName(itemName);
		this.setValue(value);
	}
	
	public long getItemId() {
		return itemId;
	}
	
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public long getValue() {
		return value;
	}
	
	public void setValue(long value) {
		this.value = value;
	}
	
	
	
}
