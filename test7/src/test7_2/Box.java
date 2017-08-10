package test7_2;
/**
 * 2、给箱子里装上电脑，第二个电脑的牌子设置为ibm，箱子有一个可以打印所有电脑牌子的方法
 */

public class Box {
	private Computer[] computers;
	
	public Box(Computer[] computers) {
		this.computers = computers;
	}
	
	public void show() {
		for(Computer c:computers) {
				System.out.println(c.getBrand());	
		}
		
	}

	public Computer[] getComputers() {
		return computers;
	}

	public void setComputers(Computer[] computers) {
		this.computers = computers;
	}
	
	
}
