package test12_1;

public class Student {
	private String name;
	private int stuid;
	private String sex;
	
	public Student() {
		
	}
	
	public Student(String name, int stuid, String sex) {
		super();
		this.name = name;
		this.stuid = stuid;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", stuid=" + stuid + ", sex=" + sex + "]";
	}
	
	
	
}
