package test7_1;


public class StudentTest {
	public static void main(String[] args) {
		
		Student s1 = new Student("张三");
		System.out.println(s1.getName());
		
		Student s2 = new Student();
		s2.setName("李四");
		System.out.println(s2.getName());
		
		Student s3 = new Student();
		s3.name = "王五";
		System.out.println(s3.getName());
		
	}

}
