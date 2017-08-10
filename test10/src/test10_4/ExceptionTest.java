package test10_4;

import java.util.InputMismatchException;
import java.util.Scanner;

import test10_3.InvalidInputException;

/*4.定义一个ExceptionTest类。ExceptionTest类不仅要检测除数是否为0和是否为有效的整数输入，
 * 还要确保输入的整数为正数。如果不是，则应该抛出一个InvalidInputException异常，
 * 并显示消息”You must enter positive number”。程序应该捕获该异常，并显示一个错误消息。
*/
public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("请输入两个正整数：");
		Scanner s = new Scanner(System.in);
		
		try {
			int a = s.nextInt();
			int b = s.nextInt();
			
			System.out.println(div(a,b));
		}catch (InvalidInputException e) {
			System.err.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.err.println("You must enter positive number");
		}
	}
	
	public static double div(int a,int b) throws InvalidInputException {
		
		if(b <= 0||a<0) {
			
			throw new InvalidInputException("You must enter positive number");
		}
		return a/b;
	}
}
