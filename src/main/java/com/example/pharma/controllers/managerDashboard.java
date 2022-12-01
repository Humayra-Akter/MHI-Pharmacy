package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class managerDashboard implements Initializable {
    public Button back;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        back.setOnMouseClicked(MouseEvent->
        {
            try
            {
                back();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }
    private void back() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/startPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharma");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) back.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
}
