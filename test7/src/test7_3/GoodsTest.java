package test7_3;
/*3、创建一个代表商品基本信息的类，具有商品ID、商品名称、价格等属性，
 * 有一个带有参数的构造函数，对这些属性进行初始化，然后提供一个可以找到最便宜的商品的方法。
 * 
 * */
public class GoodsTest {
	
	public static void main(String[] args) {
		Goods[] goods = new Goods[4];
		goods[0] = new Goods(1,"巧克力",8.8f);
		goods[1] = new Goods(2,"饼干",7.5f);
		goods[2] = new Goods(3,"奶茶",6.8f);
		goods[3] = new Goods(4,"蛋糕",9.9f);
		
		
		Goods g = new Goods(0,"",0.0f);
		g.setGoods(goods);
		System.out.println(g.minPrice());
		
	}
}
