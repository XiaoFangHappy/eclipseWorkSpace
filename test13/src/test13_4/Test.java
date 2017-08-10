package test13_4;

import java.util.HashMap;

/**
 * 创建一个KeyTest类,让这个类的对象作为HashMap 的键Key使用,并找出相应的Value值。
 * @author lenovo
 *
 */
public class Test {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put(new KeyTest("a"), "小明");
		map.put(new KeyTest("b"), "小华");
		map.put(new KeyTest("c"), "小红");
		map.put(new KeyTest("d"), "小丽");
		
		System.out.println(map.get(new KeyTest("a")));
		System.out.println(map.get(new KeyTest("b")));
		System.out.println(map.get(new KeyTest("c")));
		System.out.println(map.get(new KeyTest("d")));
	}
}
