package test7_5;
/*5、圆有半径，并可以计算自己的面积，类里有属性圆数组，
 * 设计数组中获得最大面积的圆、最小面积的圆、所有圆的面积和三个方法。
 * 
 * */
public class CircleTest {
	public static void main(String[] args) {
		Circle[] circles = new Circle[4];
		circles[0] = new Circle(2.8);
		circles[1] = new Circle(4.4);
		circles[2] = new Circle(2.4);
		circles[3] = new Circle(5.9);
		
		Circle c = new Circle(0.0);
		c.setCircles(circles);
		System.out.println("面积最大的圆："+c.maxArea());
		System.out.println("面积最小的圆："+c.minArea());
		
		c.show();
		System.out.println("面积总和："+c.sumArea());
		
	}
}
