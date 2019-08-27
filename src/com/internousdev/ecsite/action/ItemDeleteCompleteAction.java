package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemDeleteCompleteAction extends ActionSupport implements SessionAware{

	private String id;
	private Map<String,Object> session;
	private String message;

	public String execute() throws SQLException{
		ItemDeleteCompleteDAO itemDeleteCompleteDAO = new ItemDeleteCompleteDAO();
		int deleteFlg=itemDeleteCompleteDAO.delete(session.get("id").toString());

		if(deleteFlg>0){
			setMessage("商品を削除しました。");
		}else if(deleteFlg==0){
			setMessage("商品の削除に失敗しました。");
		}




		return SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}


}
