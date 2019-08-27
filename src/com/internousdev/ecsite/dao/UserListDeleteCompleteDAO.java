package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteCompleteDAO {

	public int delete() throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql ="DELETE FROM login_user_transaction WHERE admin_flg<>1";
		int result =0;
		try{
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			result=prepareStatement.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

}
