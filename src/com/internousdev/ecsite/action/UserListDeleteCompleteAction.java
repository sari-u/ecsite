package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport{

	private String message;

	public String execute() throws SQLException{
		String result = SUCCESS;

		UserListDeleteCompleteDAO userListDeleteCompleteDAO = new UserListDeleteCompleteDAO();

		int rs=userListDeleteCompleteDAO.delete();

		if(rs>0){
			setMessage("すべてのユーザーを削除しました。");
		}else{
			setMessage("ユーザーの削除に失敗しました。");
		}
		return result;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

}
