package test12_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *2、利用反射机制调用小孩的吃方法,吃方法需要传入一个参数，类型为数字
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args)  {	
		try {
			Class c= Child.class;
			Method eat = c.getDeclaredMethod("eat",int.class);
			Constructor con = c.getConstructor(String.class);
		    Object ch = con.newInstance("小红");
		    Object obj = eat.invoke(ch,1);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
