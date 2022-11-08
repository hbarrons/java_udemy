module com.example.java_udemy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_udemy to javafx.fxml;
    exports com.example.java_udemy;
}