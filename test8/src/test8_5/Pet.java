package test8_5;

/*
 * 设计一个宠物商店，商店可以存放5种宠物，宠物信息有宠物名字、宠物年龄、宠物颜色、宠物价格等，
 * 并能根据宠物关键字（如名字）查找到相应宠物信息。
*/
public class Pet {
	String name;
	int age;
	String color;
	double price;
	
	
	public Pet() {
		
	}
	
	public Pet(String name, int age, String color, double price) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", color=" + color + ", price=" + price +  "]";
	}
	
	
}
