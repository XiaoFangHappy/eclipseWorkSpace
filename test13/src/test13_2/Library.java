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
public class Library {
	private ArrayList<Book> list;
	
	
	public Library() {
		super();
	}

	
	public Book selectBook(Scanner s) {
		int id = 0;
		while(true) {
			try {
				System.out.println("请输入要查找的书的编号：");
				 id = s.nextInt();
				 for(Book book:list) {
						if(book.getId() == id) {
							return book;
						}
					}
					System.out.println("查无此书");
			}catch (InputMismatchException e) {
				System.out.println("输入错误");
				s.next();
			}
				
		}	
	}
	
	public void addBook(Scanner s) {
		int id1 = 0;
		try {
			System.out.println("请输入书的编号：");	
			id1 = s.nextInt();
			System.out.println("请输入书的名字：");
			String bookname = s.next();
			System.out.println("请输入书的类别：");
			String booktype = s.next();
			System.out.println("请输入书的价格：");
			double bookprice = s.nextDouble();
			for(Book b:list) {
				if(b.getId() == id1) {
					System.out.println("此书已存在！");
					return;
				}
			}
			Book book = new Book(id1,bookname,booktype,bookprice);
			list.add(book);
			System.out.println("添加成功！");
		}catch(InputMismatchException e) {
			System.out.println("输入错误！");
			s.next();
		}
		
		
	}

	public void deleteBook(Scanner s)  {
	int id = 0;
	while(true) {
		try {
			System.out.println("请输入要删除的书的编号：");
			 id = s.nextInt();
			 for(Book book:list) {
					if(book.getId() == id) {
						list.remove(book);
						System.out.println("删除成功！");
						return;
					}
				}
				System.out.println("查无此书");
		}catch (InputMismatchException e) {
			System.out.println("输入错误");
			s.next();
		}
			
	}	
}
	public ArrayList<Book> getList() {
		return list;
	}

	public void setList(ArrayList<Book> list) {
		this.list = list;
	}
	
	
	
}

