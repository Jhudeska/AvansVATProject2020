package Notes.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by jhudeska on Oct, 2020
 */
public class ButtonExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("ButtonExample");
        window.setHeight(500);
        window.setWidth(400);

        VBox root = new VBox();

        Button btn = new Button("Click Me");
//        btn.setStyle("-fx-font-size: 45px");
//        btn.setText("Republicans are really cool.");
//        btn.setWrapText(true);
        btn.setMinSize(50,50);
        btn.setPrefSize(100, 100);
        btn.setMaxSize(150, 150);


        root.getChildren().addAll(btn);
        Scene view = new Scene(root);
        window.setScene(view);
        window.show();


    }
}
