package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.swing.*;


public class SleepPattern extends Application {

    public void start(Stage sleepPatternStage) {
        sleepPatternStage.setTitle("AmpStart");
        sleepPatternStage.setTitle("Sleep Pattern Tracker");
        sleepPatternStage.setWidth(800);
        sleepPatternStage.setHeight(700);

        // Create the registration form pane
        GridPane sleepPatternGridPane = createSleepingPatternGridPane();
        // Add UI controls to the registration form grid pane
        addUIControls(sleepPatternGridPane);
        // Create a scene with the registration form gridPane as the root node.
        Scene sleepPatternScene = new Scene(sleepPatternGridPane, 800, 500);

        // Set the scene in registrationStage
        sleepPatternStage.setScene(sleepPatternScene);

        sleepPatternStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


    private GridPane createSleepingPatternGridPane() {
        // Instantiate a new Grid Pane
        GridPane sleepPatternGridPane = new GridPane();
        // Position the pane at the center of the screen, both vertically and horizontally
        sleepPatternGridPane.setAlignment(Pos.CENTER);
        // Set a padding of 20px on each side
        sleepPatternGridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        sleepPatternGridPane.setHgap(10);
        // Set the vertical gap between rows
        sleepPatternGridPane.setVgap(10);
        // Add Column Constraints
        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        sleepPatternGridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return sleepPatternGridPane;
    }




    private void addUIControls(GridPane sleepPatternGridPane) {
        // Add Header
        Label headerLabel = new Label("Sleep Tracker");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        sleepPatternGridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));


        // Add Exercise Label
        Label sleepLabel = new Label("Hours slept : ");
        sleepLabel.setFont(Font.font("Arial", 14));
        sleepPatternGridPane.add(sleepLabel, 0,1);
        // Add walk Field
        ComboBox<String> combo = new ComboBox<String>();
        //Setting the prompt text of the combo box
        combo.setPromptText("Select hours");
        //Getting the observable list of the combo box
        ObservableList<String> list = combo.getItems();
        //Adding items to the combo box
        list.add("0-3 hours");
        list.add("3-6 hours");
        list.add("6-8 hours");
        list.add("8+ hours");
        sleepPatternGridPane.add(combo, 1,1);

        // Add Surname Label
        Label sleepDateLabel = new Label("Date : ");
        sleepDateLabel.setFont(Font.font("Arial", 14));
        sleepPatternGridPane.add(sleepDateLabel, 0,2);
        // Add Surname Field
        TextField snameField = new TextField();
        snameField.setPromptText("Enter Date");
        snameField.setMaxSize(300,30);
        snameField.setPrefHeight(30);
        sleepPatternGridPane.add(snameField, 1,2);


//////////////////////////////////////////////////////////////////////////////////////

        // Add Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        sleepPatternGridPane.add(submitButton, 0, 13, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

        // Add Next Button
        Button nextButton = new Button("Next");
        nextButton.setPrefHeight(25);
        nextButton.setDefaultButton(true);
        nextButton.setPrefWidth(100);
        sleepPatternGridPane.add(nextButton, 0, 14, 3, 1);
        GridPane.setHalignment(nextButton, HPos.RIGHT);
        GridPane.setMargin(nextButton, new Insets(20, 0,20,0));

        // Add Back Button
        Button backButton = new Button("Back");
        backButton.setPrefHeight(25);
        backButton.setDefaultButton(true);
        backButton.setPrefWidth(100);
        sleepPatternGridPane.add(backButton, 0, 14, 1, 1);
        GridPane.setHalignment(backButton, HPos.LEFT);
        GridPane.setMargin(backButton, new Insets(20, 0,20,0));





        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Add Forename Alert
                AbstractButton fnameField = null;
                if (fnameField.getText().isEmpty()) { showAlert(Alert.AlertType.ERROR, sleepPatternGridPane.getScene().getWindow(),
                        "Form Error!", "Please enter your forename"); }

                // Add Surname Alert
                if (snameField.getText().isEmpty()) { showAlert(Alert.AlertType.ERROR, sleepPatternGridPane.getScene().getWindow(),
                        "Form Error!", "Please enter your surname"); }
            }
        });
    }


    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }



}