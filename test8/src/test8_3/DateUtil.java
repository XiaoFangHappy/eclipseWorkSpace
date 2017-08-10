package test8_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String format(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(d);
	}

}
