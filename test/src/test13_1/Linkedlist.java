package test13_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

import javax.sound.midi.Soundbank;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		//Object o1 = list.poll();
		//list.remove(2);
		Object o = list.peek();
		//System.out.println(o1);
		System.out.println(o);
		System.out.println("=----------------=");
		System.out.println(list.size());
		System.out.println("=----------------=");
		list.set(1, "2");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list.get(2));
		System.out.println("=----------------=");
		//System.out.println();
		
		
		Vector v = new Vector<>();
		v.add(1);
		v.addElement(2);
		 it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Stack s = new Stack();
		
	}
	
	
}
