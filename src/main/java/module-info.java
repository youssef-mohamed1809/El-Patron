module com.example.elpatronproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.elpatronproject to javafx.fxml;
    exports com.example.elpatronproject;
}