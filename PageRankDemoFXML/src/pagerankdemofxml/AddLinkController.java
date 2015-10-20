/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tom
 */
public class AddLinkController implements Initializable {

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}	
	public void initData(Set<Page> pages) {
		_pages = pages;
	}
	private Set<Page> _pages;
	
	Stage _stage;
	
	public void setPrevStage(Stage stage) {
		this._stage = stage;
	}
}
