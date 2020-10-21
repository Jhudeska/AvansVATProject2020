package Notes.JavaFX;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by jhudeska on Oct, 2020
 */
public class Stages extends Application {

    public static void main(String[] args) {
        launch(Stages.class);
    }
    @Override
    public void start(Stage stage) throws Exception {
        //first window
        stage.setTitle("A cool window");
        stage.show();

        //second window
        Stage stage2 = new Stage();
        stage2.setTitle("second window");

        // window size
        stage2.setWidth(700);
        stage2.setHeight(100);

        // set window position
        stage2.setX(50);
        stage2.setY(100);

        // set window1 position
        stage.setX(30);
        stage.setY(100);

        stage2.show();


        //Modality|| zorgt dat andere scherm open van appicatie inactief zijn
        Stage newWindow = new Stage();
//        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.initOwner(stage2);

        //How to style win
        newWindow.initStyle(StageStyle.UTILITY);
        newWindow.show();





    }
}
