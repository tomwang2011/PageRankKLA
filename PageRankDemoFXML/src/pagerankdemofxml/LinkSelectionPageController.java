/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
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
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	public void initData(Set<Page> pages) {
		_pages = pages;
	}

	public void saveLinkAction() {

	}

	private Set<Page> _pages;

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
