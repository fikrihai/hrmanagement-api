package co.hr.management.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import co.hr.management.common.Constants;



public class DateUtil {
	
	private DateUtil() {
	    throw new IllegalStateException("Utility class");
	}
	public static String formatDateYD1(Date date) {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat(Constants.FORMAT_DATE_YYYYMMDD_1);
		return outputDateFormat.format(date);
	}

	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}
	
	public static Timestamp getCurrentTimestampGMT7() {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Jakarta"));	
		return Timestamp.valueOf(zdt.toLocalDateTime());
	}
	
	public static Timestamp getCurrentTimestampGMT8() {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Taipei"));	
		return Timestamp.valueOf(zdt.toLocalDateTime());
	}
	
	public static Timestamp getCurrentTimestampGMT9() {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));	
		return Timestamp.valueOf(zdt.toLocalDateTime());
	}
	
	public static Timestamp getCurrentTimestampGMT0() {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Zulu"));
		return Timestamp.valueOf(zdt.toLocalDateTime());
	}
	
	public static String formatDate1(Date date) {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat(Constants.FORMAT_DATE_YYYYMMDD_1);
		return outputDateFormat.format(date);
	}
	
	public static String formatDate2(Date date) {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat(Constants.FORMAT_DATETIME_YYYYMMDD_1);
		return outputDateFormat.format(date);
	}
	
	public static Date parseDate1(String date) throws ParseException {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat(Constants.FORMAT_DATE_YYYYMMDD_1);
		return outputDateFormat.parse(date.trim());
	}
	
	public static Date parseDate2(String date) throws ParseException {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat(Constants.FORMAT_DATETIME_YYYYMMDD_1);
		return outputDateFormat.parse(date.trim());
	}
	
	public static String formatTimestampYD1(Timestamp timestamp) {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat(Constants.FORMAT_DATETIME_YYYYMMDD_1);
		return outputDateFormat.format(timestamp);
	}

	public static String formatTimestampDY1(Timestamp timestamp) {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat(Constants.FORMAT_DATETIME_DDMMYYYY_1);
		return outputDateFormat.format(timestamp);
	}
	
	public static String formatTimestampDY2(Timestamp timestamp) {
		SimpleDateFormat outputDateFormat = new SimpleDateFormat(Constants.FORMAT_DATE_DDMMYYYY_1);
		return outputDateFormat.format(timestamp);
	}

}
