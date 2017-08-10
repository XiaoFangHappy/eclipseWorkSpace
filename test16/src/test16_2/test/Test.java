package test16_2.test;

import java.sql.SQLException;
import java.util.Scanner;
import test16_2.dao.UserDao;
import test16_2.model.User;
import test16_2.util.MyUtil;

public class Test {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("输入用户名：");
				String username = s.next();
				User user = UserDao.selectUsername(username);
				if(user != null) {
					while(true) {
						System.out.println("输入密码：");
						String password = s.next();
						if(user.getPassword().equals(password)) {
							System.out.println(user);
							System.out.println("登陆成功！");
							return;
						}else {
							System.out.println("密码错误！");
						}
					}
					
				}else {
					System.out.println("用户名不存在！\n1.注册      2.退出系统");
					String index =s.next();
					switch(index) {
					case "1":
						MyUtil.add(s);
						System.out.println("新增成功！");
						break;
					case "2":
						System.out.println("退出系统！");
						return;
					default:
						System.out.println("输入错误！");
						break;
					}
				}
				
			} catch (SQLException e) {
				System.out.println("异常");
			}
		}

	}
}
