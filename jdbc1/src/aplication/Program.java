package aplication;

import java.sql.Connection;
<<<<<<< HEAD
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
=======
>>>>>>> 424f8651b408ea611c075d4b627a36c2efa05cc0

import db.DB;

public class Program {

	public static void main(String[] args) {

<<<<<<< HEAD
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
	
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
=======
		Connection conn = DB.getConnection();
		DB.closeConnection();
>>>>>>> 424f8651b408ea611c075d4b627a36c2efa05cc0
	}
}