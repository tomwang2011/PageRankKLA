/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tom
 */
public class Pages {
	
	public Pages() {
		_pages = new HashMap<>();

		for (String site : siteList) {
			Page page = new Page(site);

			_pages.put(site, page);
		}
	}
	
	public static void addPage(String siteName, Page linkPage) {
		_pages.get(siteName).addLink(linkPage);
	}
	
	public static void setMap(Map<String, Page> pages) {
		_pages = pages;
	}

	public static Map<String, Page> getMap() {
		return _pages;
	}
	
	public static String[] getSiteList() {
		return siteList;
	}
	
	private static String[] siteList = {"Apple", "Amazon", "Google", "Microsoft", "Facebook", "Adidas", "Nike", "Reebok", "Puma", "Newbalance"};
	private static Map<String, Page> _pages;
}
