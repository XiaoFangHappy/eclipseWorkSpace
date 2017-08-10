package test8_2;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Player();
		p1.setName("运动员");
		p1.swim();
		//类型转换 上转型和下转型
		//上转型：自动转型
		//下转型：强制转换类型 一定要类型匹配 才能转换(小类型) 引用名
		Player p3 = (Player) p1;
		p3.train();
		
		Person p2 = new Person();
		p2.setName("普通人");
		p2.swim();
	}
}
