package shop;
import customer.Customer;
import exception.ShoppingException;
import food.Apple;
import food.Banana;
import food.Chocolate;
import food.Food;
import food.Pear;

public class Shop {
	public Stocker stocker;
	public Salar salar;
	public Customer customer;
	public Food[] foods=new Food[] {new Apple(),new Banana(),new Chocolate(),new Pear()};;
	
	
	//商店进货，调用进货员的stock的方法
	public void stock() throws ShoppingException{
		if(stocker == null){
			throw new ShoppingException("没有进货员");
		}
		System.out.println("进货员"+" ["+stocker.getStockerName()+"] "+"开始进货");
			stocker.stock(this);
		System.out.println("进货员"+" ["+stocker.getStockerName()+"] "+"进货结束");
	}
	//售货
	public void sell(Customer c) throws ShoppingException{
		if(salar == null){
			throw new ShoppingException("您的商店还没有销售员呢！");
		}
		System.out.println("销售员"+stocker.getStockerName()+"为您服务");
		salar.sell(this,c);//售货员售货
		System.out.println("销售员"+stocker.getStockerName()+"服务结束");
	}
	 
	
	public Stocker getStocker() {
		return stocker;
	}

	public void setStocker(Stocker stocker) {
		this.stocker = stocker;
	}
	public Salar getSalar() {
		return salar;
	}
	public void setSalar(Salar salar) {
		this.salar = salar;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Food[] getFoods() {
		return foods;
	}
	public void setFoods(Food[] foods) {
		this.foods = foods;
	}
	
}
