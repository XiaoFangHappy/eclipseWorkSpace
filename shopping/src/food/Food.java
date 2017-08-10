package food;
//食品类（Food）：食品名称、食品数量
public class Food {
	public String foodName;
	public int foodNumber;
	
	
	
	public Food(String foodName, int foodNumber) {
		super();
		this.foodName = foodName;
		this.foodNumber = foodNumber;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodNumber() {
		return foodNumber;
	}
	public void setFoodNumber(int foodNumber) {
		this.foodNumber = foodNumber;
	}
	
	public void addFoodNumber(int foodNumber) {
		this.foodNumber += foodNumber;
	}
	
}
