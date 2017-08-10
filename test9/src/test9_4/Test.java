package test9_4;
/*
 * 4.定义一个接口Area，其中包含一个计算面积的抽象方法calculateArea()，
 * 然后设计MyCircle和MyRectangle两个类都实现这个接口中的方法calculateArea()，
 * 分别计算圆和矩形的面积。
 * */
public class Test {

	public static void main(String[] args) {
		Area circle = new MyCircle(4.4);
		System.out.println("圆的面积："+circle.calculateArea());;
		
		Area rectangle = new MyRectangle(7.5,10.0);
		System.out.println("矩形的面积："+rectangle.calculateArea());
	}
}
