package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CheckoutController {
    SceneController sc = new SceneController();

    @FXML
    TextField full_name;

    @FXML
    TextField cc_num;

    @FXML
    TextField cc_pin;

    @FXML
    TextField address;

    @FXML
    TextField zip;

    @FXML
    TextArea suggestions;

    @FXML
    Label productsCartInfo;
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
    public void complete_order(ActionEvent e) throws IOException{
        String name = full_name.getText();
        String add = address.getText();
        String ccn = cc_num.getText();
        String ccp = cc_pin.getText();
        String z = zip.getText();

        Alert a = new Alert(Alert.AlertType.NONE);
        if(name.equals("") || add.equals("") || ccn.equals("") || ccp.equals("") || z.equals("")){
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Credentials Empty");
            a.show();
        } else{
            a.setAlertType(Alert.AlertType.CONFIRMATION);
            a.setContentText("Order Successfull");
            a.show();

            loginScreenController.currentUser.orders.p = loginScreenController.currentUser.myCart;
            loginScreenController.currentUser.orders.full_name = name;
            loginScreenController.currentUser.orders.address = add;
            loginScreenController.currentUser.orders.credit_card_num = ccn;
            loginScreenController.currentUser.orders.credit_card_pin = ccp;
            loginScreenController.currentUser.orders.zip = z;

            loginScreenController.currentUser.myCart.clear();
            sc.switchToMainMenu(e);

        }
    }
}
