package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class adminDashboard implements Initializable {
    public BorderPane border_pane;
    public Button addRmvBranch;
    public ImageView facebook_icon;
    public Button back;
    public Button addRmvDrug;

    @FXML
    private Button drugHistory;


    @FXML
    private Button logout;

    public adminDashboard(Button drugHistory) {
        this.drugHistory = drugHistory;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/adminDashboard.fxml"));
//        try{
//            set_center(fxmlLoader);
//        }catch (IOException e){
//            throw new RuntimeException();
//        }
        addRmvBranch.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/adminAddRmvBrunch.fxml"));
                set_center(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });


        facebook_icon.setOnMouseClicked(MouseEvent -> {
            try {
                show_facebook();
            } catch (URISyntaxException | IOException e) {
                throw new RuntimeException(e);
            }
        });

        back.setOnMouseClicked(MouseEvent->
        {
            try
            {
                startPage();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void show_facebook() throws URISyntaxException, IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
    }

    private void set_center(FXMLLoader fxmlLoader) throws IOException{
                AnchorPane anchorPane = fxmlLoader.load();
                border_pane.setCenter(anchorPane);
    }
    public void startPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/startPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);
        Stage currentStage = (Stage) back.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
}
