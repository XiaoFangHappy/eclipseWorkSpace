package test16_3.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import test16_3.dao.PetDao;
import test16_3.model.Pet;

public class MyUtil {
	
	public static void selectAll() throws SQLException {
		System.out.println("宠物商店有宠物：");
		ArrayList pets = PetDao.selectAll();
		
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void selectCN(Scanner s) throws SQLException {
		System.out.println("请输入宠物的颜色或名称：");
		String string = s.next();
		ArrayList<Pet> pets = PetDao.selectCN(string);
		if(pets.size() != 0) {
			System.out.println(pets);
		}else {
			System.out.println("找不到该宠物！");
		}
		

	}

	public static void buyPet(Scanner s) throws SQLException {
		System.out.println("宠物商店有宠物：");
		ArrayList pets = PetDao.selectAll();
		
		Iterator<Pet> it = pets.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("请输入要购买的宠物的id：");
		try {
			
			int index = s.nextInt();
			
			if(PetDao.deletePet(index)>0) {
				System.out.println("购买成功！");
			}else {
				System.out.println("购买失败！");
			}
		} catch (InputMismatchException e) {
			System.out.println("输入不规范！");
		}

	}

	public static void updatePrice(Scanner s) throws SQLException {
		System.out.println("请输入要修改的宠物的id：");
		Pet p = new Pet();
		Integer index = null;
		Double price = null;
		try {
			index = s.nextInt();

			p.setId(index);
			System.out.println("请输入价格：");

			price = s.nextDouble();

			p.setPrice(price);
			if (PetDao.updatePrice(p) > 0) {
				System.out.println("修改成功！");
			} else {
				System.out.println("修改失败！");
			}
		} catch (InputMismatchException e) {
			System.out.println("输入不规范！");
		}

	}
}
