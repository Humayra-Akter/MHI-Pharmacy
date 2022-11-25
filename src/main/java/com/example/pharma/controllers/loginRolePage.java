package com.example.pharma.controllers;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class loginRolePage implements Initializable {
    public AnchorPane loginRolePage;
    public ImageView apatotoCheck;
    public ImageView apatotoCheck2;
    public ImageView image2;
    public ImageView image3;
    public ImageView image1;

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

        ScaleTransition scale1 = new ScaleTransition();
        scale1.setNode(image1);
        scale1.setDuration(Duration.millis(2000));
        scale1.setCycleCount(TranslateTransition.INDEFINITE);
        scale1.setByX(0.3);
        scale1.setByY(0.3);
        scale1.setAutoReverse(true);
        scale1.play();

        ScaleTransition scale2 = new ScaleTransition();
        scale2.setNode(image2);
        scale2.setDuration(Duration.millis(2000));
        scale2.setCycleCount(TranslateTransition.INDEFINITE);
        scale2.setByX(0.3);
        scale2.setByY(0.3);
        scale2.setAutoReverse(true);
        scale2.play();

        ScaleTransition scale3 = new ScaleTransition();
        scale3.setNode(image3);
        scale3.setDuration(Duration.millis(2000));
        scale3.setCycleCount(TranslateTransition.INDEFINITE);
        scale3.setByX(0.3);
        scale3.setByY(0.3);
        scale3.setAutoReverse(true);
        scale3.play();
    }
    private void change() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/adminDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);

        Stage currentStage = (Stage) apatotoCheck.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
    private void changes() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startPage.class.getResource("/aboutPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharmacy");
        stage.setScene(scene);

        Stage currentStage = (Stage) apatotoCheck2.getScene().getWindow();
        currentStage.close();
        stage.show();
    }
}
