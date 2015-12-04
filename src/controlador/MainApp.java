package controlador;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import vista.MGHProfileController;

public class MainApp extends Application {

	private Stage primaryStage;
	private AnchorPane mygithubprofile;

	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("My GitHub Profile");

		this.primaryStage.setResizable(true);
		//this.primaryStage.getIcons().add(new Image("file:res/profilephoto"));


		initMyGitHubProfile();
	}

	public void initMyGitHubProfile() {

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApp.class.getResource("MyGitHubProfile.fxml"));


		Scene scene = new Scene(mygithubprofile);
		primaryStage.setScene(scene);


		// Give the controller access to the main app.
		MGHProfileController controller = loader.getController();
		controller.setMainApp(this);

		primaryStage.show();

	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}

