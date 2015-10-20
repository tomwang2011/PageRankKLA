/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
	
	public void initData(Set<Page> pages) {
		_pages = pages;
		
		label.setText("Here are the rankings!");
		String[] rank = new String[10];
		Iterator<Page> it = pages.iterator();
		for(int i = 0; i < 10; i++) {
			Page page = it.next();
			rank[i] = page.getName();
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
	private Set<Page> _pages;
	
	Stage _stage;
	
	public void setPrevStage(Stage stage) {
		this._stage = stage;
	}
}
