package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DBException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		
		try{
			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE Department = 1");
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE Department = 2");

			conn.commit();
			
		}catch (SQLException e) {
				try {
					conn.rollback();
					throw new DBException("Transaction rolled back! Caused by:" + e.getMessage());
				} catch (SQLException e1) {
					throw new DBException("Transaction NOT rolled back! Caused by: " + e1.getMessage());
									}
		}
		finally {
			DB.CloseStatement(st);
			DB.closeConnection();
		}
		

		
		
		
		
		}
		
	}


