package com.example.pharma.controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginRolePage implements Initializable {
    public AnchorPane loginRolePage;
    public ImageView apatotoCheck;
    public ImageView apatotoCheck2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        apatotoCheck.setOnMouseClicked(MouseEvent-> {
            try {
                change();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        apatotoCheck2.setOnMouseClicked(MouseEvent-> {
            try {
                changes();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
    private void change() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/adminLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);

        Stage currentStage = (Stage) apatotoCheck.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    private void changes() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/managerLogin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);

        Stage currentStage = (Stage) apatotoCheck2.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
}
