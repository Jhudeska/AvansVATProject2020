package Notes.JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by jhudeska on Oct, 2020
 */
public class MyApp extends Application {

    public static void main(String[] args) {
        Application.launch(MyApp.class);
    }

    public void init() throws Exception{
        System.out.println("The init method load whatever you want before we launch" +
                " the application. Example images etc..");
    }
    @Override
    public void start(Stage window) throws Exception {

        window.setTitle("Hello");
        window.show();
    }

    public void stop(){
        System.out.println("After!!");
    }
}
