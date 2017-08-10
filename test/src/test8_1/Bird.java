package test8_1;

public class Bird extends Animals{
	private boolean isSpeak;
	
	public void fly() {
		System.out.println("我会飞！");
	}

	public boolean isSpeak() {
		return isSpeak;
	}

	public void setSpeak(boolean isSpeak) {
		this.isSpeak = isSpeak;
	}

}
