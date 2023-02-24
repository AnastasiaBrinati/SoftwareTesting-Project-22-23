module ciprovo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ciprovo to javafx.fxml;
    exports ciprovo;
}