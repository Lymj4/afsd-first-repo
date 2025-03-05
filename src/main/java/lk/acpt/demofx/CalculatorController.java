package lk.acpt.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private Label lblAns;

    @FXML
    private TextField txtFN;

    @FXML
    private TextField txtSN;

    String ans;

    @FXML
    void add(ActionEvent event) {
        if (txtFN.getText().equals("") || txtSN.getText().equals("")) {
            ans = "Slots must be filled";
        } else {
            int a = Integer.parseInt(txtFN.getText());
            int b = Integer.parseInt(txtSN.getText());

            ans = String.valueOf(a + b);
        }

    }

    @FXML
    void divide(ActionEvent event) {
        if (txtFN.getText().equals("") || txtSN.getText().equals("")) {
            ans = "Slots must be filled";
        } else{
            double a = Double.parseDouble(txtFN.getText());
            double b = Double.parseDouble(txtSN.getText()); 
            if (b != 0) {
                ans = String.valueOf(a / b);
            } else {
                ans = "Second number cannot be zero";
            }
        }

    }

    @FXML
    void multiply(ActionEvent event) {
        if (txtFN.getText().equals("") || txtSN.getText().equals("")) {
            ans = "Slots must be filled";
        } else {
            int a = Integer.parseInt(txtFN.getText());
            int b = Integer.parseInt(txtSN.getText());

            ans = String.valueOf(a * b);
        }

    }

    @FXML
    void solve(ActionEvent event) {
        lblAns.setText(ans);
    }

    @FXML
    void substract(ActionEvent event) {
        if (txtFN.getText().equals("") || txtSN.getText().equals("")) {
            ans = "Slots must be filled";
        } else {
            int a = Integer.parseInt(txtFN.getText());
            int b = Integer.parseInt(txtSN.getText());
            ans = String.valueOf(a - b);
        }

    }

}
