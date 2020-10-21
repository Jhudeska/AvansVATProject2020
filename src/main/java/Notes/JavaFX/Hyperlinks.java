package Notes.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by jhudeska on Oct, 2020
 */
public class Hyperlinks extends Application {

    public static void main(String[] args) {
        launch(Hyperlinks.class);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Episode 6 = Hyperlinks");
        stage.setHeight(500);
        stage.setWidth(400);

        VBox root = new VBox();
        Hyperlink link = new Hyperlink("Click me Boi");
        link.setOnAction( e -> {
            System.out.println("The link was smashed.");

                });

        Label text = new Label("Link is not touched.");
        ImageView imgView = new ImageView("https://pngtree.com/freepng/vector-cry-emoji-icon_4190533.html");
        Hyperlink link1 = new Hyperlink("Smack Me!", imgView);

        link.setOnAction(e -> {
            text.setText("I've been smacked!");
        });
        root.getChildren().addAll(link, text, link1);


        Scene view = new Scene(root);
        stage.setScene(view);
        stage.show();
    }
}
