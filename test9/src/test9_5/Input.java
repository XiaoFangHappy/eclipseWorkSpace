package test9_5;
/*
 * 5. 声明并实例化实现了多个接口的类。用各个接口去cast(强制类型转换)这个引用变量。
 * 测试接口中的方法的依属关系。

 * */
public interface Input {
	
    public void input(String str);
    
	
	public default void linkCharge() {
		System.out.println("连接电源");
	}
}
