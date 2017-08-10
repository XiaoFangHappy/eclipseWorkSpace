package test16_2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import test16_2.model.User;
import test16_2.util.DbUtil;

public class UserDao {
	
	// 查询用户
	public static User selectUser(String username, String password) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DbUtil.getCon();
			String sql = "select * from user where username = ? and password = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, password);
			User user = null;
			rs = ps.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setBirthday(rs.getDate("birthday"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setSex(rs.getString("sex"));
				user.setUsername(rs.getString("username"));
				user.setAddress(rs.getString("address"));
			}
			return user;
		} finally {
			DbUtil.close(conn, ps, rs);
		}
	}
	public static User selectUsername(String username) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = new User();
		try {
			conn = DbUtil.getCon();
			conn.setAutoCommit(false);
			
			String sql = "select * from user where username = ?";
			ps = conn.prepareStatement(sql);
		
			ps.setString(1, username);
			
			rs = ps.executeQuery();
			while (rs.next()) {
				
				user.setId(rs.getInt("id"));
				user.setBirthday(rs.getDate("birthday"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setSex(rs.getString("sex"));
				user.setUsername(rs.getString("username"));
				user.setAddress(rs.getString("address"));
			}
			return user;
		} finally {
			DbUtil.close(conn, ps, rs);
		}
	}
	//注册新用户
	public static void addUser(User user) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DbUtil.getCon();
			String sql = "insert into user(name,username,password,sex,birthday,address,phone) values(?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getSex());
			ps.setDate(5,user.getBirthday());
			ps.setString(6, user.getAddress());
			ps.setString(7, user.getPhone());

			ps.execute();
			
		} finally {
			DbUtil.close(conn, ps, null);
		}
	}

}
