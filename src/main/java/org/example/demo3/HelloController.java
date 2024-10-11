package org.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField myText;
    @FXML
    private Label myLabel;

    @FXML
    private TextField myText1;

    @FXML
    private TextField myText2;

    @FXML
    private void clickButton(){
        int number1 = Integer.parseInt(myText1.getText());
        int number2 = Integer.parseInt(myText2.getText());

        int sum = number1 + number2;

        myLabel.setText("Sum = " + sum);
    }
}