package test10_1;

import java.util.InputMismatchException;
import java.util.Scanner;
/*1.编写一个程序，允许用户向一个大小为10的数组输入整型值。程序应通过索引，
 * 或者通过指定一个大于0的值来查找数组元素，从而获得数组中的值。
 * 程序应处理任何在向数组输入数值或访问数组元素时发生的异常。
 * 此外，程序应使用自定义一个NumberNotFoundException异常处理类。
如果试图访问超出数组边界的元素，则捕获ArrayIndexOutOfBoundsException异常，并显示一个合适的错误消息。
*/
public class Test {
	public static void main(String[] args){
		int a[] = new int[10];
		System.out.println("请输入数组元素：");
		Scanner s = new Scanner(System.in);
		for(int i = 0;i<a.length;i++) {
			try {
				a[i] = s.nextInt();
			}catch (InputMismatchException e) {
				System.err.println("输入数字有误,请重新输入：");
				i--;
				s.next();//取走输入有误的内容
			}	
		}
		
		System.out.println("请输入下标：");
		int index  = s.nextInt();
			try {
		        System.out.println("下标是："+index+"的数据是："+findNum(a,index));
			}catch (NumberNotFoundException e) {
				System.err.println(e.getMessage());
			}  
			
		System.out.println("请输入数据：");
		int num  = s.nextInt();	
			try {
				 System.out.println(num+"的下标是："+findIndex(a, num));
			}catch (NumberNotFoundException e) {
				System.err.println(e.getMessage());
			}
	}

	public static int findNum(int[] num,int index) {
		if(index < 0 || index >= num.length) {
			throw new NumberNotFoundException("数组索引越界"+"["+index+"]");
		}
		return num[index];
	}
	
	public static int findIndex(int[] num,int index) {
		int i;
		for(i = 0;i<num.length;i++) {
			if(num[i]==index) {
				return i;
			}
		}
		throw new NumberNotFoundException(index+"不存在数组中！");
	}
	
}
