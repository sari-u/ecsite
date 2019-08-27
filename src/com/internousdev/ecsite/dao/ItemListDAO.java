package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {


	private ArrayList<ItemListDTO> itemListDTOList = new ArrayList<ItemListDTO>();

	public ArrayList<ItemListDTO> getItemListInfo()throws SQLException{

		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql = "Select * from item_info_transaction order by id asc";

		try{
			PreparedStatement prepareStatement=con.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();


			while(resultSet.next()){
				ItemListDTO itemListDTO = new ItemListDTO();
				itemListDTO.setId(resultSet.getInt("id"));
				itemListDTO.setItem_name(resultSet.getString("item_name"));
				itemListDTO.setItem_price(resultSet.getInt("item_price"));
				itemListDTO.setItem_stock(resultSet.getInt("item_stock"));

				itemListDTOList.add(itemListDTO);

			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return itemListDTOList;
	}


}
