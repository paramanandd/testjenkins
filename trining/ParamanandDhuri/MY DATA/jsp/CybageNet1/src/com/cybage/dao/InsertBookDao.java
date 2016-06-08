package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.bean.Book;
import com.cybage.connection.MyConnect;

public class InsertBookDao {

	public int insert(Book bk) throws ClassNotFoundException, SQLException
	{
		Connection con=MyConnect.MyConnection();
		String query="insert into book(bookname,author,price)values(?,?,?) ";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, bk.getBookname());
		st.setString(2, bk.getAuthor());
		st.setInt(3, bk.getPrice());
		return st.executeUpdate();
	}
}
