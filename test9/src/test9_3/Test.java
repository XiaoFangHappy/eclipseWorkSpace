package test9_3;
/*
 * 3.定义一个接口ClassName，其中包括一个抽象方法getClassName（），
 * 设计两个类Cat和Dog，两个类都实现这个接口的方法getClassName（），以获取该类的类名。
 * 
 * */
public class Test {
	public static void main(String[] args) {
		ClassName cat = new Cat();
		ClassName dog = new Dog();
		cat.getClassName();
		dog.getClassName();
		
	}
}
