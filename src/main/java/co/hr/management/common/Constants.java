package co.hr.management.common;

public class Constants {
	
	private Constants() {
		throw new IllegalStateException("Utility class");
	}
	
	/*
	 * Add global variable in here
	 */
	public static final int DEFAULT_TIMEOUT_API = 10000;
	
	
	public static final String STR_ACTIVE = "A";
	public static final String STR_NON_ACTIVE = "N";
	
	public static final int INT_ACTIVE = 0;
	public static final int INT_NON_ACTIVE = 1;
	
	public static final String STD_RESP_PROPERTY_STATUS = "status";
	public static final String STD_RESP_PROPERTY_MESSAGE = "message";
	public static final String STD_RESP_PROPERTY_DATA = "data";

	public static final String GLB_MESSAGE_FAILED = "Failed !";
	public static final String GLB_MESSAGE_FOUND = "Data Found !";
	public static final String GLB_MESSAGE_REQ_EMPTY = "Blank Request !";
	public static final String GLB_MESSAGE_NOT_FOUND = "Data Not Found !";
	public static final String GLB_MESSAGE_SUCCESS = "Success !";
	public static final String EMPTY_STRING = "";
	
	public static final String FORMAT_DATE_YYYYMMDD_1 = "yyyy-MM-dd";
	public static final String FORMAT_DATE_YYYYMMDD_2 = "yyyyMMdd";
	public static final String FORMAT_DATE_YYYYMMDD_3 = "yyyy/MM/dd";
	
	public static final String FORMAT_DATETIME_YYYYMMDD_1 = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_DATETIME_DDMMYYYY_1 = "dd-MM-yyyy HH:mm:ss";
	public static final String FORMAT_DATE_DDMMYYYY_1 = "dd-MM-yyyy";
	public static final String FORMAT_DATE_DDMMYYYY_2 = "ddMMyyyy";
	public static final String FORMAT_DATE_DDMMYYYY_3 = "dd/MM/yyyy";
	 
	
	
}
