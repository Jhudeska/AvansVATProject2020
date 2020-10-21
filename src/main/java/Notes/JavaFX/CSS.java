package Notes.JavaFX;

import com.mysql.cj.xdevapi.Client;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by jhudeska on Oct, 2020
 */
public class CSS extends Application {

    @Override
    public void start(Stage window) throws Exception {

        window.setTitle("Css");
        window.setWidth(400);
        window.setHeight(500);

        VBox root = new VBox();
        Label label1 = new Label("This is a cool label bro.");
        Label label2 = new Label("This is a hlskdfhjlfd label bro.");
        label2.setId("special-label");
        root.getStylesheets().add("fire.css");

        Label label3 = new Label("Jhudeska ");
        label3.setId("special-tab");


        Hyperlink link = new Hyperlink("hello");
        link.setStyle("-fx-background-color: orange; -fx-rotate: 45");

        root.getChildren().addAll(label1, label2,link); //VBox root has two childeren

        Scene view = new Scene(root);
        view.getStylesheets().add(getClass().getClassLoader().getResource("style.css").toExternalForm());


        window.setScene(view);
        window.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
