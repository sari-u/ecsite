package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport{
	private UserListDAO userListDAO = new UserListDAO();
	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();
	private int id;
	private String login_id;
	private String login_passwrod;
	private String user_id;
	private String insert_date;

	public String execute() throws SQLException{
		userList=userListDAO.getUserListInfo();
		String result =SUCCESS;
		return result;
	}

	public ArrayList<UserListDTO> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<UserListDTO> userList) {
		this.userList = userList;
	}

	public UserListDAO getUserListDAO() {
		return userListDAO;
	}

	public void setUserListDAO(UserListDAO userListDAO) {
		this.userListDAO = userListDAO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getLogin_passwrod() {
		return login_passwrod;
	}

	public void setLogin_passwrod(String login_passwrod) {
		this.login_passwrod = login_passwrod;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}
}
