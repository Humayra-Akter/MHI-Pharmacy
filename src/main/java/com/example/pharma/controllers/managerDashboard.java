package com.example.pharma.controllers;

import com.example.pharma.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class managerDashboard implements Initializable {
    
    @FXML
    private Button addSalesman;

    @FXML
    private Button back;

    @FXML
    private Button checkDrug;
    @FXML
    private BorderPane border_pane;

    @FXML
    private Button expireCheck;

    @FXML
    private Button logout;

    @FXML
    private Button requestDrug;


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
        logout.setOnMouseClicked(MouseEvent->
        {
            try
            {
                back();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        addSalesman.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/addSalesman.fxml"));
                set_center(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
         checkDrug.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/checkDrug.fxml"));
                setCheckDrug(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        expireCheck.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/expireDrug.fxml"));
                setExpireCheck(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
        requestDrug.setOnMouseClicked(MouseEvent -> {
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/requestDrug.fxml"));
                setRequestDrug(fxmlLoader);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
    }

    private void set_center(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }
    private void setExpireCheck(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }
    private void setCheckDrug(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
    }
    private void setRequestDrug(FXMLLoader fxmlLoader) throws IOException{
        AnchorPane anchorPane = fxmlLoader.load();
        border_pane.setCenter(anchorPane);
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
}
