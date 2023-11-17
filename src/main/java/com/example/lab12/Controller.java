package com.example.lab12;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label resultValue;
    @FXML
    private TextField firstNum;
    @FXML
    private TextField secondNum;
    Calc calculator = new Calc();
    @FXML
    protected void onClearButtonClick() {
        resultValue.setText("");
        firstNum.setText("");
        secondNum.setText("");
    }
    @FXML
    protected void onPlusButtonClick() {
        try {
            int num1 = Integer.parseInt(firstNum.getText());
            int num2 = Integer.parseInt(secondNum.getText());
            resultValue.setText(String.valueOf(calculator.add(num1, num2)));
        }catch(NumberFormatException e) {
            resultValue.setText("Error");
        }
    }
}