/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tom
 */
public class LinkSelectionPageController implements Initializable {

	/**
	 * Initializes the controller class.
	 */

	@FXML
	private Label PageName;

	@FXML
	private CheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10;



	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	public void initData(Map<String, Page> pages, String pageName) {
		_pages = pages;

		_pageName = pageName;

		PageName.setText(_pageName);
	}

	public void saveLinkAction() {
		String[] list = Pages.getSiteList();
		if (ch1.isSelected()) {
			Page page = _pages.get(_pageName);
			
			page.addLink(_pages.get(list[0]));
			
			_pages.put(_pageName, page);
		}
	}

	private Map<String, Page> _pages;
	private String _pageName;
	private Stage _stage;

	public void setPrevStage(Stage stage) {
		this._stage = stage;
	}

	@FXML
	private void ReturnToMenu(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("MenuPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		MenuPageController controller = display.getController();

		controller.setPrevStage(_stage);
		
		

		_stage.show();
	}
}
