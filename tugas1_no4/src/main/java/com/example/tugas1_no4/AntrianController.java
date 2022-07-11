package com.example.tugas1_no4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AntrianController {
    @FXML
    public Label now;

    @FXML
    public Label next;

    @FXML
    public TextArea customValue;

    public void customButton(ActionEvent actionEvent) {
        String num = customValue.getText();
        now.setText(num);
        next.setText(String.valueOf(Integer.parseInt(customValue.getText()) + 1 ));
    }

    public void prev(ActionEvent actionEvent) {
        int newValue = Integer.parseInt(now.getText());
        newValue--;
        String newValueString = String.valueOf(newValue);
        now.setText(newValueString);
        next.setText(String.valueOf(newValue + 1));
    }

    public void next(ActionEvent actionEvent) {
        int newValue = Integer.parseInt(now.getText());
        newValue++;
        String newValueString = String.valueOf(newValue);
        now.setText(newValueString);
        next.setText(String.valueOf(newValue + 1));
    }
}