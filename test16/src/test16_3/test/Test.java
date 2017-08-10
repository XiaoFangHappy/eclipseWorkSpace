package test16_3.test;

import java.sql.SQLException;
import java.util.Scanner;

import test16_3.dao.PetDao;
import test16_3.util.MyUtil;

/*3、宠物商店  将宠物的信息放在数据库中
（1）查看宠物信息：显示商店中所有的宠物列表。
（2）根据颜色或者宠物名称搜索宠物。
（3）购买宠物，将数据库中的宠物删除。
（4）修改宠物的价格*/

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("1.查看宠物  2.搜索宠物  3.购买宠物  4.修改宠物价格  5.退出");
			
			try {
				String str = s.next();
				switch (str) {
				case "1":
					MyUtil.selectAll();
					break;
				case "2":
					MyUtil.selectCN(s);
					break;
				case "3":
					MyUtil.buyPet(s);
					break;
				case "4":
					MyUtil.updatePrice(s);
					break;
				case "5":
					System.out.println("退出成功！");
					return;
				default :
					System.out.println("输入错误：");
					break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				s.next();
			}
		}
		

	}
}
