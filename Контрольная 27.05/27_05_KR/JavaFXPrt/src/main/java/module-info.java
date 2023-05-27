module com.example.javafxprt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxprt to javafx.fxml;
    exports com.example.javafxprt;
}