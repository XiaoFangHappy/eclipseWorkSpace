package test12_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 
 * 1、打印一个类的全部信息的方法。
 * 这个程序将提醒用户输入完整类名，然后输出类中所有的方法和构造器的声明，以及全部属性。
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入完整的类名：");
		String string = s.nextLine();
		
		Class c = null;
		
		System.out.println(string+"中构造方法：");
		try {
			c = Class.forName(string);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor[] cons = c.getConstructors();
		for(Constructor con : cons) {
			System.out.println(con);
		}
		System.out.println("-------------------------");
		System.out.println(string+"中方法：");
		Method[] ms = c.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println(m);
		}
		System.out.println("------------------------");
		System.out.println(string+"中的属性：");
		Field[] fs = c.getDeclaredFields();
		for(Field f:fs) {
			System.out.println(f);
		}
	}
}
