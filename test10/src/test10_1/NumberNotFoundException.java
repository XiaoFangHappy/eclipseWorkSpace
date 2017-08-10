package test10_1;
/*1.编写一个程序，允许用户向一个大小为10的数组输入整型值。程序应通过索引，
 * 或者通过指定一个大于0的值来查找数组元素，从而获得数组中的值。
 * 程序应处理任何在向数组输入数值或访问数组元素时发生的异常。
 * 此外，程序应使用自定义一个NumberNotFoundException异常处理类。
如果试图访问超出数组边界的元素，则捕获ArrayIndexOutOfBoundsException异常，并显示一个合适的错误消息。
*/
public class NumberNotFoundException extends ArrayIndexOutOfBoundsException{
	public NumberNotFoundException() {
	}
	
	//添加构造方法 初始化异常的消息
	public NumberNotFoundException(String message) {
		super(message);
	}

}
