package com.example.elpatronproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class loginScreenController implements Initializable {

    SceneController sc = new SceneController();

    private Stage stage;
    private Scene scene;
    private Parent root;

    public static ArrayList<Customer> users = new ArrayList<Customer>();

    public static ArrayList<Manager> managers = new ArrayList<Manager>();

    public static ArrayList<Product> availableProducts = new ArrayList<Product>();
    public static Customer currentUser;
    public static Manager currentManager;
    public static Product currentProduct;

    public static ArrayList<Issue> issues = new ArrayList<Issue>();

    @FXML
    TextField username;

    @FXML
    PasswordField password;

    @FXML
    private void login(ActionEvent e) throws IOException {
        String myUsername = username.getText();
        String myPassword = password.getText();

        boolean found = false;
        boolean isCustomer = true;

        for(int i = 0; i < users.size(); i++){
            if(myUsername.equals(users.get(i).username)){
                if(myPassword.equals((users.get(i)).password)){
                    currentUser = users.get(i);
                    found = true;
                    break;
                }
            }
        }

        if(!found){
            isCustomer = false;

            for(int i = 0; i < managers.size(); i++){
                if(myUsername.equals(managers.get(i).username)){
                    if(myPassword.equals((managers.get(i)).password)){
                        currentManager = managers.get(i);
                        found = true;
                        break;
                    }
                }
            }
        }

        if(found){
            SceneController sceneController = new SceneController();

            if(isCustomer){
                sceneController.switchToMainMenu(e);
            }else{
                sceneController.switchToManagerAccount(e);
            }

        }else{
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Invalid username or password");
            a.show();
        }

    }

    @FXML
    private void signUp(ActionEvent e) throws IOException{
        sc.switchToCreateAccount(e);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        users.add(new Customer("Ahmed", "1234"));
        managers.add(new Manager("Mohamed", "1234"));

        issues.add(new Issue("Mahmoud", "mahmoud@mail.com", "Received wrong sizes of hoodies"));
        issues.add(new Issue("Mohamed", "mohamed@mail.com", "Received wrong colour of tshirts"));
        issues.add(new Issue("Sarah", "sarah@mail.com", "I didn't receive my hoodies yet"));

        Product p1 = new Product("White T-shirt",50, "Images/white_tshirt_1.png", "0");
        Product p2 = new Product("Black T-shirt",12, "Images/black_tshirt_1.png", "1");
        Product p3 = new Product("White T-shirt",12, "Images/white_tshirt_2.png", "2");
        Product p4 = new Product("White T-shirt",12, "Images/black_tshirt_2.png", "3");
        Product p5 = new Product("Plain White Hoodie",50, "Images/plain_hoodie_1.png", "4");
        Product p6 = new Product("White Hoodie",12, "Images/white_hoodie.png", "5");
        Product p7 = new Product("Black Hoodie",12, "Images/black_hoodie.png", "6");
        Product p8 = new Product("Black Hoodie",12, "Images/black_hoodie_2.png", "7");

        availableProducts.add(p1);
        availableProducts.add(p2);
        availableProducts.add(p3);
        availableProducts.add(p4);
        availableProducts.add(p5);
        availableProducts.add(p6);
        availableProducts.add(p7);
        availableProducts.add(p8);



    }
}
