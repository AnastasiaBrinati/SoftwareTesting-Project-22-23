module calcolatrice {
    requires javafx.controls;
    requires javafx.fxml;


    opens calcolatrice to javafx.fxml;
    exports calcolatrice;
}