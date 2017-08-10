package test9_5;
/*
 * 5. 声明并实例化实现了多个接口的类。用各个接口去cast(强制类型转换)这个引用变量。
 * 测试接口中的方法的依属关系。

 * */
public class Computer{
	
	public void input(Input input) {
		input.linkCharge();
	}
	
	public void output(Output output) {
		output.linkMic();
		output.showPic();
	}
	
	public void usb(Usb usb) {
		usb.chargeElc();
		
	}

	public void input(Input input,String str) {
		input.input(str);
	}
	
	public void ouput(Output output,String str) {
		output.output(str);
	}
	
}
