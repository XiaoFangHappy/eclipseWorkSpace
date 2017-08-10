package test8_5;


/*
 * 设计一个宠物商店，商店可以存放5种宠物，宠物信息有宠物名字、宠物年龄、宠物颜色、宠物价格等，
 * 并能根据宠物关键字（如名字）查找到相应宠物信息。
*/
public class PetStore {
	Pet[] pets;
	public Pet selectName(Pet[] pets,String name) {
		for(Pet p:pets) {
			if(name.equals(p.getName())) {
				return p;
			}
		}
		
		return null;
		
	}

	public Pet[] getPets() {
		return pets;
	}
	public void setPets(Pet[] pets) {
		this.pets = pets;
	}
	
	
}
