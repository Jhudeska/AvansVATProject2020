package Notes.JavaFX;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by jhudeska on Oct, 2020
 */
public class ImagesAndLabels extends Application {
    public static void main(String[] args) {
        launch(ImagesAndLabels.class);
    }


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Label and Image");
        stage.setWidth(400);
        stage.setHeight(500);

        VBox root = new VBox(); //Parent node
        //Option1
//        ImageView imageView = new ImageView("http://www.opstrijkertjes.nl/196-thickbox_default/4-water-ijsjes.jpg");
        //Option2
//        Image image = new Image("http://www.opstrijkertjes.nl/196-thickbox_default/4-water-ijsjes.jpg");
//        ImageView imgV = new ImageView(image);


        ImageView imageView2 = new ImageView("https://www.clipartmax.com/png/small/90-907135_adobe-illustrator-icon-circle-png-green-vector.png");
        Label label1 = new Label("This is a text label", imageView2);
        Label label2 = new Label("Pikels are cool!");
        label2.setTextFill(Color.web("#9042f5")); //purple
        label2.setFont(new Font("Cambria", 45));
        label2.setRotate(34);

        root.getChildren().addAll(label1, label2);


        Scene view = new Scene(root);
        stage.setScene(view);
        stage.show();
    }
}
