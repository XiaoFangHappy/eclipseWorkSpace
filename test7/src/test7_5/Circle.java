package test7_5;
/*5、圆有半径，并可以计算自己的面积，类里有属性圆数组，
 * 设计数组中获得最大面积的圆、最小面积的圆、所有圆的面积和三个方法。
 * 
 * */

public class Circle{
	
	private double r;
	private Circle[] circles;
	
	public Circle maxArea() {
		double max = circles[0].getR();
		int k = 0;
		for(int i = 1;i<circles.length;i++) {
			if(max < circles[i].getR()) {
				max = circles[i].getR();
				k=i;
			}
		}
		return circles[k];
	}

	public Circle minArea() {
		double min = circles[0].getR();
		int k = 0;
		for(int i = 1;i<circles.length;i++) {
			if(min > circles[i].getR()) {
				min = circles[i].getR();
				k=i;
			}
		}
		return circles[k];
	}
	
	
	public double circleArea() {
		return r*r*Math.PI;
	}
	
	public Circle(double r) {
		super();
		this.r = r;
	}
	
	public void show() {
		for(Circle c1:circles) {
			System.out.println("半径为："+c1.getR()+"  圆的面积为："+c1.circleArea());
		}
	}
	
	public double sumArea() {
		double sum = 0.0;
		for(int i=0;i<circles.length;i++) {
			sum += circles[i].circleArea();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r +  "]";
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public Circle[] getCircles() {
		return circles;
	}

	public void setCircles(Circle[] circles) {
		this.circles = circles;
	}
}
