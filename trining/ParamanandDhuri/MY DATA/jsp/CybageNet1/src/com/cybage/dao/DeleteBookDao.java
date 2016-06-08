package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.connection.MyConnect;

public class DeleteBookDao {
	public int delete(String bookname) throws ClassNotFoundException, SQLException
	{
		Connection con=MyConnect.MyConnection();
		String query="delete from book where bookname=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, bookname);
		return st.executeUpdate();
	}
}
