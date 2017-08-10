package test7_4;
/*
 * 编写一个类，具有一个trans（String str）方法，
 * 对传入的字符串str进行是否为null和空字符串的判断，
 * 如果为真，那么返回一个空字符串，如果为假，那么将传入的字符串进行大写转换后返回。
 * 
 * */
public class Judge {
	
	public  String trans(String str) {
		
		if(str == null||"".equals(str)) {
			return "";
		}else {
			return str.toUpperCase();
		}
		
	}
	
	public static void main(String[] args) {
		Judge j = new Judge();
		String hello = "hello";
		String str = "hEllo";
		String empty = "";
		String n = null;
		System.out.println("结果："+j.trans(hello));
		System.out.println("结果："+j.trans(str));
		System.out.println("结果："+j.trans(empty));
		System.out.println("结果："+j.trans(n));
	}

}
