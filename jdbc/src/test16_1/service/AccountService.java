package test16_1.service;

import java.sql.Connection;
import java.sql.SQLException;

import test16_1.dao.AccountDao;
import test16_1.exception.MyException;
import test16_1.util.DbUtil;

public class AccountService {
	
	public void transfer(int fromId,int toId,int money) throws SQLException, MyException {
		Connection conn = null;
		try {
			conn = DbUtil.getConn();
			conn.setAutoCommit(false);
			
			AccountDao dao = new AccountDao(conn);
			int n = dao.transMoney(fromId, -money);
			if(n == 0) {
				conn.rollback();
				throw new MyException("转出账户异常！");
			}
			
			n = dao.transMoney(toId, money);
			if(n == 0) {
				conn.rollback();
				throw new MyException("转入账户异常！");
			}
			conn.commit();
		}finally {
			DbUtil.close(conn, null, null);
		}
		
		
	}
}
