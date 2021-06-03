package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private ItemDAO itemDao;
	private Utils utils;

	public ItemController(ItemDAO itemDao, Utils utils) {
		super();
		this.itemDao = itemDao;
		this.utils = utils;
	}

	@Override
	public List<Item> readAll() {
		List<Item> items = itemDao.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}

	@Override
	public Item create() {
		LOGGER.info("Please enter new item id");
		long itemId = utils.getLong();
		LOGGER.info("Please enter the item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter item value");
		long value = utils.getLong();
		Item item = itemDao.create(new Item(itemId, itemName, value));
		LOGGER.info("item created");
		return item;
	}

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long itemId = utils.getLong();
		LOGGER.info("Please enter item name");
		String itemName = utils.getString();
		LOGGER.info("Please enter item value");
		long value = utils.getLong();
		Item item = itemDao.create(new Item(itemId, itemName, value));
		LOGGER.info("item Updated");
		return item;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long itemId = utils.getLong();
		return itemDao.delete(itemId);
	}

}
