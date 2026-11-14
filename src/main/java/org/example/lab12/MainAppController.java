package org.example.lab12;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.util.List;

public class MainAppController {

    @FXML
    private VBox leftVBox;

    @FXML
    private GridPane centerGridPane;

    @FXML
    private TextField driverNumberField;

    @FXML
    private Button fetchButton;

    @FXML
    private Label broadcastNameValue;

    @FXML
    private Label countryCodeValue;

    @FXML
    private Label driverNumberValue;

    @FXML
    private Label firstNameValue;

    @FXML
    private Label fullNameValue;

    @FXML
    private Label lastNameValue;

    @FXML
    private Label nameAcronymValue;

    @FXML
    private Label teamColourValue;

    @FXML
    private Label teamNameValue;

    @FXML
    private ImageView headshotImageView;

    @FXML
    private ImageView logoImageView;

    @FXML
    private void initialize() {
        leftVBox.setPadding(new Insets(10));
        centerGridPane.setPadding(new Insets(10));

        fetchButton.setOnAction(event -> fetchDriverData());

        // Load and display the logo image
        Image logoImage = new Image(getClass().getResourceAsStream("/org/example/lab12/f1_logo.png"));
        logoImageView.setImage(logoImage);
    }

    private void fetchDriverData() {
        try {
            int driverNumber = Integer.parseInt(driverNumberField.getText());
            List<User> users = ApiClient.fetchData(driverNumber);
            if (users != null && !users.isEmpty()) {
                User user = users.get(0);
                broadcastNameValue.setText(user.getBroadcastName());
                countryCodeValue.setText(user.getCountryCode());
                driverNumberValue.setText(String.valueOf(user.getDriverNumber()));
                firstNameValue.setText(user.getFirstName());
                fullNameValue.setText(user.getFullName());
                lastNameValue.setText(user.getLastName());
                nameAcronymValue.setText(user.getNameAcronym());
                teamColourValue.setText(user.getTeamColour());
                teamNameValue.setText(user.getTeamName());

                // Load and display headshot image
                Image headshotImage = new Image(user.getHeadshotUrl(), true);
                headshotImageView.setImage(headshotImage);
            } else {
                showAlert("No Data", "No data found for driver number: " + driverNumber);
                resetToDefaultImage();
            }
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Invalid driver number format.");
            resetToDefaultImage();
        }
    }

    private void resetToDefaultImage() {
        Image defaultImage = new Image(getClass().getResourceAsStream("/org/example/lab12/f1_logo.png"));
        headshotImageView.setImage(defaultImage);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

