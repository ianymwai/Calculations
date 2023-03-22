module com.example.calculations {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.calculations to javafx.fxml;
    exports com.example.calculations;
}