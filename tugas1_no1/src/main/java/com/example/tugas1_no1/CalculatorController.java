package com.example.tugas1_no1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField bilanganSatu;

    @FXML
    private TextField bilanganDua;

    @FXML
    private TextField hasil;

    @FXML
    private Button tambah;

    @FXML
    private Button kurang;

    @FXML
    private Button kali;

    @FXML
    private Button bagi;

    @FXML
    protected void tambah() {
        Integer satu = Integer.valueOf(bilanganSatu.getText());
        Integer dua = Integer.valueOf(bilanganDua.getText());
        int tiga = satu + dua;
        hasil.setText(Integer.toString(tiga));
    }
    @FXML
    protected void kurang() {
        Integer satu = Integer.valueOf(bilanganSatu.getText());
        Integer dua = Integer.valueOf(bilanganDua.getText());
        int tiga = satu - dua;
        hasil.setText(Integer.toString(tiga));
    }
    @FXML
    protected void kali() {
        Integer satu = Integer.valueOf(bilanganSatu.getText());
        Integer dua = Integer.valueOf(bilanganDua.getText());
        int tiga = satu * dua;
        hasil.setText(Integer.toString(tiga));
    }
    @FXML
    protected void bagi() {
        Integer satu = Integer.valueOf(bilanganSatu.getText());
        Integer dua = Integer.valueOf(bilanganDua.getText());
        int tiga = satu / dua;
        hasil.setText(Integer.toString(tiga));
    }
}