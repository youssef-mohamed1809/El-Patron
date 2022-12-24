package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuScreenController implements Initializable {

    SceneController sc = new SceneController();

    @FXML
    Label welcome_label;

    @FXML
    Label product1_name;

    @FXML
    ImageView product1_image;

    @FXML
    Label product2_name;

    @FXML
    ImageView product2_image;

    @FXML
    Label product3_name;

    @FXML
    ImageView product3_image;

    @FXML
    public void product1_click(){

    }
    @FXML
    public void product2_click(){

    }

    @FXML
    public void product3_click(){

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
        welcome_label.setText("Welcome, " + loginScreenController.currentUser.username);

        Image image = new Image(getClass().getResourceAsStream(loginScreenController.availableProducts.get(0).imageURL));
        product1_image.setImage(image);

        Image image2 = new Image(getClass().getResourceAsStream(loginScreenController.availableProducts.get(2).imageURL));
        product2_image.setImage(image2);

        Image image3 = new Image(getClass().getResourceAsStream(loginScreenController.availableProducts.get(5).imageURL));
        product3_image.setImage(image3);


    }


}
