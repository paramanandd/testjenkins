package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cybage.bean.Login;
import com.cybage.connection.MyConnect;

public class LoginDao {
	
	public boolean validate(Login lg) throws SQLException, ClassNotFoundException
	{
	Connection  con=MyConnect.MyConnection();
	String query="select username,password from login where username=? and password=? ";
	PreparedStatement st=con.prepareStatement(query);
	st.setString(1, lg.getUser());
	st.setString(2, lg.getPassword());
	ResultSet rs=st.executeQuery();
	if(rs.next())
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
