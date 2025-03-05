package lk.acpt.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    void event(ActionEvent event) {
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        System.out.println(email+" "+password);
    }
}
