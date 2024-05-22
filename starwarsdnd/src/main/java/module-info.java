module com.starwarsdnd {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.starwarsdnd to javafx.fxml;
    exports com.starwarsdnd;
}
