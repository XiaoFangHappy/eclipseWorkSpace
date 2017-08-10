package test9_5;

public class Test {
	
	public static void main(String[] args) {
		Computer comp = new Computer();
		Output soundbox = new SoundBox();
		Input soundbox1 = new SoundBox();
		Usb soundbox2 = new SoundBox();
		
		comp.input(soundbox1);
		comp.output(soundbox);
		comp.usb(soundbox2);
		
		comp.ouput(soundbox, "《小芳》这首歌");
		comp.input(soundbox1, "开始录音");
		
		Usb usb = (Usb) soundbox;
		comp.usb(usb);
		
		Input in = (Input) soundbox2;
		comp.input(in, "   Usb强转input");
		
		Output out = (Output) soundbox1;
		comp.ouput(out, "  input强转output");
	}
}
