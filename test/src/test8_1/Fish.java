package test8_1;

public class Fish extends Animals{
	
	private boolean isEat;
	
	public boolean isEat() {
		return isEat;
	}

	public void setEat(boolean isEat) {
		this.isEat = isEat;
	}

	public void swim() {
		System.out.println("我是一条"+getColor()+"鱼在水里游！");
	}
}
