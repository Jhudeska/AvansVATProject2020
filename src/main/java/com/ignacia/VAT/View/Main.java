package com.ignacia.VAT.View;

import Notes.AppClassGeneral;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {

        AppClassGeneral schoolNote = new AppClassGeneral();
        schoolNote.schoolAantekeningen();


        //Launch application
        launch(Main.class);
    }

    @Override
    public void start(Stage window) throws Exception {

        window.setTitle("Proftaak Vorm Analyse Tool");

        //Layout
        BorderPane layout = new BorderPane();

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Button("Vorm"));
        buttons.getChildren().add(new Button("Second"));
        buttons.getChildren().add(new Button("Third"));

        VBox texts = new VBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("First"));
        texts.getChildren().add(new Label("Second"));
        texts.getChildren().add(new Label("Third"));

        layout.setTop(buttons);
        layout.setLeft(texts);

        layout.setCenter(new TextArea(""));



//        layout.setTop(new Label("top"));
//        layout.setRight(new Label("right"));
//        layout.setBottom(new Label("bottom"));
//        layout.setLeft(new Label("left"));
//        layout.setCenter(new Label("center"));

        Scene view = new Scene(layout,800,500);

        window.setScene(view);
        window.show();

    }
}
