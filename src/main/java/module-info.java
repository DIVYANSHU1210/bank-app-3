module com.example.bankapp3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankapp3 to javafx.fxml;
    exports com.example.bankapp3;
}