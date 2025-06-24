module com.example.tickets_airlines {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.tickets_airlines to javafx.fxml;
    exports com.example.tickets_airlines;
}