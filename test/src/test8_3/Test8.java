package test8_3;

import java.util.Arrays;

public class Test8 {
	public static void main(String[] args) {
	
		int[] t={1,2,5,3};
		Arrays.sort(t);
		for(int i=0;i<t.length;i++){
		System.out.print(t[i]);
		}
		System.out.println();
	
		int[] t2=new int[t.length];
		System.arraycopy(t, 0, t2, 0, t.length);
		for(int i=0;i<t2.length;i++){
		System.out.print(t2[i]);
		}


	}
	private static void fun(int x[]) {
		x[0] = 6;

	}
}
