package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserDeleteCompleteDAO {

	public int delete(String id) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql = "DELETE FROM login_user_transaction WHERE id=?";

		int result=0;
		try{
			PreparedStatement prepareStatement=con.prepareStatement(sql);
			prepareStatement.setString(1, id);

			result=prepareStatement.executeUpdate();

			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				con.close();
			}
		return result;
	}

}
