package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMainMenu(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("customer-main-menu.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoProducts(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("product-view.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Product");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMyCart(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("my-cart.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("My Cart");
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoMaleProducts(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("male-products.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Male Products");
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoFemaleProducts(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("female-products.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Female Products");
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoTrackOrder(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("track-order.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Track My Order");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCheckout(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("checkout-view.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Checkout");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToHelp(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("help-view.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAboutUs(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("about-us-view.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("About Us");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToLogin(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("login-screen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCreateAccount(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("create-account-view.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToManagerAccount(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("manager-view.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Customer Issues");
        stage.setScene(scene);
        stage.show();
    }

}
