package test10_2;

import java.util.InputMismatchException;
import java.util.Scanner;

import test10_1.NumberNotFoundException;
/*2.修改1的程序，创建一个名为DuplicateValueException的异常类，以检测用户是否输入了重复的数。
 * 如果用户输入的数已经存在于数组中，则应该抛出一个DuplicateValueException异常。
 * 此外，还要显示一个合适的错误信息。在处理完异常后，程序应该能够继续正常的执行。
*/
public class Test {
	public static void main(String[] args){
		int a[] = new int[3];
		System.out.println("请输入数组元素：");
		Scanner s = new Scanner(System.in);
		for(int i = 0;i<a.length;i++) {
			try {
				a[i] = s.nextInt();
				try {
					judge(a,a[i],i);
				} catch (DuplicateValueException e) {
					System.err.println(e.getMessage());
				}
			}catch (InputMismatchException e) {
				System.err.println("输入数字有误,请重新输入：");
				i--;
				s.next();//取走输入有误的内容
			}		
		}
		
		System.out.println("请输入下标：");
		int index  = s.nextInt();
			try {
		        System.out.println(findNum(a,index));
			}catch (NumberNotFoundException e) {
				System.err.println(e.getMessage());
			}  	
			
		System.out.println("请输入数据：");
		int num  = s.nextInt();	
			try {
					System.out.println(findIndex(a, num));
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
	
	public static int judge(int[] num ,int index,int j) throws DuplicateValueException {
		for(int i = 0;i<j;i++) {
			if(index == num[i]) {
				throw new DuplicateValueException("数据重复"+index);
			}
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
