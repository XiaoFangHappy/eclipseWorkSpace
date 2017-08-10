package test12_4;

import java.lang.reflect.Constructor;

/**
 * 
 * 4、Fruit 类有属性表示个数。两种方法可以通过反射得到对象。实现这两种方法。
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) {
		//第一种：
		try {
			Class c1 = Fruit.class;
			Fruit fruit1 = (Fruit) c1.newInstance();
			System.out.println(fruit1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//第二种
		try {
			Class c2 = Fruit.class;
			Constructor con = c2.getDeclaredConstructor(int.class);
			con.setAccessible(true);
			Fruit fruit2 = (Fruit) con.newInstance(10);
			System.out.println(fruit2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
