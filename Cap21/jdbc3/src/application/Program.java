package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, Birthdate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)"
					);
			st.setString(1, "Lucas rodrigues");
			st.setString(2, "Lucasrodriguezy@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/10/1999").getTime()));
			st.setDouble(4, 3200.0);
			st.setInt(5, 1);
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Rows affected : " + rowsAffected);
			
		}
		catch (SQLException e) {
			e.printStackTrace()	;
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.CloseStatement(st);
			DB.closeConnection();
			
		}
		
		
		}
		
	}


