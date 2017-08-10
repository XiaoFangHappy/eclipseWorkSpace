package test8_5;

public class Test {
	public static void main(String[] args) {
		Pet[] pets = new Pet[5];
		
		pets[0] = new Cat("小猫",1,"花色",345.9);
		pets[1] = new Dog("小狗",2,"棕色",78.8);
		pets[2] = new Duck("小鸭子",1,"黄色",5.0);
		pets[3] = new Pig("小猪",2,"粉色",200.0);
		pets[4] = new Rabbit("小兔子",1,"白色",20.0);
		
		PetStore petstore = new PetStore();
		petstore.setPets(pets);
		Pet p1 = petstore.selectName(pets, "小兔子");
		System.out.println(p1);
		
	}
}
