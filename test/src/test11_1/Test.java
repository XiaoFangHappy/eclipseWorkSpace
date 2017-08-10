package test11_1;

import java.lang.reflect.Constructor;
public class Test {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		//1  类名.class
		Class c = Student.class;
		System.out.println(c);
		//2 Class.forname
		try {
			Class c1 = Class.forName("test11_1.Student");
			System.out.println(c1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//3 
		Student s = new Student();
		System.out.println(s.getClass());
		
		Constructor[] cons = c.getConstructors();
		for(Constructor con:cons) {
			System.out.println(con);
		}
		
		Constructor con = c.getDeclaredConstructor(null);
		System.out.println(con);
		System.out.println("-------------");
		 con = c.getDeclaredConstructor(String.class,int.class);
		System.out.println(con);
		
		System.out.println("-------------");
		
		
	}
}
