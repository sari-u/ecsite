package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private String itemName;
	private int itemPrice;
	private int itemStock;
	public Map<String,Object> session;
	private ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException{
		int intItemPrice = Integer.parseInt(session.get("itemPrice").toString());
		int intItemStock = Integer.parseInt(session.get("itemStock").toString());

		int rs=itemCreateCompleteDAO.updateItem(session.get("itemName").toString(), intItemPrice, intItemStock);

		if(rs==0){
		itemCreateCompleteDAO.createItem(session.get("itemName").toString(), intItemPrice,intItemStock);
		}
		String result = SUCCESS;
		return result;

	}

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public int getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice=itemPrice;
	}
	public int getItemStock(){
		return itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock=itemStock;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}


}
