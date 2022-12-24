package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MaleProductsController implements Initializable {

    SceneController sc = new SceneController();


    @FXML
    public void p1w_click(ActionEvent e) throws IOException {
        //white hoodie pid 5;
        for(int i = 0; i <loginScreenController.availableProducts.size(); i++){
            if(loginScreenController.availableProducts.get(i).productID.equals("5")){
                loginScreenController.currentProduct = loginScreenController.availableProducts.get(i);
                sc.switchtoProducts(e);
            }
        }

    }

    @FXML
    public void p2w_click(ActionEvent e) throws IOException {
        for(int i = 0; i <loginScreenController.availableProducts.size(); i++){
            if(loginScreenController.availableProducts.get(i).productID.equals("7")){
                loginScreenController.currentProduct = loginScreenController.availableProducts.get(i);
                sc.switchtoProducts(e);
            }
        }
    }

    @FXML
    public void p3w_click(ActionEvent e) throws IOException {
        for(int i = 0; i <loginScreenController.availableProducts.size(); i++){
            if(loginScreenController.availableProducts.get(i).productID.equals("6")){
                loginScreenController.currentProduct = loginScreenController.availableProducts.get(i);
                sc.switchtoProducts(e);
            }
        }
    }

    @FXML
    public void p4w_click(ActionEvent e) throws IOException {
        for(int i = 0; i <loginScreenController.availableProducts.size(); i++){
            if(loginScreenController.availableProducts.get(i).productID.equals("4")){
                loginScreenController.currentProduct = loginScreenController.availableProducts.get(i);
                sc.switchtoProducts(e);
            }
        }
    }

    @FXML
    public void p1s_click(ActionEvent e) throws IOException {
        for(int i = 0; i <loginScreenController.availableProducts.size(); i++){
            if(loginScreenController.availableProducts.get(i).productID.equals("3")){
                loginScreenController.currentProduct = loginScreenController.availableProducts.get(i);
                sc.switchtoProducts(e);
            }
        }
    }

    @FXML
    public void p2s_click(ActionEvent e) throws IOException {
        for(int i = 0; i <loginScreenController.availableProducts.size(); i++){
            if(loginScreenController.availableProducts.get(i).productID.equals("0")){
                loginScreenController.currentProduct = loginScreenController.availableProducts.get(i);
                sc.switchtoProducts(e);
            }
        }
    }

    @FXML
    public void p3s_click(ActionEvent e) throws IOException {
        for(int i = 0; i <loginScreenController.availableProducts.size(); i++){
            if(loginScreenController.availableProducts.get(i).productID.equals("2")){
                loginScreenController.currentProduct = loginScreenController.availableProducts.get(i);
                sc.switchtoProducts(e);
            }
        }
    }

    @FXML
    public void p4s_click(ActionEvent e) throws IOException {
        for(int i = 0; i <loginScreenController.availableProducts.size(); i++){
            if(loginScreenController.availableProducts.get(i).productID.equals("1")){
                loginScreenController.currentProduct = loginScreenController.availableProducts.get(i);
                sc.switchtoProducts(e);
            }
        }
    }

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

    }
}
