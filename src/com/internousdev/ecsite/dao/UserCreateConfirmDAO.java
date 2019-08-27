package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserCreateConfirmDAO {

	public boolean check(String loginUserId) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql ="SELECT COUNT( * ) FROM login_user_transaction where login_id=?";

		boolean result=false;
		try{
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			prepareStatement.setString(1, loginUserId);
			ResultSet resultSet=prepareStatement.executeQuery();

			if(resultSet.next()){
				if(resultSet.getInt("count( * )")>0){
					result=true;
				}
			}


		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;

	}

}
