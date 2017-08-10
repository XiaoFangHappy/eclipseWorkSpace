package test10_5;
/*5.从键盘读入一行信息，根据读入的内容来判定是否发生了异常。如果读入的是空串，
 * 则抛出EmptyStringException异常；如果读入的内容中包含有数字，
 * 则抛出IncludeNumberException异常。

提示：程序中用到String的indexOf（）方法，它返回所指定的字符在字符串中第一次出现的位置。
如果这个位置大于等于0，表名字符串中含有该字符。程序中使用循环来查找是否出现0到9这10个数字。
*/
public class IncludeNumberException extends Exception{
	public IncludeNumberException() {
		// TODO Auto-generated constructor stub
	}
	public IncludeNumberException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
