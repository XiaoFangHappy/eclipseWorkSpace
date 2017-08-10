package test7_1;

/**
 *1、利用构造函数、普通函数、直接调用属性的方式分别给学生的名字赋值
 * 
 */

public class Student {
	public String name;//成员属性
	
	//构造方法
	public Student(String name) {
		this.name = name;
	}
	
	public Student() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
