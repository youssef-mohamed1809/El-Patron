package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TrackOrderController implements Initializable {
    SceneController sc = new SceneController();

    @FXML
    Label current_order;

    @FXML
    Label order_info;

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String s = "";

        s+= loginScreenController.currentUser.orders.toString();
        s+= "\n\n";


        order_info.setText(s);
    }
}
