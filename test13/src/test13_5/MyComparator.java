package test13_5;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>{
	
	private String filed;
	private String order;
	
	public MyComparator(String filed, String order) {
		super();
		this.filed = filed;
		this.order = order;
	}
	public MyComparator() {
		super();
	}
	public int compare(Student o1, Student o2) {

		if("name".equals(filed)) {
			if("升序".equals(order)) {
				return o1.getName().compareTo(o2.getName());
			}else if("降序".equals(order)) {
				return o2.getName().compareTo(o1.getName());
			}
		}else if("id".equals(filed)){
			if("升序".equals(order)) {
				return o1.getId()-o2.getId();
			}else if("降序".equals(order)) {
				return o2.getId()-o1.getId();
			}
		}else if("number".equals(filed)) {
			if("升序".equals(order)) {
				return o1.getNumber()-o2.getNumber();
			}else if("降序".equals(order)) {
				return o2.getNumber()-o1.getNumber();
			}
		}

		return o2.getName().compareTo(o1.getName());//升序排列
	}
}
