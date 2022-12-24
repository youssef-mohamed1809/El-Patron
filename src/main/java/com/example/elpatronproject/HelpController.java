package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.format.TextStyle;

public class HelpController {

    @FXML
    TextField full_name;

    @FXML
    TextField email;

    @FXML
    TextArea issue;

    SceneController sc = new SceneController();

    @FXML
    public void home_click(ActionEvent e) throws IOException{
        sc.switchToMainMenu(e);
    }

    @FXML
    public void mycart_click(ActionEvent e) throws IOException {
        sc.switchToMyCart(e);
    }

    @FXML
    public void maleProducts_click(ActionEvent e) throws IOException{
        sc.switchtoMaleProducts(e);
    }

    @FXML
    public void femaleProducts_click(ActionEvent e) throws IOException {
        sc.switchtoFemaleProducts(e);
    }

    @FXML
    public void track_my_order_click(ActionEvent e) throws IOException{
        sc.switchtoTrackOrder(e);
    }

    @FXML
    public void help_click(ActionEvent e) throws IOException{
        sc.switchToHelp(e);
    }

    @FXML
    public void about_us_click(ActionEvent e) throws IOException {
        sc.switchToAboutUs(e);
    }

    @FXML
    public void sendIssue(ActionEvent e) throws IOException{
        String n = full_name.getText();
        String em = email.getText();
        String i = issue.getText();

        if(n.equals("") || em.equals("") || i.equals("")){
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Credentials Empty");
            a.show();
        }else{
            loginScreenController.issues.add(new Issue(full_name.getText(), email.getText(), issue.getText()));
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.CONFIRMATION);
            a.setContentText("Issue Sent Successfully, the manager will contact you in a few business days");
            a.show();
            sc.switchToMainMenu(e);
        }
    }

}
