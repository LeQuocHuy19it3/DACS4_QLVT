import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ServerSite.fxml"));
        primaryStage.setTitle("Server");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        launch(args);
	}

}
