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

	public void initData(String pageName) {
		_pageName = pageName;

		PageName.setText(_pageName);
	}

	@FXML
	public void saveLinkAction(ActionEvent event) throws Exception {
		Map<String, Page> pageMap = Pages.getMap();
		
		String[] list = Pages.getSiteList();
		
		if (ch1.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[0]));
		}
		if (ch2.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[1]));
		}
		if (ch3.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[2]));
		}
		if (ch4.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[3]));
		}
		if (ch5.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[4]));
		}
		if (ch6.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[5]));
		}
		if (ch7.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[6]));
		}
		if (ch8.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[7]));
		}
		if (ch9.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[8]));
		}
		if (ch10.isSelected()) {
			Pages.addPage(_pageName, pageMap.get(list[9]));
		}
		
		returnToAddLink(event);
	}

	private String _pageName;
	private Stage _stage;

	public void setPrevStage(Stage stage) {
		this._stage = stage;
	}

	@FXML
	private void returnToAddLink(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("AddLink.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		AddLinkController controller = display.getController();

		controller.initData();

		controller.setPrevStage(_stage);

		_stage.show();
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
