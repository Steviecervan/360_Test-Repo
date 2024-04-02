package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class test extends Application{
	public static void main(String[] args) {
		System.out.println("Hello world!");
		launch(args);
	}
	
	public void start(Stage stage) {		
		stage.setTitle("In Class GitHub Activity");
		BorderPane root = new BorderPane();
		Button nameButton = new Button("Stevie's second commit");
		
		root.setCenter(nameButton);	
		//root.getChildren().add(nameButton);
		stage.setScene(new Scene(root, 650, 400));
		stage.show();
	}
}
