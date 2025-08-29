module com.example.aula_6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aula_6 to javafx.fxml;
    exports com.example.aula_6;
}