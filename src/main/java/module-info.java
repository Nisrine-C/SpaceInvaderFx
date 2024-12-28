module com.project.spaceinvaderfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.spaceinvaderfx to javafx.fxml;
    opens com.project.spaceinvaderfx.controller to javafx.fxml;
    exports com.project.spaceinvaderfx;
    exports com.project.spaceinvaderfx.controller;
}