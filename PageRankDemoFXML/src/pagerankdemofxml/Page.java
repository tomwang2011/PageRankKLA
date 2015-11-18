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
		_incomingLinks = new HashSet<>();
	}

	public Set<Page> getIncomingLinks() {
		return _incomingLinks;
	}

	public void setIncomingLinks(Page page) {
		_incomingLinks.add(page);
	}

	public void addLink(Page page) {
		_links.add(page);
	}

	public Set<Page> getLinks() {
		return _links;
	}

	public String getName() {
		return _name;
	}

	private String _name;
	private Set<Page> _links;
	private Set<Page> _incomingLinks;
}
