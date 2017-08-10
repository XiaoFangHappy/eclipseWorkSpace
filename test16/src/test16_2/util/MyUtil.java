package test16_2.util;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

import test16_2.dao.UserDao;
import test16_2.model.User;

public class MyUtil {
	public static void add(Scanner s) throws SQLException {
		try {
			System.out.println("输入姓名：");
			String name = s.next();
			System.out.println("输入用户名：");
			String username = s.next();
			System.out.println("输入密码：");
			String password = s.next();
			System.out.println("输入性别：");
			String sex = s.next();
			System.out.println("输入出生日期：");
			String birthday = s.next();
			System.out.println("输入地址：");
			String address = s.next();
			System.out.println("输入联系电话：");
			String phone = s.next();
			User user = new User(name,username,password,sex,Date.valueOf(birthday),address,phone);
			UserDao.addUser(user);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("输入失败！");
		}
		
	}

}
