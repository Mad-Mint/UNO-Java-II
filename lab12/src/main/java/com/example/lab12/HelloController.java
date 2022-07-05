package com.example.lab12;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label label;
    @FXML
    private TextField input;
    @FXML
    private TextField inputNum;

    @FXML
    public void submit() {
        try{
            String words = input.getText();
            if(words.isEmpty()){
                label.setText("Enter name");
                return;
            }
            String numbers = inputNum.getText();
            int num = Integer.parseInt(numbers);
            label.setText("Hello " + words + "\n" + "You are " + num * 2 + " years!");
        } catch (Exception e){
            label.setText("Enter a Number");
        }
    }
}