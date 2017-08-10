package util;

import food.Apple;
import food.Banana;
import food.Chocolate;
import food.Food;
import food.Pear;

public class MyPrint {
	public Food[] foods  = new Food[] {new Apple(),new Banana(),new Chocolate(),new Pear()};

	//打印进货单
	public static void printList() {
		System.out.print("请选择你要进的货：");
		System.out.println("***1.苹果      2.香蕉      3.巧克力       4.梨      5.退出***");
	}
	
	

}
