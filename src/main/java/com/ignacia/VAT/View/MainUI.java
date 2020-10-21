package com.ignacia.VAT.View;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


/**
 * Created by jhudeska on Oct, 2020
 */
public class MainUI {

    public ImageView printButterflyImage(){
        //Print in BorderPane setTop
        Image img = new Image("butterfly.png",700,400,false,false);
        ImageView imgview = new ImageView();
        imgview.setImage(img);
        imgview.setId("butterfly-image");
        imgview.setY(-800);
        imgview.setX(-100);
        return imgview;
    }

    public Label printLabelMainVat(){
        //Print in BorderPane setTop
        Label labelMain = new Label("VAT Analyse Tool..");
        labelMain.setTextFill(Color.rgb(32,178 ,170 ));
        labelMain.setId("label-main-vat");
        return labelMain;
    }

}
