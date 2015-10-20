/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author tom
 */
public class FXMLDocumentController implements Initializable {
	
	@FXML
	private Label label;
	
	@FXML
	private TextField textFieldLink;
	
	@FXML
	private void displayRankings(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("RankingDisplay.fxml"));
		
		Scene scene = new Scene(display.load());
		
		_stage.setScene(scene);
		
		RankingDisplayController controller = display.getController();
		
		controller.initData(_pages);
		
		_stage.show();
	}
	
	@FXML
	private void buttonActionApple(ActionEvent event) {
		System.out.println("Apple!");
		Page page = new Page("apple");
		_pages.add(page);
		label.setText("Apple Added to set!");
	}
	
	@FXML
	private void buttonActionAdd(ActionEvent event) throws Exception{
		FXMLLoader display = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		
		Scene scene = new Scene(display.load());
		
		_stage.setScene(scene);
		
		MenuPageController controller = display.getController();
		
		controller.setPrevStage(_stage);
		
		_stage.show();
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	private Set<Page> _pages = new HashSet<>();
	
	private Stage _stage;
	
	public void setPrevStage(Stage stage) {
		this._stage = stage;
	}
}
