package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {

	private ArrayList<UserListDTO> userList = new ArrayList<UserListDTO>();

	public ArrayList<UserListDTO> getUserListInfo() throws SQLException{

	DBConnector dbConnector = new DBConnector();
	Connection con = dbConnector.getConnection();

	String sql = "SELECT id,login_id,login_pass,user_name,insert_date FROM login_user_transaction order by id asc";

	try{
		PreparedStatement prepareStatement=con.prepareStatement(sql);
		ResultSet resultSet = prepareStatement.executeQuery();

		while(resultSet.next()){
			UserListDTO userListDTO = new UserListDTO();
			userListDTO.setId(resultSet.getInt("id"));
			userListDTO.setLogin_id(resultSet.getString("login_id"));
			userListDTO.setLogin_pass(resultSet.getString("login_pass"));
			userListDTO.setUser_name(resultSet.getString("user_name"));
			userListDTO.setInsert_date(resultSet.getString("insert_date"));

			userList.add(userListDTO);
		}
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return userList;
	}

}
