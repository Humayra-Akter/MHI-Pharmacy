package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class salesmanDashboard implements Initializable {
    private Button back;
    private ImageView facebook_icon;


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
        facebook_icon.setOnMouseClicked(MouseEvent -> {
            try {
                show_facebook();
            } catch (URISyntaxException | IOException e) {
                throw new RuntimeException(e);
            }
        });


    }
    private void back() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/loginRolePage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("MHIPharma");
        stage.setScene(scene);
        stage.setResizable(false);
        Stage currentStage = (Stage) back.getScene().getWindow();
        currentStage.close();
        stage.show();
    }

    private void show_facebook() throws URISyntaxException, IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com"));
    }


}
