package test16_1.test;

import java.sql.SQLException;
import java.util.ArrayList;

import test16_1.dao.StudentDao;
import test16_1.exception.MyException;
import test16_1.model.Student;

public class Test {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		Student s = null;
		ArrayList<Student> students;
		try {
		    s = new Student();
			students = dao.selectAll();
		
			students.get(0).setScore(78.9);
			students.get(1).setScore(56.0);
			students.get(2).setScore(77.0);
			
			dao.updateScore(students);
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (MyException e) {
			System.err.println(e.getMessage());
		}
	}
}
