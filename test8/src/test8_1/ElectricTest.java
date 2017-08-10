package test8_1;
/*
 * 所有的电器都有用电的方法，电视也用电，但是还可以放电影，
 * 智能手机不但可以放电影还可以打电话。利用继承关系实现。
 * */
public class ElectricTest {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setName("电视机");
		tv.useElcetric();
		tv.showMovie();
		System.out.println("---------------");
		Phone phone = new Phone();
		phone.setName("智能手机");
		phone.useElcetric();
		phone.showMovie();
		phone.call();
	}
}
