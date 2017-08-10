package test13_5;

/**
 * 有这样一个比较器有成员变量
	String order="";
	String field="";
可以根据order/field的值的不同进行排序(升
序？降序/按照ID？NAME？NUMBER)。
 * @author lenovo
 *
 */
public  class Student{
	private int id;
	private String name;
	private int number;
	
	public Student() {
		
	}
	
	public Student(int id, String name, int number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", number=" + number + "]";
	}

	
	
	
	
	
}
