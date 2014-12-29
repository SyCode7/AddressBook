package de.addrBook.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FXDisplayDatabase extends Application {

	@Override
	public void start(Stage stage) throws Exception {

			stage.setTitle("MyDevOpsView");
			stage.setHeight(60);
			stage.setWidth(80);
			
			TableView tableview;
			tableview = new TableView();
			DisplayDatabase.buildData(tableview);
			GridPane gridPane = new GridPane();
			gridPane.setPadding(new Insets(20, 20, 20, 20));
			gridPane.setHgap(5);
			gridPane.setVgap(5);
			Scene scene = new Scene (tableview);
			stage.setScene(scene);
			stage.show();
	}
	public static void main (String args []){
		launch(null);
	}
}
