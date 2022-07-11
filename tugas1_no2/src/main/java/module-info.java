module com.example.tugas1_no2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugas1_no2 to javafx.fxml;
    exports com.example.tugas1_no2;
}