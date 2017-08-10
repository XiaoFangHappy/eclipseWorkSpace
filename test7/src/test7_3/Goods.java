package test7_3;


/*3、创建一个代表商品基本信息的类，具有商品ID、商品名称、价格等属性，
 * 有一个带有参数的构造函数，对这些属性进行初始化，然后提供一个可以找到最便宜的商品的方法。
 * 
 * */
public class Goods {
	private int id;
	private String name;
	private float price;
	private Goods[] goods;
	
	 public  Goods minPrice() {
		 
			float min = goods[0].getPrice();
			int k = 0;
			for(int i = 1;i<goods.length;i++) {
				if(min > goods[i].getPrice()) {
					min = goods[i].getPrice();
					k=i;
				}
				
			}
			return goods[k];
		}
	
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Goods(int id,String name,float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Goods[] getGoods() {
		return goods;
	}

	public void setGoods(Goods[] goods) {
		this.goods = goods;
	}

}
