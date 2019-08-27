package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteCompleteAction extends ActionSupport implements SessionAware{
	private String id;
	private Map<String,Object> session;
	private String message;

	public String execute() throws SQLException{
		UserDeleteCompleteDAO userDeleteCompleteDAO = new UserDeleteCompleteDAO();
		int DeleteFlg=userDeleteCompleteDAO.delete(session.get("id").toString());

		if(DeleteFlg>0){
			setMessage("ユーザーは削除されました。");
		}
		else if(DeleteFlg==0){
			setMessage("ユーザーの削除に失敗しました。");
		}

		return SUCCESS;
	}
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
