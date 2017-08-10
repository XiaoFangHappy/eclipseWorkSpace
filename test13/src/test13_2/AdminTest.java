package test13_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. 利用List编写一个“图书管理”程序，能支持书对象的查看、增加、删除操作，并支持退出程序功能。
(1)每本书对象包括编号，书名，类别，价格。
(2)删除书必须输入书的编号，若输入书编号无对应的书对象则用异常处理提示输入有误，若成功删除也弹出删除成功的提示。
 * @author lenovo
 *
 */
public class AdminTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		ArrayList list = new ArrayList();
		Book b1 = new Book(1001,"我们仨","文学",18.0);
		Book b2 = new Book(1002,"解忧杂货铺","外国",27.0);
		Book b3 = new Book(1003,"Java设计","教育",34.0);
		Book b4 = new Book(1004,"数学分析","教育",19.4);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		Library l = new Library();
		l.setList(list);
		while(true) {

			System.out.println("1.查找    2.增加   3.删除   4.退出");	
			
			String str = s.next();
			
				switch(str) {
				case "1":
				case "查找":	
					System.out.println(l.selectBook(s));
					break;	
					
				case "2":
				case "增加":
					l.addBook(s);
						break;
					
				case "3":
				case "删除":
					l.deleteBook(s);
					break;
					
				case "4":
				case "退出":
					System.out.println("退出程序！");
					return;
					
				default:
					System.out.println("输入错误，请重输：");
					break;
				}
			}	
	}
}

