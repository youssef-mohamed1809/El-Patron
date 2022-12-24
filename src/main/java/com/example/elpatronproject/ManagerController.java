package com.example.elpatronproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagerController implements Initializable {

    @FXML
    AnchorPane issuesViewer;

    @FXML
    Label issues;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String s = "";
        for(int i = 0; i < loginScreenController.issues.size(); i++){
            s += loginScreenController.issues.get(i).name + "\n" + loginScreenController.issues.get(i).email + "\n" + loginScreenController.issues.get(i).issue;
            s += "\n\n\n";
        }

        if(loginScreenController.issues.isEmpty()){
            issues.setText("No Issues");
        }else{
            issues.setText(s);
        }




    }
}
