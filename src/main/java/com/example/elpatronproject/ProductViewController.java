package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ProductViewController implements Initializable {

    SceneController sc = new SceneController();
    @FXML
    ImageView img_url;

    @FXML
    Label prod_name;

    @FXML
    Label price_display;

    @FXML
    Label reviews_display;

    @FXML
    public void add_to_cart_click(){
        loginScreenController.currentUser.myCart.add(loginScreenController.currentProduct);
        Alert a = new Alert(Alert.AlertType.NONE);
        a.setAlertType(Alert.AlertType.CONFIRMATION);
        a.setContentText("Product added to cart");
        a.show();
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
    @FXML
    public void add_review(ActionEvent e) throws IOException{
        TextInputDialog td = new TextInputDialog();
        td.setTitle("Review Product");
        td.setHeaderText("Tell us your opinion");
        td.setContentText("Review: ");
        Optional<String> result = td.showAndWait();

        result.ifPresent(r -> {
            loginScreenController.currentProduct.reviews.add(r);
            try {
                Alert a = new Alert(Alert.AlertType.NONE);
                a.setAlertType(Alert.AlertType.CONFIRMATION);
                a.setContentText("Thanks for reviewing our product");
                a.show();
                sc.switchToMainMenu(e);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream(loginScreenController.currentProduct.imageURL));
        img_url.setImage(image);
        prod_name.setText(loginScreenController.currentProduct.name);
        price_display.setText(loginScreenController.currentProduct.price + " LE");

        String r = "";
        for(int i = 0; i < loginScreenController.currentProduct.reviews.size(); i++){
            r+="-";
            r+=loginScreenController.currentProduct.reviews.get(i);
            r+="\n";
        }

        reviews_display.setText(r);
    }
}
