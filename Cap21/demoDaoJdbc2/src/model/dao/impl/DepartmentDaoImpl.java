package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoImpl implements DepartmentDao{
	private Connection conn;
	

	public DepartmentDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;
			try {
				st = conn.prepareStatement("INSERT INTO Department\n"
						+ "()\n"
						+ "VALUES\n"
						+ "(?, ?");
				st.setInt(1, obj.getId());
				st.setString(2, obj.getName());
				
				int rows = st.executeUpdate();
				
				if(rows > 0) {
					ResultSet rs = st.getGeneratedKeys();
					if(rs.next()) {
						int id = rs.getInt(1);
						obj.setId(id);
					}
				}
				else {
					throw new DbException("no values inserted!");
				}
			}catch (SQLException e) {
				System.err.println(e.getMessage());
			}
	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
