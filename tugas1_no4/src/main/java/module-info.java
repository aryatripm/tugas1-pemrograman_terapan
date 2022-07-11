module com.example.tugas1_no4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugas1_no4 to javafx.fxml;
    exports com.example.tugas1_no4;
}