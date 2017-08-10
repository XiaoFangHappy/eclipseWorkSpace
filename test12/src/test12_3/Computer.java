package test12_3;

/**
 * 3、电脑类中有一个字符串类型的属性为电脑的牌子，构造方法初始化该牌子，
 * 还有一个打印电脑牌子的方法。利用反射机制来实现给电脑牌子赋值并打印牌子
 * @author lenovo
 *
 */
public class Computer {
	public String brand;
	
	public Computer(String brand) {
		this.brand = brand;
	}

	public void print() {
		System.out.println("电脑牌子是："+this.brand);
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
