package kr.co.interpia.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {
	public static String getCurrentFormattedDate() {
	    Date currentDate = new Date();
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    return dateFormat.format(currentDate);
	}
}
