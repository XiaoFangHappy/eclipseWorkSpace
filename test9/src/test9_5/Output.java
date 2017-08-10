package test9_5;
/*
 * 5. 声明并实例化实现了多个接口的类。用各个接口去cast(强制类型转换)这个引用变量。
 * 测试接口中的方法的依属关系。

 * */
public interface Output {
	
	void output(String str);
	
	default void linkMic() {
		System.out.println("连接麦克风输出设备");
	}
	
	default void showPic() {
		System.out.println("显示图像");
	}
	
}
