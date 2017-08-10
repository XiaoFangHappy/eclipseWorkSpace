package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test16_1 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydata?useSSL = false";
			String user = "root";
			String password = "NAVH-WK6A-DMVK-DKW3";
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			String sql = "insert into student values(80108,'momo',21,'女','chinese',2)";
			boolean b = stmt.execute(sql);
			System.out.println(b);
			
			sql = "select * from student";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String sex = rs.getString("sex"); 
				System.out.println(name+","+age+","+sex);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();	
				}if(stmt != null) {
					stmt.close();
				}if(conn != null) {
					conn.close();
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
