package test8_2;
/*
 * 编写一个Java应用程序，该程序包括3个类：Monkey类、People类和主类 Test。要求： 
(1) Monkey类中有个构造方法：Monkey (String s)，并且有个speak() 方法，输出“咿咿呀呀......”的信息。
(2)People类是Monkey类的子类，在People类中重写方法speak(),
在方法中输出“小样的，不错嘛！会说话了！”的信息。新方法think()，
在think方法中输出“别说话！认真思考！” 的信息。
*/
public class Test {
	public static void main(String[] args) {
		Monkey monkey = new Monkey("孙悟空");
		monkey.speak();
		
		System.out.println("-----------");
		People p1 = new People();
		p1.setS("小红");
		p1.speak();
		p1.think();
		
		System.out.println("-----------");
		Monkey p2 = new People();
		p2.setS("小明");
		p2.speak();
	}
}
