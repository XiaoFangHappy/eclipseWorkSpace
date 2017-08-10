package test9_4;
/*
 * 4.定义一个接口Area，其中包含一个计算面积的抽象方法calculateArea()，
 * 然后设计MyCircle和MyRectangle两个类都实现这个接口中的方法calculateArea()，
 * 分别计算圆和矩形的面积。
 * */
public class MyRectangle implements Area{

	private double width;
	private double height;
	
	@Override
	public double calculateArea() {
		return width*height;
		
	}
	
	public MyRectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}



	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
}
