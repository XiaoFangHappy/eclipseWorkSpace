package test9_2;
/*
 * 2.设计一个学生类，属性包括学号、姓名及所学的数学、英语及程序设计3门课程；
 * 课程都有名字和成绩；
 * 在学生类中完成方法输出学生的姓名及3门课程的总成绩。
 * */
public class Test {
	public static void main(String[] args) {
		
		Student.Course[] courses = new Student.Course[3];
		Student s1 = new Student("小红",courses);
		courses[0] = s1.new Course("数学",88.5);
		courses[1] = s1.new Course("英语",90.5);
		courses[2] = s1.new Course("程序设计",97.0);

		
		s1.sumScore();
	}
}
