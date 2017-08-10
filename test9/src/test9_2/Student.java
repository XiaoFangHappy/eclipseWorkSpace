package test9_2;
/*
 * 2.设计一个学生类，属性包括学号、姓名及所学的数学、英语及程序设计3门课程；
 * 课程都有名字和成绩；
 * 在学生类中完成方法输出学生的姓名及3门课程的总成绩。
 * */
public class Student {
	int num;
	String name;
	Course[] courses;
	
	public Student(String name, Course[] courses) {
		super();
		this.name = name;
		this.courses = courses;
	}

	public  void sumScore() {
		double sum = 0.0;
		for(int i=0;i<3;i++) {
			sum = sum+courses[i].score;
		}
			System.out.println(name+"三门课总成绩："+sum);
		}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	
	
	
	public class Course{
		String name;
		double score;

		public Course(String name, double score) {
			super();
			this.name = name;
			this.score = score;
		}	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getScore() {
			return score;
		}
		public void setScore(double score) {
			this.score = score;
		}
		
	}
}
