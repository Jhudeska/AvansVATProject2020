package Notes.JavaFX;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by jhudeska on Oct, 2020
 */
public class Scenes extends Application {

    public static void main(String[] args) {
        launch(Scenes.class);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Scenes");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox parent = new VBox(); //parent node
        Label label1 = new Label("This is a label"); // child node
        Label label2 = new Label("Another label"); // child node
        parent.getChildren().addAll(label1, label2);


        Scene view = new Scene(parent);

        //set mouse cursor
        view.setCursor(Cursor.CROSSHAIR);

        stage.setScene(view);
        stage.show();


    }
}
