package test12_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 3、电脑类中有一个字符串类型的属性为电脑的牌子，构造方法初始化该牌子，
 * 还有一个打印电脑牌子的方法。利用反射机制来实现给电脑牌子赋值并打印牌子
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) {
	
		try {
			Class c = Computer.class;
			Method ms = c.getDeclaredMethod("print",null);
			Constructor con = c.getConstructor(String.class);
			Object brand = con.newInstance("联想");
			Object obj = ms.invoke(brand, null);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
