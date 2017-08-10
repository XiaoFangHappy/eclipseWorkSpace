package test9_4;
/*
 * 4.定义一个接口Area，其中包含一个计算面积的抽象方法calculateArea()，
 * 然后设计MyCircle和MyRectangle两个类都实现这个接口中的方法calculateArea()，
 * 分别计算圆和矩形的面积。
 * */
public class MyCircle implements Area{
	private double r;
	
	@Override
	public  double calculateArea() {
		return Math.PI*r*r;
		
	}

	public MyCircle(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	
}
