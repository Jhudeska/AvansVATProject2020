package Notes.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.Mnemonic;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by jhudeska on Oct, 2020
 */
public class Menomic extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("Mnenomic || Menu Buttons");
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
//        Mnemonic mnemonic = new Mnemonic(btn,c);

        btn.setMnemonicParsing(true);

        btn.setOnAction(c -> {
            System.out.println("Button tapped;");
        });

        //Menu
        MenuItem item1 = new MenuItem("Taco");
        MenuItem item2 = new MenuItem("Buritto");
        MenuItem item3 = new MenuItem("Cheese Enchilada");
        MenuItem item4 = new MenuItem("Chips & Salsa");

        MenuButton menuButton = new MenuButton("Favorite Mexican Food", null, item1,item2,item3,item4);


        root.getChildren().addAll(btn,menuButton);
        Scene view = new Scene(root);
        window.setScene(view);
        window.show();


    }
}
