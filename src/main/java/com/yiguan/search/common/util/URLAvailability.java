/**   
 * @Copyright: Copyright (c) 2017 天坦软件
 * @Title: URLAvailability.java
 * @Package com.yiguan.search.common.util
 * @Description: TODO 
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月23日 上午9:38:17 
 * @version V1.0   
 */
package com.yiguan.search.common.util;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName: URLAvailability
 * @Description: TODO
 * @author Devin <luchangyou@tiantanhehe.com>
 * @date 2017年9月23日 上午9:38:17
 * 
 */
public class URLAvailability {

	public static boolean isConnect(String urlStr) {
		if (Common.isEmpty(urlStr)) {
			return false;
		}

		try {
			URL url = new URL(urlStr);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			int state = con.getResponseCode();
			if (state == 200) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
