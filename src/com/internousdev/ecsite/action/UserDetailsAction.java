package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserDetailsDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDetailsAction extends ActionSupport implements SessionAware{
	private String id;
	private UserInfoDTO userDetailsDTO = new UserInfoDTO();
	private Map<String,Object> session;
	private String login_id;
	private String login_pass;
	private String user_nam;
	private String insert_date;
	private String updated_date;

	public String execute() throws SQLException{
		UserDetailsDAO userDetailsDAO = new UserDetailsDAO();
		userDetailsDTO=userDetailsDAO.userDetails(id);

		if(userDetailsDTO==null){
			userDetailsDTO=null;
		}
		return SUCCESS;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserInfoDTO getUserDetailsDTO() {
		return userDetailsDTO;
	}

	public void setUserDetailsDTO(UserInfoDTO userDetailsDTO) {
		this.userDetailsDTO = userDetailsDTO;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getLogin_pass() {
		return login_pass;
	}

	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}

	public String getUser_nam() {
		return user_nam;
	}

	public void setUser_nam(String user_nam) {
		this.user_nam = user_nam;
	}

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public String getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}


}
