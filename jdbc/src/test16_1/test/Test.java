package test16_1.test;

import java.sql.SQLException;

import test16_1.exception.MyException;
import test16_1.service.AccountService;

public class Test {
	public static void main(String[] args) {
		AccountService as = new AccountService();
		try {
			as.transfer(1, 2, 100);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("hahahahah");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
