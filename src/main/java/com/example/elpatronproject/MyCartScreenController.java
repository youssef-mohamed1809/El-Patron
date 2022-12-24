package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyCartScreenController implements Initializable {
    SceneController sc = new SceneController();

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
    public void to_checkout(ActionEvent e) throws IOException {
        sc.switchToCheckout(e);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String myCartinfo = "";

         for(int i = 0; i < loginScreenController.currentUser.myCart.size(); i++){
             myCartinfo +=  loginScreenController.currentUser.myCart.get(i).name + "\n";
             myCartinfo += "\n";
         }

         if(myCartinfo.equals("")){
             productsCartInfo.setText("No products in cart");
         }else{
             productsCartInfo.setText(myCartinfo);
         }
    }
}
