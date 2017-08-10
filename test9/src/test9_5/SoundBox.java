package test9_5;

public class SoundBox implements Input,Output,Usb{

	@Override
	public void input(String str) {
		System.out.println("连接音响成功"+str);
		
	}

	@Override
	public void chargeElc() {
		System.out.println("音响需要充电");
		
	}

	@Override
	public void showPic() {
		System.out.println("音响不能显示图像");
	}

	@Override
	public void output(String str) {
		System.out.println("音响准备放音乐"+str);
	}
}
