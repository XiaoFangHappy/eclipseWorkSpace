package test16_1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test16_1.exception.MyException;
import test16_1.model.Student;
import test16_1.util.DbUtil;

public class StudentDao {
	
	public  void updateScore(ArrayList<Student> students) throws SQLException, MyException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DbUtil.getConn();
			conn.setAutoCommit(false);
			String sql = "update student set score = ? where id = ?";
			ps = conn.prepareStatement(sql);
			
			for(int i = 0;i<students.size();i++) {
				Student student = students.get(i);
				ps.setDouble(1, student.getScore());
				ps.setInt(2, student.getId());
				ps.addBatch();
			}
				
			int[] n =ps.executeBatch();
			
			for(int i = 0;i<n.length;i++) {
				if(n[i] !=1) {
					conn.rollback();
					throw new MyException("修改失败！");
				}
			}
			conn.commit();
			
		}finally {
			DbUtil.close(conn, ps, null);
		}
	}
	
	public ArrayList<Student> selectAll() throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		ArrayList students = new ArrayList();
		try {
			conn = DbUtil.getConn();
			String sql = "select * from student";
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setAge(rs.getInt("age"));
				s.setDepartment(rs.getString("department"));
				s.setName(rs.getString("name"));
				s.setScore(rs.getDouble("score"));
				s.setSex(rs.getString("sex"));
				students.add(s);
			}
			return students;
			
	}finally{
		DbUtil.close(conn, ps, null);
	}
	}
}
