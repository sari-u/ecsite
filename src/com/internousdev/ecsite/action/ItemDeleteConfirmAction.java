package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private String id;
	public String execute() throws SQLException{
		session.put("id",id);

		return SUCCESS;

	}

	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}


}
