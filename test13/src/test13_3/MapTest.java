package test13_3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * （Map）利用Map，完成下面的功能：
从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
如果该年没有举办世界杯，则输出：没有举办世界杯。
 * @author lenovo
 *
 */
public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("2014", "德国");
		map.put("2010", "西班牙");
		map.put("2006", "意大利");
		map.put("2002", "巴西");
		map.put("1998", "法国");
		map.put("1994", "巴西");
		map.put("1990", "西德");
		map.put("1986", "阿根廷");
		map.put("1982", "意大利");
		map.put("1978", "阿根廷");
		map.put("1974", "西德");
		map.put("1970", "巴西");
		map.put("1966", "英格兰");
		map.put("1962", "巴西");
		map.put("1958", "巴西");
		map.put("1954", "西德");
		map.put("1950", "乌拉圭");
		map.put("1938", "意大利");
		map.put("1934", "意大利");
		map.put("1930", "乌拉圭");
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		String year = s.next();
		
		if(map.get(year) == null) {
			System.out.println("没有举办世界杯!");
		}else {
			System.out.println(map.get(year));
		}
	}
}
