package test10_5;

import java.util.Scanner;

/*5.从键盘读入一行信息，根据读入的内容来判定是否发生了异常。如果读入的是空串，
 * 则抛出EmptyStringException异常；如果读入的内容中包含有数字，
 * 则抛出IncludeNumberException异常。

提示：程序中用到String的indexOf（）方法，它返回所指定的字符在字符串中第一次出现的位置。
如果这个位置大于等于0，表名字符串中含有该字符。程序中使用循环来查找是否出现0到9这10个数字。
*/
public class Test {
	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		try {
			if(empty(str)) {
				if(number(str)) 
					System.out.println("字符串符合要求");			
			}
		}catch (EmptyStringException e) {
			System.err.println(e.getMessage());
		}catch (IncludeNumberException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static boolean empty(String str) throws EmptyStringException {
		if("".equals(str)) {
			throw new EmptyStringException("空字符串");
		}
		return true;
	}
	public static boolean number(String str) throws IncludeNumberException {
		for(int i = 0;i<=9;i++) {
			if(str.indexOf(i+'0')>=0) {
				throw new IncludeNumberException("有数字");
			}
		}	
		return true;
	}
}
