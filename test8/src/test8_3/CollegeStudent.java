package test8_3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * 在Student类添加一个代表学生毕业时间的属性，有一个Student的子类：CollegeStudent。
 *  Student毕业时间为当前时间， CollegeStudent毕业时间比student的毕业时间推后1个月。
 *  请在子类中打印两个毕业时间。
 *  */
public class CollegeStudent extends Student {

	private String time = graduateTime();

	public String graduateTime() {

		Date superTime = getGraduateTime();

		Calendar c = new GregorianCalendar();
		c.setTime(superTime);

		c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);
		return DateUtil.format(c.getTime());

	}

	@Override
	public void print() {
		super.print();
		System.out.println("大学生的毕业时间为：" + time);
	}

}
