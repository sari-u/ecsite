package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;


public class ItemCreateCompleteDAO {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();


	public void createItem(String itemName,int intItemPrice,int intItemStock) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql="insert into item_info_transaction(item_name,item_price,item_stock) values(?,?,?)";

		try{
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			prepareStatement.setString(1, itemName);
			prepareStatement.setInt(2, intItemPrice);
			prepareStatement.setInt(3, intItemStock);

			prepareStatement.execute();


		}catch(SQLException e){
		e.printStackTrace();
		}finally{
		con.close();
		}

	}

	public int updateItem(String itemName,int intItemPrice,int intItemStock) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql="UPDATE item_info_transaction SET item_stock=item_stock+? WHERE item_name=? AND item_price=?";

		int result=0;
		try{
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			prepareStatement.setInt(1, intItemStock);
			prepareStatement.setString(2, itemName);
			prepareStatement.setInt(3, intItemPrice);

			result=prepareStatement.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}
}
