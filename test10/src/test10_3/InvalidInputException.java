package test10_3;

/*3.定义一个InvalidInputException类。该类应是Exception的直接子类。
它应指定默认消息“Your input was invalid”，但允许程序员也能够指定某个定制的消息。*/
public class InvalidInputException extends Exception{
	public InvalidInputException() {
		super("Your input was invalid");
	}
	public InvalidInputException(String str){
		super(str);
	}
}
