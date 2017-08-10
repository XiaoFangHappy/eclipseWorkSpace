package test10_2;
/*2.修改1的程序，创建一个名为DuplicateValueException的异常类，以检测用户是否输入了重复的数。
 * 如果用户输入的数已经存在于数组中，则应该抛出一个DuplicateValueException异常。
 * 此外，还要显示一个合适的错误信息。在处理完异常后，程序应该能够继续正常的执行。
*/
public class DuplicateValueException extends Exception{
	public DuplicateValueException() {
	}
	
	//添加构造方法 初始化异常的消息
	public DuplicateValueException(String message) {
		super(message);
	}
}
