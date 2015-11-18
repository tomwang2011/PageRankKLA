/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
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

	@FXML
	private Label linknum1,linknum2,linknum3,linknum4,linknum5,linknum6,linknum7,linknum8,linknum9,linknum10;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	public void initData() {
		Map<String,Page> pages = Pages.getMap();

		label.setText("Current Ranking");

		String[] rank = new String[10];
		String[] num = new String[10];

		List<Page> pageList = new ArrayList<>();

		Map<String, Integer> nameKey = new HashMap<>();

		int j = 0;

		for (String name : Pages.getSiteList()) {
			nameKey.put(name, j);
			j++;
		}

		for (Page page : pages.values()) {
			Set<Page> pageLinks = page.getLinks();

			for (Page link : pageLinks) {
				pages.get(link.getName()).setIncomingLinks(page);
			}
		}

		Set<Page> addedSites = new HashSet<>();

		for(int k = 0; k < 10; k++) {
			pageList.add(getMax(addedSites));
		}

		for(int i = 0; i < 10; i++) {
			rank[i] = pageList.get(i).getName();
			num[i] = String.valueOf(pageList.get(i).getIncomingLinks().size());
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
		linknum1.setText(num[0]);
		linknum2.setText(num[1]);
		linknum3.setText(num[2]);
		linknum4.setText(num[3]);
		linknum5.setText(num[4]);
		linknum6.setText(num[5]);
		linknum7.setText(num[6]);
		linknum8.setText(num[7]);
		linknum9.setText(num[8]);
		linknum10.setText(num[9]);
	}

	Stage _stage;

	public Page getMax(Set<Page> addedSites) {
		Map<String, Page> sites = Pages.getMap();

		Page[] pageList = new Page[10];

		int i = 0;
		for (Page page : sites.values()) {
			pageList[i] = page;
			i++;
		}

		Page max = pageList[0];

		int j = 1;

		while (addedSites.contains(max)) {
			max = pageList[j];
			j++;
		}

		for (Page page : pageList) {
			if (!addedSites.contains(page)) {
				if(page.getIncomingLinks().size() > max.getIncomingLinks().size()) {
					max = page;
				}
				else if(page.getIncomingLinks().size() == max.getIncomingLinks().size()) {
					int pageTotal = 0;
					for (Page incomingLink : page.getIncomingLinks()) {
						pageTotal += incomingLink.getIncomingLinks().size();
					}
					int maxTotal = 0;
					for (Page incomingLink : max.getIncomingLinks()) {
						maxTotal += incomingLink.getIncomingLinks().size();
					}

					if (pageTotal > maxTotal) {
						max = page;
					}
				}
			}
		}
		addedSites.add(max);

		return max;
	}

	public void setPrevStage(Stage stage) {
		this._stage = stage;
	}

	@FXML
	private void ReturnToMenu(ActionEvent event) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource(
			"MenuPage.fxml"));

		Scene scene = new Scene(display.load());

		_stage.setScene(scene);

		MenuPageController controller = display.getController();

		controller.setPrevStage(_stage);

		_stage.show();
	}
}