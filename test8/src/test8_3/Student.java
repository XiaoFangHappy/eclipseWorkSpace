package test8_3;

import java.util.Date;

/*
 * 在Student类添加一个代表学生毕业时间的属性，有一个Student的子类：CollegeStudent。
 *  Student毕业时间为当前时间， CollegeStudent毕业时间比student的毕业时间推后1个月。
 *  请在子类中打印两个毕业时间。
 *  */
public class Student {
	 Date graduateTime = new Date();
	
     public Date getGraduateTime() {
		return graduateTime;
	}

	public void setGraduateTime(Date graduateTime) {
		this.graduateTime = graduateTime;
	}

	public void print() {
		System.out.println("学生的毕业时间为："+DateUtil.format(graduateTime));
	}

     
}
