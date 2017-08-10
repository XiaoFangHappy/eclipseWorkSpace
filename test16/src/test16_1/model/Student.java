package test16_1.model;
/*1、用PareparedStatement的方法实现批量修改学生成绩的功能*/
public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	private String department;
	private Double score;
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", department=" + department
				+ ", score=" + score + "]";
	}

	public Student() {
		super();
	}
	
	public Student(Integer id, String name, Integer age, String sex, String department, Double score) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.department = department;
		this.score = score;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	
	
}
