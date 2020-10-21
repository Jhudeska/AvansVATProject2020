package com.ignacia.VAT;

import com.ignacia.VAT.View.MainUI;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;

public class Main extends Application {
    private ImageView imgpic;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {

        window.setTitle("JavaFX - Vorm Applicatie");
        window.getIcons().add(new Image("icon.png", 100,100,true,true));


        MainUI mainUI = new MainUI();
        BorderPane layout = new BorderPane();
        StackPane setTop = new StackPane();





        // Stack Pane setTop
        ImageView imgview = mainUI.printButterflyImage();
        Label labelMain = mainUI.printLabelMainVat();
        setTop.getChildren().addAll(imgview,labelMain);



        //VBox setCenter
        //TODO in css with menu zetten
        VBox setCenter = new VBox();
        setCenter.setAlignment(Pos.CENTER);


        Label shapeMenu = new Label("Vorm");
        MenuItem item1 = new MenuItem("Cube");
        MenuItem item2 = new MenuItem("Cubiod");
        MenuItem item3 = new MenuItem("Cylinder");
        MenuItem item4 = new MenuItem("Pyramide");
        MenuItem item5 = new MenuItem("Sphere");

        MenuButton menuButton = new MenuButton("Kies een vorm", null, item1,item2,item3,item4, item5);

        Label content = new Label("Inhoud");
        TextField txtFInhoud = new TextField();
        Label totalContent = new Label("Totale inhoud");
        TextField txtFTotalInhoud = new TextField();

        HBox buttonBox2 = new HBox();
        Button btnSave = new Button("Save");
        Button btnLoad = new Button("Load");
        Button btnTotalInhoud = new Button("Totaal Inhoud");
        Button btnDelete = new Button("Delete");
        buttonBox2.setSpacing(10);
        buttonBox2.getChildren().addAll(btnLoad, btnDelete, btnSave, btnTotalInhoud);

        setCenter.getChildren().addAll(shapeMenu, content,menuButton,txtFInhoud,totalContent,txtFTotalInhoud, buttonBox2);

        VBox listViewBox = new VBox();
        ListView<String> listV = new ListView<>();
        listViewBox.getChildren().addAll(listV);


        /**
         *   //Shape itemwindows
         */
        //Cube
        item1.setOnAction( i -> {
            Stage itemWindow = new Stage();
            //TODO juiste vorm inbouwen en functie gebruiken voor alle vormen
            itemWindow.setTitle("JavaFX - Juiste vorm");
            itemWindow.getIcons().add(new Image("icon.png", 100,100,true,true));
            itemWindow.initModality(Modality.WINDOW_MODAL);
            itemWindow.initOwner(window);
            itemWindow.initStyle(StageStyle.UTILITY);
            itemWindow.setX(50);
            itemWindow.setY(150);


            FlowPane stPane = new FlowPane();

            HBox labelBox = new HBox();
            Label radius = new Label("straal");
            TextField radiusTxt = new TextField();
            Label heigth = new Label("hoogte");
            TextField heightTxt = new TextField();
            labelBox.setSpacing(10);
            labelBox.getChildren().addAll(radius,radiusTxt,heigth,heightTxt);

            HBox buttonBox = new HBox();
            Button ok = new Button("OK");
            Button cancel = new Button("Annuleer");
            buttonBox.setSpacing(10);

            Image img = new Image("Cube.png",50,100,false,false);
            ImageView imgCube = new ImageView();
            imgCube.setImage(img);

            buttonBox.getChildren().addAll(ok,cancel,imgCube);

            stPane.getChildren().addAll(labelBox,buttonBox);

            Scene view = new Scene(stPane,450,150);
            itemWindow.setScene(view);

            itemWindow.setResizable(false);
            itemWindow.sizeToScene();

            itemWindow.show();
        });


        //Cubiod
        item2.setOnAction( i -> {
            Stage itemWindow2 = new Stage();
            //TODO juiste vorm inbouwen en functie gebruiken voor alle vormen
            itemWindow2.setTitle("JavaFX - Juiste vorm");
            itemWindow2.getIcons().add(new Image("icon.png", 100,100,true,true));
            itemWindow2.initModality(Modality.WINDOW_MODAL);
            itemWindow2.initOwner(window);
            itemWindow2.initStyle(StageStyle.UTILITY);
            itemWindow2.setX(50);
            itemWindow2.setY(150);


            FlowPane stPane = new FlowPane();

            HBox labelBox2 = new HBox();
            Label length = new Label("lengte");
            TextField lengthTxt = new TextField();
            Label heigth2 = new Label("hoogte");
            TextField heightTxt2 = new TextField();
            Label width = new Label("breedte");
            TextField widthTxt = new TextField();
            labelBox2.setSpacing(10);
            labelBox2.getChildren().addAll(length,lengthTxt,heigth2,heightTxt2,width, widthTxt);

            HBox buttonBox3 = new HBox();
            Button ok2 = new Button("OK");
            Button cancel2 = new Button("Annuleer");
            buttonBox3.setSpacing(10);

            Image img = new Image("Cubiod.png",50,100,false,false);
            ImageView imgCubiod = new ImageView();
            imgCubiod.setImage(img);

            buttonBox3.getChildren().addAll(ok2,cancel2,imgCubiod);

            stPane.getChildren().addAll(labelBox2,buttonBox3);

            Scene view = new Scene(stPane,450,150);
            itemWindow2.setScene(view);

            itemWindow2.setResizable(false);
            itemWindow2.sizeToScene();

            itemWindow2.show();
        });



        //Cylinder
        item3.setOnAction( i -> {
            Stage itemWindow3 = new Stage();
            //TODO juiste vorm inbouwen en functie gebruiken voor alle vormen
            itemWindow3.setTitle("JavaFX - Juiste vorm");
            itemWindow3.getIcons().add(new Image("icon.png", 100,100,true,true));
            itemWindow3.initModality(Modality.WINDOW_MODAL);
            itemWindow3.initOwner(window);
            itemWindow3.initStyle(StageStyle.UTILITY);
            itemWindow3.setX(50);
            itemWindow3.setY(150);


            FlowPane stPane = new FlowPane();

            HBox labelBox3 = new HBox();
            Label radiusCy = new Label("straal");
            TextField radiusTxtCy = new TextField();
            Label heigthCy = new Label("hoogte");
            TextField heightTxtCy = new TextField();
            labelBox3.setSpacing(10);
            labelBox3.getChildren().addAll(radiusCy,radiusTxtCy,heigthCy,heightTxtCy);

            HBox buttonBox3 = new HBox();
            Button ok3 = new Button("OK");
            Button cancel3 = new Button("Annuleer");
            buttonBox3.setSpacing(10);

            Image img = new Image("Cylinder.png",50,100,false,false);
            ImageView imgCylinder = new ImageView();
            imgCylinder.setImage(img);

            buttonBox3.getChildren().addAll(ok3,cancel3,imgCylinder);

            stPane.getChildren().addAll(labelBox3,buttonBox3);

            Scene view = new Scene(stPane,450,150);
            itemWindow3.setScene(view);

            itemWindow3.setResizable(false);
            itemWindow3.sizeToScene();

            itemWindow3.show();
        });


        //Pyramide
        item4.setOnAction( i -> {
            Stage itemWindow4 = new Stage();
            //TODO juiste vorm inbouwen en functie gebruiken voor alle vormen
            itemWindow4.setTitle("JavaFX - Juiste vorm");
            itemWindow4.getIcons().add(new Image("icon.png", 100,100,true,true));
            itemWindow4.initModality(Modality.WINDOW_MODAL);
            itemWindow4.initOwner(window);
            itemWindow4.initStyle(StageStyle.UTILITY);
            itemWindow4.setX(50);
            itemWindow4.setY(150);


            FlowPane stPane = new FlowPane();

            HBox labelBox4 = new HBox();
            Label lengthPy = new Label("lengte");
            TextField lengthTxtPy = new TextField();
            Label heigthPy = new Label("hoogte");
            TextField heightTxtPy = new TextField();
            labelBox4.setSpacing(10);
            labelBox4.getChildren().addAll(lengthPy,lengthTxtPy,heigthPy,heightTxtPy);


            HBox buttonBox4 = new HBox();
            Button ok4 = new Button("OK");
            Button cancel4 = new Button("Annuleer");
            buttonBox4.setSpacing(10);

            Image img = new Image("Cone.png",50,100,false,false);
            ImageView imgPymirade = new ImageView();
            imgPymirade.setImage(img);

            buttonBox4.getChildren().addAll(ok4,cancel4,imgPymirade);

            stPane.getChildren().addAll(labelBox4,buttonBox4);

            Scene view = new Scene(stPane,450,150);
            itemWindow4.setScene(view);

            itemWindow4.setResizable(false);
            itemWindow4.sizeToScene();

            itemWindow4.show();
        });


        //Sphere
        item5.setOnAction( i -> {
            Stage itemWindow5 = new Stage();
            //TODO juiste vorm inbouwen en functie gebruiken voor alle vormen
            itemWindow5.setTitle("JavaFX - Juiste vorm");
            itemWindow5.getIcons().add(new Image("icon.png", 100,100,true,true));
            itemWindow5.initModality(Modality.WINDOW_MODAL);
            itemWindow5.initOwner(window);
            itemWindow5.initStyle(StageStyle.UTILITY);
            itemWindow5.setX(50);
            itemWindow5.setY(150);


            FlowPane stPane = new FlowPane();

            HBox labelBox5= new HBox();
            Label radiusSp = new Label("radius");
            TextField radiusTxtSp = new TextField();
            labelBox5.getChildren().addAll(radiusSp,radiusTxtSp);


            HBox buttonBox5 = new HBox();
            Button ok5 = new Button("OK");
            Button cancel5 = new Button("Annuleer");
            buttonBox5.setSpacing(10);

            Image img = new Image("Sphere.png",50,100,false,false);
            ImageView imgSphere = new ImageView();
            imgSphere.setImage(img);

            buttonBox5.getChildren().addAll(ok5,cancel5,imgSphere);

            stPane.getChildren().addAll(labelBox5,buttonBox5);

            Scene view = new Scene(stPane,450,150);
            itemWindow5.setScene(view);

            itemWindow5.setResizable(false);
            itemWindow5.sizeToScene();

            itemWindow5.show();
        });





        //SetBottom BorderPane
        HBox setBottom = new HBox();
        Image img = new Image("setBottomImg.png",700,250,false,false);
        ImageView imgview2 = new ImageView();
        imgview2.setImage(img);
        setBottom.getChildren().addAll(imgview2);




        layout.setTop(setTop);
        layout.setRight(listViewBox);
        layout.setBottom(setBottom);
        layout.setLeft(new Label(""));
        layout.setCenter(setCenter);

        Scene view = new Scene(layout,700,900);
        view.getStylesheets().add(getClass().getClassLoader().getResource("vat.css").toExternalForm());
        window.setScene(view);
        window.setX(30);
        window.setY(100);
        window.setResizable(false);
        window.sizeToScene();
        window.show();

    }
}
