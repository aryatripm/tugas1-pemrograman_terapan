module com.example.tugas1_no3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugas1_no3 to javafx.fxml;
    exports com.example.tugas1_no3;
}