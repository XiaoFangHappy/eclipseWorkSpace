package test8_4;

public class Test {
	public static void main(String[] args) {
		Animals dog = new Dog();
		dog.setName("狗");
		
		Animals cat = new Cat();
		cat.setName("猫");
		
		Girls g1 = new Girls("小红");
		g1.setAnimal(dog);
		g1.keep();
		
		Girls g2 = new Girls("小花");
		g2.setAnimal(cat);
		g2.keep();
	}
}
