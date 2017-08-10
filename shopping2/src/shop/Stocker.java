package shop;

import java.util.InputMismatchException;
import java.util.Scanner;
import food.Apple;
import food.Banana;
import food.Chocolate;
import food.Food;
import food.Pear;
import util.MyPrint;

public class Stocker extends MyPrint{
	public String stockerName;
	public static Food[] foods;

	
	//进货
	public void stock(Shop shop){
		Scanner s = new Scanner(System.in);
		foods = new Food[] {new Apple(),new Banana(),new Chocolate(),new Pear()};
		printList();
		
		while(true) {
				String string = s.nextLine();
				if("5".equals(string)||"exit".equals(string)){
					printStock();
					return;
				}else {
					switch(string) {
						case "1":
						case "苹果":
							stock(foods,0);
							printList();
							break;
						case "2":
						case "香蕉":
							stock(foods,1);
							printList();
							break;
						case "3":
						case "巧克力":
							stock(foods,2);
							printList();
							break;
						case "4":
						case "梨":
							stock(foods,3);
							printList();
							break;
						default:
							System.err.print("商品不存在！");
							printList();
							break;
						}
				}
			}
		}
	//进货要多少数量
	public void  stock(Food[] foods,int index){
		int num = 0;

		Scanner s = new Scanner(System.in);
			System.out.println("请输入要进的"+foods[index].getFoodName()+"的数量：");
			try{
				num = s.nextInt();
				this.foods[index].addFoodNumber(num);
				//foods[index].addFoodNumber(num);
			}catch(InputMismatchException e) {
				System.err.print("输入错误，请重新输：");
			}
		}


	//打印进货清单
			public static void printStock() {
				System.out.println("************清单************");
				System.out.println("序号\t"+"商品\t"+"库存\t");
				for(int index = 0;index<foods.length;index++) {
					if(foods[index].foodNumber!=0) {
						System.out.println((index+1)+"\t"+foods[index].foodName+"\t"+foods[index].foodNumber);
					}
				}
				System.out.println("5\t"+"退出");
				System.out.println("***************************");
				
			}
	
	public String getStockerName() {
		return stockerName;
	}
	public void setStockerName(String stockerName) {
		this.stockerName = stockerName;
	}
	public Food[] getFoods() {
		return foods;
	}
	public void setFoods(Food[] foods) {
		this.foods = foods;
	}
	
}
