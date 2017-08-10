package shop;

import java.util.Scanner;



import customer.Customer;
import food.Apple;
import food.Banana;
import food.Chocolate;
import food.Food;
import food.Pear;

public class Salar extends Stocker{
	public String name;
	public Food[] foods  = new Food[] {new Apple(),new Banana(),new Chocolate(),new Pear()};

	
	public void sell(Shop shop,Customer c){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("-------------------------");
			System.out.println("欢迎光临，小二"+name+"为您服务！");
			printStock();
			System.out.println("买点什么呢？");
			String str = s.nextLine();
			if(String.valueOf(foods.length+1).equals(str) || "exit".equalsIgnoreCase(str)){
				print("购物清单");
				return;
			}else{
				try{
					int index = Integer.parseInt(str);
					if(index >= 1 && index <= shop.getFoods().length && shop.getFoods()[index-1].getFoodNumber() != 0){
						sell(shop,c,index-1);
					}else{
						System.err.println("没有找到您输入的商品");
					}
				}catch(NumberFormatException e){
					//若输入为字符串，则需对比数组对象中的名字属性
					boolean flag = true;
					for(int i=0;i<shop.getFoods().length;i++){
						if(str.equalsIgnoreCase(shop.getFoods()[i].getFoodName()) && shop.getFoods()[i].foodNumber != 0){
							flag = false;
							sell(shop,c,i);
						}
					}
					if(flag){
						System.err.println("没有找到您输入的商品");
					}
				}
			}
		}
	}
	
	
	private void sell(Shop shop,Customer c,int i){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入要购买的"+shop.getFoods()[i].getFoodNumber()+"的数量：");
		int num = s.nextInt();
		while(num > shop.getFoods()[i].getFoodNumber()){
			System.err.println("库存不足,请重新输入");
			num = s.nextInt();
		}
		shop.getFoods()[i].addFoodNumber(-num);
		this.foods[i].addFoodNumber(num);
		foods[i].addFoodNumber(num);//加总销售业绩
		c.getFoods()[i].addFoodNumber(num);//修改顾客食物
	}
	
	public void print(String str) {
		System.out.println("以下为"+name+"的销售业绩：");
		for(Food f:foods){
			System.out.println(f.getFoodName()+":"+f.getFoodNumber());
		}
		System.out.println("--------------------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Food[] getFoods() {
		return foods;
	}

	public void setFoods(Food[] foods) {
		this.foods = foods;
	}
	
	
}
