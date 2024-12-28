module com.project.spaceinvaderfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.spaceinvaderfx to javafx.fxml;
    exports com.project.spaceinvaderfx;
}