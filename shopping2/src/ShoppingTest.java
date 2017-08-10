
import customer.Customer;
import shop.Salar;
import shop.Shop;
import shop.Stocker;

public class ShoppingTest {
	public static void main(String[] args) {
		Shop shop = new Shop();
		Stocker stocker = new Stocker();
		stocker.setStockerName("张三");	
		shop.setStocker(stocker);
		
		Salar salar = new Salar();
		salar.setName("李四");
		shop.setSalar(salar);
		Customer customer = new Customer();
		customer.setName("王五");
		
		try {
			shop.stock();
			shop.sell(customer);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
