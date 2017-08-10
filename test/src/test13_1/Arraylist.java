package test13_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList alist = new ArrayList<>();
		alist.add(1);
		alist.add("a");
		alist.add(2, 5);
		for(Object o:alist) {
			System.out.println(o);
		}
		System.out.println("------------");
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("------------");
		Iterator it = alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
