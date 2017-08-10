package test13_1;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * 1. 写一个程序，实用HashSet来存放一些石头(Rock) 对象，并迭代输出石头的名字。
 * @author lenovo
 *
 */
public class HashSetTest {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Rock r1 = new Rock("宝石");
		Rock r2 = new Rock("钻石");
		Rock r3 = new Rock("水晶");
		Rock r4 = new Rock("鹅卵石");
		
		set.add(r1);
		set.add(r2);
		set.add(r3);
		set.add(r4);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Rock o = (Rock) it.next();
			System.out.println(o.getName());

		}
	}
}
