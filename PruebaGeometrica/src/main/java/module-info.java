module com.abc.pruebageometrica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.abc.pruebageometrica to javafx.fxml;
    exports com.abc.pruebageometrica;
}