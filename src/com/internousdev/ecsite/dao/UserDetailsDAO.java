package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserDetailsDAO {
	private UserInfoDTO userInfoDTO = new UserInfoDTO();

	public UserInfoDTO userDetails(String id) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql="SELECT * FROM login_user_transaction WHERE id=?";

		try{
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			prepareStatement.setString(1, id);

			ResultSet resultSet=prepareStatement.executeQuery();

			while(resultSet.next()){
				userInfoDTO.setId(resultSet.getString("id"));
				userInfoDTO.setLogin_id(resultSet.getString("login_id"));
				userInfoDTO.setLogin_pass(resultSet.getString("login_pass"));
				userInfoDTO.setUser_name(resultSet.getString("user_name"));
				userInfoDTO.setInsert_date(resultSet.getString("insert_date"));
				userInfoDTO.setUpdated_date(resultSet.getString("updated_date"));

			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return userInfoDTO;
	}

}
