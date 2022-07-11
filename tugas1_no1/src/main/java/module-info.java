module com.example.tugas1_no1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugas1_no1 to javafx.fxml;
    exports com.example.tugas1_no1;
}