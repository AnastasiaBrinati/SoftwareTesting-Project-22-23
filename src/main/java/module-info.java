module calcolatrice {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens calculator to javafx.fxml;
    exports calculator;
}