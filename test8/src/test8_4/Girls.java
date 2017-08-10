package test8_4;
/*
 * 两个小女孩分别养了猫和狗，猫和狗继承了类：动物。让各小女孩家的宠物叫一声。
 * */

public class Girls {
	String name;
	public Animals animal;
	
	public void keep() {
		System.out.print(name+"让"+animal.getName()+"叫     ");
		animal.shout();
	}

	public Animals getAnimal() {
		return animal;
	}

	public void setAnimal(Animals animal) {
		this.animal = animal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Girls(String name) {
		super();
		this.name = name;
	}

}
