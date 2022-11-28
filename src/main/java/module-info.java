module com.example.pharma {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.pharma to javafx.fxml;
    exports com.example.pharma;
    exports com.example.pharma.controllers;
}