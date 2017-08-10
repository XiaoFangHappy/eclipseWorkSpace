package test13_5;

import java.util.ArrayList;
import java.util.Collections;
/*.有这样一个比较器有成员变量
String order="";
String field="";
可以根据order/field的值的不同进行排序(升
序？降序/按照ID？NAME？NUMBER)。*/

public class Test {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Student s1 = new Student(1,"张三",87);
		Student s2 = new Student(2,"李四",86);
		Student s3 = new Student(3,"王五",95);
		Student s4 = new Student(4,"夏利",77);
		Student s5 = new Student(5,"小芳",100);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println("排序之前：");
		    for(int i =0;i<list.size();i++){
		        System.out.println(list.get(i));
		    }

		    System.out.println("根据name降序：");
		    Collections.sort(list,new MyComparator("name","降序"));
		    for(int i=0;i<list.size();i++){
		        System.out.println(list.get(i));
		    }
		     
		    System.out.println("根据name升序：");
		    Collections.sort(list,new MyComparator("name","升序"));
		    for(int i=0;i<list.size();i++){
		        System.out.println(list.get(i));
		    }
		     
		    System.out.println("根据id升序：");
		    Collections.sort(list,new MyComparator("id","升序"));
		    for(int i=0;i<list.size();i++){
		        System.out.println(list.get(i));
		     }
		     
		    System.out.println("根据id降序：");
		    Collections.sort(list,new MyComparator("id","降序"));
		    for(int i=0;i<list.size();i++){
		        System.out.println(list.get(i));
		    }
		     
		    System.out.println("根据number升序：");
		    Collections.sort(list,new MyComparator("number","升序"));
		    for(int i=0;i<list.size();i++){
		        System.out.println(list.get(i));
		    }
		     
		    System.out.println("根据number降序：");
		    Collections.sort(list,new MyComparator("number","降序"));
		    for(int i=0;i<list.size();i++){
		        System.out.println(list.get(i));
		    }   
	}
}
