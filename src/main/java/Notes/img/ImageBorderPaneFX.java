package Notes.img;

import com.ignacia.VAT.Main;
import com.sun.javafx.scene.ImageViewHelper;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by jhudeska on Oct, 2020
 */
public class ImageBorderPaneFX extends Application {
    //Source: https://www.youtube.com/watch?v=Zsf3ZY0qNb0&t=727s

    Button btnempire, btncentral, btnliberty, btnclear;
    ImageView imgPic;
    HBox btnbox;

    @Override
    public void start(Stage window) throws Exception {
        btnempire = new Button("Empire State Building");
        btncentral = new Button("Central Park");
        btnliberty = new Button("Statue of Liberty");
        btnclear = new Button("Clear");

        btnempire.setOnAction(e -> handleButtonAction(e));
        btncentral.setOnAction(e -> handleButtonAction(e));
        btnliberty.setOnAction(e -> handleButtonAction(e));
        btnclear.setOnAction(e -> handleButtonAction(e));

        // put top 3 butons into a box
        btnbox = new HBox(btnempire, btncentral, btnliberty);
        btnbox.setSpacing(10);
        btnbox.setPadding(new Insets(20));

        //make the umage
        imgPic = new ImageView();

        //create the BorderPane
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));

        root.setTop(btnbox);
        root.setCenter(imgPic);
        root.setBottom(btnclear);
        // center the button in the buttom region
        BorderPane.setAlignment(btnclear, Pos.CENTER);

    }

    private void handleButtonAction(ActionEvent event){
        Image img = null;
        if (event.getSource() == btnempire)

//            img = new Image();
        imgPic.setImage(img);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
