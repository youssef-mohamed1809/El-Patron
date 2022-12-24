package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CreateAccountController {

    SceneController sc = new SceneController();
    @FXML
    TextField username;

    @FXML
    PasswordField password;

    @FXML
    public void create_account(ActionEvent e) throws IOException {
        String un = username.getText();
        String p = password.getText();

        boolean duplicate = false;

        if(un.equals("") || p.equals("")){
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Please fill in all credentials");
            a.show();
        }else{
            for(int i = 0; i < loginScreenController.users.size(); i++){
                if(loginScreenController.users.get(i).username.equals(un)){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate){
                Alert a = new Alert(Alert.AlertType.NONE);
                a.setAlertType(Alert.AlertType.ERROR);
                a.setContentText("Username Already Exists");
                a.show();
            }else{
                loginScreenController.users.add(new Customer(un, p));
                Alert a = new Alert(Alert.AlertType.NONE);
                a.setAlertType(Alert.AlertType.CONFIRMATION);
                a.setContentText("User Successfully Added");
                a.show();
                sc.switchToLogin(e);
            }
        }
    }
}
