package com.qa.ims.persistence.domain;

public class Item {
	
	private long itemId;
	private String itemName;
	private int value;
	
	public Item(long itemId, String itemName, int value) {
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
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
	
}
