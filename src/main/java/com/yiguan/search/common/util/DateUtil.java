/**   
 * @Copyright: Copyright (c) 2016 天坦软件
 * @Title: DateUtil.java
 * @Package com.tiantanhehe.yidongyihu.common.util
 * @Description: 时间格式转换
 * @author guojin <guojin@tiantanhehe.com>
 * @date 2016年11月10日 
 * @version V1.0   
 */
package com.yiguan.search.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: DateUtil
 * @Description: 时间格式转换
 * @author guojin <guojin@tiantanhehe.com>
 * @date 2016年11月10日
 * 
 */
public class DateUtil {

	/**
	 * 
	 * @Description: 时间戳转换为日期字符串
	 * @param
	 * @return the String
	 * @author: guojin <guojin@tiantanhehe.com>
	 * @date: 2016年11月10日
	 * 
	 */
	public static String timeStamp2Date(String seconds, String format) {
		if (Common.isEmpty(seconds)) {
			return "";
		}
		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(Long.valueOf(seconds + "000")));
	}

	public static String DateToStr(Date date, String format) {
		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat f = new SimpleDateFormat(format);
		String str = f.format(date);
		return str;
	}

	public static Date strToDate(String str, String format) {

		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat f = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = f.parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * @Description: 按照格式获取时间字符串
	 * @param
	 * @return the boolean
	 * @author: Tony <Wuwenlong@tiantanhehe.com>
	 * @date: 2017年6月9日 上午10:31:43
	 *
	 */
	public static String getDateString(Date date, String format) {
		if (date == null) {
			date = new Date();
		}
		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static String getDateStringAfterNMonth(int n, String format) {
		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.MONTH, n);

		return sdf.format(calendar.getTime());
	}

	public static String getDateStringAfterNMonth(int n, String date,
			String format) {
		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(strToDate(date, format));
		calendar.add(Calendar.MONTH, n);

		return sdf.format(calendar.getTime());
	}

	public static String getDateStringAfterNHour(int n, String format) {
		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, n);
		return sdf.format(calendar.getTime());
	}

	public static String getDateStringAfterNMinute(int n, String format) {
		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, n);
		return sdf.format(calendar.getTime());
	}

	public static String getDateStringAfterNDays(int n, String format) {
		if (Common.isEmpty(format)) {
			format = "yyyy-MM-dd HH:mm:ss";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, n);
		return sdf.format(calendar.getTime());
	}

	public static void main(String args[]) {
		// Date smdate = strToDate("1970-01-04", "yyyy-MM-dd");
		// Date bdate = null;
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// bdate = new Date();
		// System.out.println(daysBetween(smdate, bdate));
		// System.err.println(daysBetween(smdate, bdate) % 14);
		System.out.println(getWeekOfDate("2017-07-11"));

	}

	public static int daysBetween(Date smdate, Date bdate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			smdate = sdf.parse(sdf.format(smdate));
			bdate = sdf.parse(sdf.format(bdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * @Description: 获取当前时间字符串
	 * @param
	 * @return the boolean
	 * @author: Tony <Wuwenlong@tiantanhehe.com>
	 * @date: 2017年6月9日 上午10:33:43
	 *
	 */
	public static String getCurrnetDateString() {
		return getDateString(null, null);
	}

	/**
	 * 
	 * @Description: 日期格式字符串转换成时间戳
	 * @param
	 * @return the String
	 * @author: guojin <guojin@tiantanhehe.com>
	 * @date: 2016年11月10日
	 * 
	 */
	public static String date2TimeStamp(String date_str, String format) {
		try {
			if (date_str.length() < format.length()) {
				format = format.substring(0, date_str.length());
			}
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return String.valueOf(sdf.parse(date_str).getTime() / 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 
	 * @Description: 取得当前时间戳（精确到秒）
	 * @param
	 * @return the String
	 * @author: guojin <guojin@tiantanhehe.com>
	 * @date: 2016年11月10日
	 * 
	 */
	public static String timeStamp() {
		long time = System.currentTimeMillis();
		String t = String.valueOf(time / 1000);
		return t;
	}

	/**
	 * 
	 * @Description: 获取当前时间
	 * @param
	 * @return the String
	 * @author: guojin <guojin@tiantanhehe.com>
	 * @date: 2016年11月28日
	 * 
	 */
	public static String dateTimeNow(String format) {
		return new SimpleDateFormat(format).format(new Date());
	}

	/**
	 * 
	 * @Description: 获取过去第几天的日期
	 * @param past
	 * @return the String
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年4月14日 下午2:27:11
	 *
	 */
	public static String getPastDate(int past) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR)
				- past);
		Date today = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String result = format.format(today);
		return result;
	}

	/**
	 * 
	 * @Description: 获取当月的 天数
	 * @param
	 * @return the int
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年5月18日 上午11:12:03
	 *
	 */
	public static int getCurrentMonthDay() {

		Calendar a = Calendar.getInstance();
		a.set(Calendar.DATE, 1);
		a.roll(Calendar.DATE, -1);
		int maxDate = a.get(Calendar.DATE);
		return maxDate;
	}

	/**
	 * @Description: 根据日期获取星期
	 * @param Date
	 *            date
	 * @return the String
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年6月22日 上午11:19:04
	 *
	 */
	public static String getWeek(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		String week = sdf.format(date);
		return week;
	}

	public static String getWeek(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		String week = sdf.format(strToDate(date, "yyyy-MM-dd"));
		return week;
	}

	/**
	 * 获取当前日期是星期几<br>
	 * 
	 * @param dt
	 * @return 当前日期是星期几
	 */
	public static String getWeekOfDate(String str) {

		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(strToDate(str, "yyyy-MM-dd"));
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

	public static List<String> getTimeUnitList(String startTime,
			String endTime, String timeAccurate) {
		List<String> timeUnitList = new ArrayList<String>();
		try {
			long startTimeStamp = Long.parseLong(DateUtil.date2TimeStamp(
					startTime, "yyyy-MM-dd"));
			long endTimeStamp = Long.parseLong(DateUtil.date2TimeStamp(endTime,
					"yyyy-MM-dd"));
			String format = "yyyy-MM-dd";
			long interval = 86400;
			if ("12".equals(timeAccurate)) {
				format = "yyyy-MM-dd";// 调整之前 format = "yyyy-MM-dd HH:mm"
				interval = 86400;// 调整之前 interval = 43200
			} else if ("48".equals(timeAccurate)) {
				interval = 86400 * 2;
			}
			for (long time = startTimeStamp; time <= endTimeStamp; time += interval) {
				String timeItem = DateUtil.timeStamp2Date(Long.toString(time),
						format);
				timeUnitList.add(timeItem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return timeUnitList;
	}

	public static boolean compareDate(String date1, String date2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		try {
			Date dt1 = df.parse(date1);
			Date dt2 = df.parse(date2);
			if (dt1.getTime() >= dt2.getTime()) {
				return true;
			} else {
				return false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return false;
	}
}
