/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import pagerankdemofxml.Pages;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tom
 */
public class RankingDisplayController implements Initializable {

	@FXML
	private Label label;
	@FXML
	private Label rank1,rank2,rank3,rank4,rank5,rank6,rank7,rank8,rank9,rank10;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

	public void initData(Map<String, Page> pages) {

		label.setText("Here are the rankings!");
		String[] rank = new String[10];
		List<Page> pageList = new ArrayList<>();

		for (Page page : pages.values()) {
			System.out.println(page.getName());
			System.out.println(page.getLinks().size());
			pageList.add(page);
		}
		for(int i = 0; i < 10; i++) {
			rank[i] = pageList.get(i).getName();
		}
		rank1.setText(rank[0]);
		rank2.setText(rank[1]);
		rank3.setText(rank[2]);
		rank4.setText(rank[3]);
		rank5.setText(rank[4]);
		rank6.setText(rank[5]);
		rank7.setText(rank[6]);
		rank8.setText(rank[7]);
		rank9.setText(rank[8]);
		rank10.setText(rank[9]);
	}

	Stage _stage;

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
