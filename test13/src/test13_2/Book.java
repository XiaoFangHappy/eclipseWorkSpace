package test13_2;

/**
 * 2. 利用List编写一个“图书管理”程序，能支持书对象的查看、增加、删除操作，并支持退出程序功能。
(1)每本书对象包括编号，书名，类别，价格。
(2)删除书必须输入书的编号，若输入书编号无对应的书对象则用异常处理提示输入有误，若成功删除也弹出删除成功的提示。
 * @author lenovo
 *
 */
public class Book {
	private int id;
	private String bookName;
	private String type;
	private double price;
	
	
	public Book(int id, String bookName, String type, double price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.type = type;
		this.price = price;
	}
	public Book() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", type=" + type + ", price=" + price + "]";
	}
	
	
	
}
