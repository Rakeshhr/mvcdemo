package com.cruds.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.cruds.demo.db.DBConnectionManager;


public class insertDao {
	public boolean create(String firstName, String lastName)
	{
		int rows =0;
		try(Connection conn = DBConnectionManager.getCOnnection();)
		{
			String sql = "insert into name values(?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			rows = ps.executeUpdate();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows>0;
	
	}
}
