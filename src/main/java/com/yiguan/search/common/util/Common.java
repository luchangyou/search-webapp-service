package com.yiguan.search.common.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class Common {
	/**
	 * 判断变量是否为空
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isEmpty(String s) {
		if (null == s || "".equals(s) || "".equals(s.trim())
				|| "null".equalsIgnoreCase(s)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 使用率计算
	 * 
	 * @return
	 */
	public static String fromUsage(long free, long total) {
		Double d = new BigDecimal(free * 100 / total).setScale(1,
				BigDecimal.ROUND_HALF_UP).doubleValue();
		return String.valueOf(d);
	}

	/**
	 * 返回当前时间　格式：yyyy-MM-dd hh:mm:ss
	 * 
	 * @return String
	 */
	public static String fromDateH() {
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format1.format(new Date());
	}

	/**
	 * 返回当前时间　格式：yyyy-MM-dd
	 * 
	 * @return String
	 */
	public static String fromDateY() {
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		return format1.format(new Date());
	}

	/**
	 * 用来去掉List中空值和相同项的。
	 * 
	 * @param list
	 * @return
	 */
	public static List<String> removeSameItem(List<String> list) {
		List<String> difList = new ArrayList<String>();
		for (String t : list) {
			if (t != null && !difList.contains(t)) {
				difList.add(t);
			}
		}
		return difList;
	}

	/**
	 * 返回用户的IP地址
	 * 
	 * @param request
	 * @return
	 */
	public static String toIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	/**
	 * 传入原图名称，，获得一个以时间格式的新名称
	 * 
	 * @param fileName
	 *            　原图名称
	 * @return
	 */
	public static String generateFileName(String fileName) {
		DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String formatDate = format.format(new Date());
		int random = new Random().nextInt(10000);
		int position = fileName.lastIndexOf(".");
		String extension = fileName.substring(position);
		return formatDate + random + extension;
	}

	/**
	 * 取得html网页内容 UTF8编码
	 * 
	 * @param urlStr
	 *            网络地址
	 * @return String
	 */
	public static String getInputHtmlUTF8(String urlStr) {
		URL url = null;
		try {
			url = new URL(urlStr);
			HttpURLConnection httpsURLConnection = (HttpURLConnection) url
					.openConnection();

			httpsURLConnection.setRequestMethod("GET");
			httpsURLConnection.setConnectTimeout(5 * 1000);
			httpsURLConnection.connect();
			if (httpsURLConnection.getResponseCode() == 200) {
				// 通过输入流获取网络图片
				InputStream inputStream = httpsURLConnection.getInputStream();
				String data = readHtml(inputStream, "UTF-8");
				inputStream.close();
				return data;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return null;

	}

	/**
	 * 取得html网页内容 GBK编码
	 * 
	 * @param urlStr
	 *            网络地址
	 * @return String
	 */
	public static String getInputHtmlGBK(String urlStr) {
		URL url = null;
		try {
			url = new URL(urlStr);
			HttpURLConnection httpsURLConnection = (HttpURLConnection) url
					.openConnection();

			httpsURLConnection.setRequestMethod("GET");
			httpsURLConnection.setConnectTimeout(5 * 1000);
			httpsURLConnection.connect();
			if (httpsURLConnection.getResponseCode() == 200) {
				// 通过输入流获取网络图片
				InputStream inputStream = httpsURLConnection.getInputStream();
				String data = readHtml(inputStream, "GBK");
				inputStream.close();
				return data;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return null;

	}

	/**
	 * @param inputStream
	 * @param uncode
	 *            编码 GBK 或 UTF-8
	 * @return
	 * @throws Exception
	 */
	public static String readHtml(InputStream inputStream, String uncode)
			throws Exception {
		InputStreamReader input = new InputStreamReader(inputStream, uncode);
		BufferedReader bufReader = new BufferedReader(input);
		String line = "";
		StringBuilder contentBuf = new StringBuilder();
		while ((line = bufReader.readLine()) != null) {
			contentBuf.append(line);
		}
		return contentBuf.toString();
	}

	/**
	 * 
	 * @return 返回资源的二进制数据 @
	 */
	public static byte[] readInputStream(InputStream inputStream) {

		// 定义一个输出流向内存输出数据
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		// 定义一个缓冲区
		byte[] buffer = new byte[1024];
		// 读取数据长度
		int len = 0;
		// 当取得完数据后会返回一个-1
		try {
			while ((len = inputStream.read(buffer)) != -1) {
				// 把缓冲区的数据 写到输出流里面
				byteArrayOutputStream.write(buffer, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				byteArrayOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}

		// 得到数据后返回
		return byteArrayOutputStream.toByteArray();

	}

	/**
	 * 
	 * @Description: 按照长度(length)生成随机字符串
	 * @param
	 * @return the void
	 * @author: guojin <guojin@tiantanhehe.com>
	 * @date: 2016年11月26日
	 * 
	 */
	public static String getRandomString(int length) {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * @Description: 生成一个长度为N的纯数字的字符串
	 * @param
	 * @return the boolean
	 * @author: Tony <Wuwenlong@tiantanhehe.com>
	 * @date: 2017年6月27日 下午2:53:19
	 *
	 */
	public static long generateRandomNumber(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("随机数位数必须大于0");
		}
		return (long) (Math.random() * 9 * Math.pow(10, n - 1))
				+ (long) Math.pow(10, n - 1);
	}

	public static Object parseStringByType(String type, String value) {
		try {
			if ("boolean".equals(type)) {
				return Boolean.parseBoolean(value);
			} else if ("int".equals(type)) {
				return Integer.parseInt(value);
			} else if ("long".equals(type)) {
				return Long.parseLong(value);
			} else if ("float".equals(type)) {
				return Float.parseFloat(value);
			} else if ("double".equals(type)) {
				return Double.parseDouble(value);
			} else if ("String".equals(type)) {
				return value;
			} else if ("StringArray".equals(type)) {
				List<Object> obj = new ArrayList<Object>();
				if (value.contains("|")) {
					String[] strs = value.split("\\|");
					for (String str : strs) {
						if (!isEmpty(str))
							if (str.contains("#")) {
								Map<String, String> itemMap = new HashMap<String, String>();
								String[] stemStrs = str.split("#");
								for (String stemStr : stemStrs) {
									if (stemStr.contains("@")) {
										String[] leafStrs = stemStr.split("@");
										if (leafStrs.length > 1)
											itemMap.put(leafStrs[0],
													leafStrs[1]);
										else
											itemMap.put(leafStrs[0], "");
									} else {
										itemMap.put(stemStr, "");
									}
								}
								obj.add(itemMap);
							} else {
								obj.add(str);
							}
					}
				}
				return obj;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	/**
	 * 首字母大写
	 * 
	 * @Description: TODO
	 * @param String
	 *            srcStr
	 * @return the String
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2016年11月29日 下午5:20:10
	 *
	 */
	public static String firstCharacterToUpper(String srcStr) {
		return srcStr.substring(0, 1).toUpperCase() + srcStr.substring(1);
	}

	/**
	 * 替换字符串并让它的下一个字母为大写
	 * 
	 * @Description: TODO
	 * @param String
	 *            srcStr
	 * @param String
	 *            org,String ob
	 * @return the String
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2016年11月29日 下午5:20:44
	 *
	 */
	public static String replaceUnderlineAndfirstToUpper(String srcStr,
			String org) {
		String newString = "";
		int first = 0;
		while (srcStr.indexOf(org) != -1) {
			first = srcStr.indexOf(org);
			if (first != srcStr.length()) {
				newString = newString + srcStr.substring(0, first);
				srcStr = srcStr
						.substring(first + org.length(), srcStr.length());
				srcStr = firstCharacterToUpper(srcStr);
			}
		}
		newString = newString + srcStr;
		return newString;
	}

	/**
	 * 保留小数
	 * 
	 * @Description: TODO
	 * @param num
	 *            保留小数位数
	 * @param value
	 *            操作的字符串
	 * @return the BigDecimal
	 * @author: Devin <luchangyou@tiantanhehe.com>
	 * @date: 2017年4月19日 下午1:01:29
	 *
	 */
	public static BigDecimal getBigDecimal(int num, double value) {
		String str = String.valueOf(value);
		BigDecimal bd = new BigDecimal(str);
		return bd = bd.setScale(num, BigDecimal.ROUND_HALF_UP);
	}
}
