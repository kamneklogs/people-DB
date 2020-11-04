package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.DBDriver;

public class Main extends Application {

	private PeopleController pc;
	
	private DBDriver db;
	
	public Main() {

		db= new DBDriver();
		pc = new PeopleController(db);
 
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmll = new FXMLLoader(getClass().getResource("peopleDBFXML.fxml"));
		fxmll.setController(pc);
		Parent root = fxmll.load();

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("People Database");
		primaryStage.show();
	}

}