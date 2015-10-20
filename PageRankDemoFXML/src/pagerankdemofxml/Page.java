/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tom
 */
public class Page {
	public Page(String name) {
		_name = name;
		_links = new HashSet<>();
	}
	public void addLink(String link) {
		_links.add(link);
	}
	public Set<String> getLinks() {
		return _links;
	}
	public String getName() {
		return _name;
	}
	private String _name;
	private Set<String> _links;
}
