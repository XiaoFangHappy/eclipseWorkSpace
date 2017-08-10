package test16_1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test16_1.util.DbUtil;

public class AccountDao {
	private Connection conn;
	
	
	
	public AccountDao() {
		super();
	}



	public AccountDao(Connection conn) {
		super();
		this.conn = conn;
	}



	public Connection getConn() {
		return conn;
	}



	public void setConn(Connection conn) {
		this.conn = conn;
	}



	public int transMoney(int id,int money) throws SQLException {
		
		PreparedStatement ps = null;
		try {
			
			String sql = "update account set money = money+? where id = ? and (money+?)>=0";
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, money);
			ps.setInt(2, id);
			ps.setInt(3, money);
			
			return ps.executeUpdate();
			
		}finally {
			DbUtil.close(null, ps, null);
		}
		
	}
}
