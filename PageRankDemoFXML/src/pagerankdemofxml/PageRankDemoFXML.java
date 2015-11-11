/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerankdemofxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author tom
 */
public class PageRankDemoFXML extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader display = new FXMLLoader(getClass().getResource("MenuPage.fxml"));

		Scene scene = new Scene(display.load());

		stage.setScene(scene);

		MenuPageController controller = display.getController();

		controller.setPrevStage(stage);

		stage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		new Pages();

		launch(args);
	}

}
