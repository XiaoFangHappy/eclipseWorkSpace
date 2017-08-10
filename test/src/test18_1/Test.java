package test18_1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test {
	public static void main(String[] args) {
		/*File f = new File("D:\\AowinStudy\\my");
		//f.mkdirs();
		boolean b = f.isDirectory();
		System.out.println(b);
		print(f);*/
		
		/*try {
			FileOutputStream fos = new FileOutputStream("a.txt",true);
			String str = "hello,world";
			fos.write(str.getBytes());
			fos.flush();
			fos.close();
			
			FileInputStream fis = new FileInputStream("a.txt");
			int n = fis.read();
			System.out.println(n);
			byte[] b = new byte[1024];
			int len = -1;
			while((len = fis.read(b))!=-1) {
				String string = new String(b, 0, len);
				System.out.println(string);
			}
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt") );
			dos.writeInt(10);
			dos.writeUTF("哈哈哈");
			dos.flush();
			dos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void print(File file) {
		System.out.println(file);
		File[] fs = file.listFiles();
		if(file.isDirectory()) {
			for(File f:fs) {
				print(f);
			}
		}
	}
}
