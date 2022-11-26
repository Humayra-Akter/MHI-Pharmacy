package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class adminDashboard implements Initializable {
    public BorderPane border_pane;
    public Button addRmvBranch;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/adminDashboard.fxml"));
        try{
            set_center(fxmlLoader);
        }catch (IOException e){
            throw new RuntimeException();
        }
        addRmvBranch.setOnMouseClicked(MouseEvent ->{
            try{
                set_center(new FXMLLoader(HelloApplication.class.getResource("/adminAddRmvBrunch.fxml")));
            }catch (IOException e){
                throw new RuntimeException();
            }
        });
    }
    private void set_center(FXMLLoader fxmlLoader) throws IOException{
                AnchorPane anchorPane = fxmlLoader.load();
                border_pane.setCenter(anchorPane);
    }
}
