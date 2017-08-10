package test12_6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import test12_5.R;

public class Test {
	public static void main(String[] args) {
		try {
			/*Class c = Outter.class;
		    Class[] c1 = c.getDeclaredClasses();
		    
		    Method test = c1[0].getDeclaredMethod("test", null);
		    test.setAccessible(true);
		    Field in = c.getDeclaredField("in");
		    in.setAccessible(true);
		    Object inner = in.get(c.newInstance());
		    test.invoke(inner,null);*/
		    
		    Class c= Outter.class;
		    Field f = c.getDeclaredField("in");
			f.setAccessible(true);
			Object in = f.get(c.newInstance());
			Class inner = in.getClass();
			Method test = inner.getDeclaredMethod("test", null);
			test.setAccessible(true);
		    test.invoke(in,null);
		    
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
