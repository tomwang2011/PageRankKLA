/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

	@FXML
	private Button applebtn;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

	public void initData() {
	}

	@FXML
	private void AddLinkTo0(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[0]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo1(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[1]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo2(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[2]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo3(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[3]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo4(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[4]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo5(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[5]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo6(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[6]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo7(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[7]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo8(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[8]);

		controller.setPrevStage(_stage);

		_stage.show();
	}
	
	@FXML
	private void AddLinkTo9(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("LinkSelectionPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		LinkSelectionPageController controller = display.getController();

		String[] list = Pages.getSiteList();

		controller.initData(list[9]);

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

	Pages _pages;
	Stage _stage;

	public void setPrevStage(Stage stage) {
		this._stage = stage;
	}
}
