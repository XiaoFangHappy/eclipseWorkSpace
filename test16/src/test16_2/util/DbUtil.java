package test16_2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("数据库驱动加载失败！");
		}
		
	}
	
	public static Connection getCon() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/mydata?useSSL=false";
		String user = "root";
		String password = "123456";
		//Connection conn = DriverManager.getConnection(url, user, password);
		return DriverManager.getConnection(url, user, password);
	}
	
	public static void close(Connection conn,Statement stmt,ResultSet rs) {
		
			try {
				if(rs != null) {
					rs.close();
				}if(stmt != null) {
					stmt.close();
				}if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				System.out.println("关闭连接异常！");
			}
		
	}
}
