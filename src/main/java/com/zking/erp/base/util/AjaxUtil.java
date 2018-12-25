package com.zking.erp.base.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AjaxUtil {

	/*public static List<Map<String, String>> GetMapButton(HttpSession session,
			List<Map<String, String>> custiomersMap ,String treeId) {
		System.out.println(session);
	Map<String, Object> button=((Map<String, Map<String, Object>>) session.getAttribute("ClienButton")).get(treeId);
	System.out.println(button);
	if(button!=null) {
	for (Map<String, String> map : custiomersMap) {
			String[] str = { "bupdate", "badd", "bdelete" };
			for (int i = 0; i < str.length; i++) {
				map.put(str[i], button.get(str[i]).toString());
			}
		}
	}
		return custiomersMap;
	}
*/
	/**
	 * �������ݱ��
	 * 
	 * @param total           分页
	 * @param findMapAll     返回的数据集合
	 * @return
	 */
	public static Map<String, Object> getTableMap(int total, Object findMapAll) {

		Map<String, Object> treeMap = new HashMap<>();
		treeMap.put("code", 0);
		treeMap.put("msg", 0);
		treeMap.put("count", total);
		treeMap.put("data", findMapAll);
		return treeMap;
	}

	/**
	 * ajax����
	 * 
	 * @param response
	 * @param objects
	 * @throws IOException
	 */
	/*public static void requestAjax(HttpServletResponse response, Object objects) throws IOException {

		String json = JSON.toJSON(objects).toString();
		PrintWriter out = response.getWriter();
		System.out.println(json);
		out.print(json);
		out.flush();
		out.close();

	}*/

}
