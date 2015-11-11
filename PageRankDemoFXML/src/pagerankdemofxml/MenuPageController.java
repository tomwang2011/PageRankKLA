/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
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
public class MenuPageController implements Initializable {

	@FXML
	private void addPageButtonEvent(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("AddLink.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		AddLinkController controller = display.getController();

		controller.initData(_pages);

		controller.setPrevStage(_stage);

		_stage.show();
	}

	@FXML
	private void viewRankingsButtonEvent(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("RankingDisplay.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		RankingDisplayController controller = display.getController();

		controller.initData(_pages);

		controller.setPrevStage(_stage);

		_stage.show();
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		_pages = new HashMap<>();

		for (String site : Pages.getSiteList()) {
			Page page = new Page(site);

			_pages.put(site, page);
		}
	}

	Map<String, Page> _pages;
	Stage _stage;

	public void setPrevStage(Stage stage) {
		this._stage = stage;
	}
}
