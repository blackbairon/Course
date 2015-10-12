package as.course.db.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Created by RTCCD on 13.10.2015.
 */
public class MainApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        String fxmlFile = "/sample.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent)loader.load(getClass().getResourceAsStream(fxmlFile));
        primaryStage.setTitle("Train database");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
