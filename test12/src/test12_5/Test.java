package test12_5;

import java.lang.reflect.Field;

/**
 * 5、写一个方法获得ic_launcher属性的值
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) {
		try {
			Class c = R.class;
		    Class[] c1 = c.getDeclaredClasses();
		    Field f = c1[0].getDeclaredField("ic_launcher");
		    Object obj = f.get(c1);
		    
			System.out.println(obj);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}