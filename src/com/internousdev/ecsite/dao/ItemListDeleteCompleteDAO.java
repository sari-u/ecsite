package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
public class ItemListDeleteCompleteDAO {

	public int itemListDelete() throws SQLException{

		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql = "delete from item_info_transaction";
		int result=0;
		try{
			PreparedStatement prepareStatement=con.prepareStatement(sql);
			result=prepareStatement.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

}

