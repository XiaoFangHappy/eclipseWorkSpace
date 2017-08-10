package test9_1;
/*
 * 1.编写一个ComputeTotalSales接口,该接口中有一个方法:
Public double totalSalesByYear()有三个实现该接口的类:
Television,Computer和Mobile.这个三个类通过实现接口ComputeTotalSales,
给出自己的年销售额.
有一个Shop类,该类用ComputeTotalSales数组作为成员,
ComputeTotalSales数组的单元可以存放Television对象的引用、
Computer对象的引用或Mobile对象的引用。程序能输出Shop对象的年销售额。
 * */
public class Computer implements ComputeTotalSales{

	@Override
	public double totalSalesByYear() {
		return 11118.0;
	}

}
