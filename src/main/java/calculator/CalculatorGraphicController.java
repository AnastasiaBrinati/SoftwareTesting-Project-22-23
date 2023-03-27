package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import static java.lang.Float.parseFloat;

public class CalculatorGraphicController {

    @FXML
    private TextField tfDisplay;

    String op = "";
    boolean isOpStarted;
    boolean isDotEntered=false;
    boolean isEqualPressed = false;
    float firstNum;
    double result;

    public void displayNumber(ActionEvent actionEvent){
        if(isOpStarted || isEqualPressed){
            isDotEntered = false;
            tfDisplay.setText("");
            isOpStarted = false;
            isEqualPressed = false;
        }
        if(((Button)actionEvent.getTarget()).getText().equals("π")){
            tfDisplay.setText("3.14");
            isDotEntered = true;
        }
        else if(((Button)actionEvent.getTarget()).getText().equals("e")){
            tfDisplay.setText("2.71");
            isDotEntered = true;
        }
        else if(((Button)actionEvent.getTarget()).getText().equals("0")){
            if(isDotEntered || !tfDisplay.getText().equals("0")){
                tfDisplay.setText(tfDisplay.getText() + "0");
            }
        }
        else {
            if(!tfDisplay.getText().equals("0")){
                tfDisplay.setText(tfDisplay.getText() + ((Button)actionEvent.getTarget()).getText());

            }else{
                tfDisplay.setText(((Button)actionEvent.getTarget()).getText());
            }
        }
    }

    public void setTextField(String number){
        tfDisplay.setText(number);
    }


    public void delete(ActionEvent actionEvent){
        if(tfDisplay.getText().length() >0){
            switch (((Button) actionEvent.getTarget()).getText()) {
                case "CE" -> {
                    tfDisplay.setText("");
                    isDotEntered = false;
                    isOpStarted = false;
                }
                case "C" -> {
                    if (tfDisplay.getText().charAt(tfDisplay.getLength() - 1) == '.') {
                        isDotEntered = false;
                    }
                    tfDisplay.setText(tfDisplay.getText().substring(0, tfDisplay.getLength() - 1));
                }
                default -> {
                }
            }

        }

    }

    public void selectOperation(ActionEvent actionEvent){
        if(tfDisplay.getText().length()>0){
            op = ((Button)actionEvent.getTarget()).getText();
            System.out.println("Op selected : "+op);
            isOpStarted = true;
            firstNum = parseFloat(tfDisplay.getText());
        }
    }

    public void displayDot(){
        if(tfDisplay.getText().length()>0){
            if(!isDotEntered){
                tfDisplay.setText(tfDisplay.getText()+".");
            }
            isDotEntered=true;
        }
    }

    public void calculateResult(){
        Calculator calculator = new Calculator();
        isDotEntered=true;
        isEqualPressed = true;
        switch (op) {
            case "+" -> result = calculator.add(firstNum, parseFloat(tfDisplay.getText()));
            case "-" -> result = calculator.sub(firstNum, parseFloat(tfDisplay.getText()));
            case "*" -> result = calculator.mul(firstNum, parseFloat(tfDisplay.getText()));
            case "^" -> result = calculator.pow(firstNum, parseFloat(tfDisplay.getText()));
            case "/" -> {
                try {
                    result = calculator.div(firstNum, parseFloat(tfDisplay.getText()));
                } catch (DivisionByZeroException e) {
                    e.printStackTrace();
                }
            }
            default -> {result = 0.0;}
        }
        System.out.println(result);
        if(result - ((int)(result)) != 0){
            tfDisplay.setText(Double.toString(result));

        }else {
            tfDisplay.setText(Integer.toString(((int) result)));
        }
    }

}