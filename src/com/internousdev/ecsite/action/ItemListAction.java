package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport{
	private int id;
	private String item_name;
	private int item_price;
	private int item_stock;
	private ArrayList<ItemListDTO> itemList = new ArrayList<ItemListDTO>();
	private ItemListDAO itemListDAO = new ItemListDAO();

	public String execute() throws SQLException{
		String result = SUCCESS;
		itemList=itemListDAO.getItemListInfo();
		return result;
	}
	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_price() {
		return item_price;
	}

	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}

	public int getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(int item_stock) {
		this.item_stock = item_stock;
	}

	public ArrayList<ItemListDTO> getItemList(){
		return itemList;
	}
	public void setItemList(ArrayList<ItemListDTO> itemList){
		this.itemList=itemList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

