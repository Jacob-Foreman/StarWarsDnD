module com.starwarsdnd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.starwarsdnd to javafx.fxml;
    exports com.starwarsdnd;
}
