package test12_2;

/**
 *2、利用反射机制调用小孩的吃方法，吃方法，吃方法需要传入一个参数，类型为数字
 * @author lenovo
 *
 */
public class Child {
	public String name;
	
	public Child() {
		
	}
	public Child(String name) {
		this.name  = name;
	}
	
	public void eat(int number) {
		System.out.println(name+"吃了"+number+"顿饭");
	}
	
	
}