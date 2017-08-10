package test12_4;

/**
 * 
 * 4、Fruit 类有属性表示个数。两种方法可以通过反射得到对象。实现这两种方法。
 * @author lenovo
 *
 */
public class Fruit {
	private int num;
	
	public Fruit(){
			
	}
		
	private Fruit(int num){
		this.num=num;
	}
	public void set(int num){
		this.num=num;
	}
	public int getNum(){
		return num;
	}

	@Override
	public String toString() {
		return "Fruit [num=" + num + "]";
	}
	
	
}
