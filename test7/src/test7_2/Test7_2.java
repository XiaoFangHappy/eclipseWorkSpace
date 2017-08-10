package test7_2;

/**
 * 2、给箱子里装上电脑，第二个电脑的牌子设置为ibm，箱子有一个可以打印所有电脑牌子的方法
 */

public class Test7_2 {
	public static void main(String[] args) {
		Computer[] computers = new Computer[4];

		computers[0] = new Computer();
		computers[1] = new Computer();
		computers[2] = new Computer();
		computers[3] = new Computer();
		
		computers[1].setBrand("ibm");;
		
		Box b1 = new Box(computers);
		b1.show();
		
	}

}
