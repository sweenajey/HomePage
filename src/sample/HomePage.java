package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;


import org.w3c.dom.events.Event;

import java.awt.*;


public class HomePage extends Application implements EventHandler <ActionEvent>{
    Button goals;
    Button calories;
    Button exercise;
    Button logout;
    Button friends;

    public static void main (String[] args){
        Application.launch(args);
    }







    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("AmpStart - HomePage");
        primaryStage.setWidth(400);
        primaryStage.setHeight(500);

        Text title = new Text();

        //deciding the font of the text for the title
        title.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20 ));

        //where to position the title
        title.setX(50);
        title.setY(150);

        title.setText("Welcome to AmpStart HomePage");




        BorderPane but_border = new BorderPane();
        but_border.setPadding(new Insets(21,1,21,21));



       //adding the calorie button
       Button calories = new Button ("Calories");
       calories.setStyle("-fx-font-size: 40");
       calories.setText("Enter Calories");
       calories.setStyle("-fx-background-color: #0000FF");
       calories.setMaxSize(500,700);
       calories.setFont(Font.font("Arial"));



       //adding the exercise button
       Button exercise = new Button ("Exercise");
       exercise.setStyle("-fx-font-size: 40");
       exercise.setText("Choose type of Exercise");
       exercise.setStyle("-fx-background-color: #1F1FFF");
       exercise.setMaxSize(500,700);
       exercise.setFont(Font.font("Arial"));



       //adding the goals button
       Button goals = new Button("Goals");
       goals.setStyle("-fx-font-size: 40");
       goals.setStyle("-fx-background-color: #4949FF ");
       goals.setText("Check Goals");
       goals.setFont(Font.font("Arial"));

       //adding the sleeping button
       Button friends = new Button ("Friends");
       friends.setStyle("-fx-font-size: 200");
       friends.setStyle("-fx-background-color: #7879FF ");
       friends.setText("Track Sleep");
       friends.setFont(Font.font("Arial"));



       Button logout = new Button("Logout");
       logout.setStyle("-fx-font-size: 40");
       logout.setStyle("-fx-background-color: #A3A3FF ");
       logout.setText("Logout");
       logout.setFont(Font.font("Arial"));


       //what the logout button could have been like
        //MenuItem yes = new MenuItem("Yes");
       // MenuItem no = new MenuItem("No");

       // MenuButton optbutton = new MenuButton("Are you sure you want to logout", null,yes, no);


       calories.setMaxWidth(Double.MAX_VALUE);
       exercise.setMaxWidth(Double.MAX_VALUE);
       goals.setMaxWidth(Double.MAX_VALUE);
       friends.setMaxWidth(Double.MAX_VALUE);
       logout.setMaxWidth(Double.MAX_VALUE);

       VBox button_layout = new VBox();
       //button_layout.setPrefWidth(200);
       button_layout.setSpacing(15);
       button_layout.setPadding(new Insets(0, 20, 0, 20));
       button_layout.getChildren().addAll(calories, exercise,goals,logout, friends);















       Scene buttons = new Scene(button_layout);

       primaryStage.setScene(buttons);

       //primaryStage.setScene();
       primaryStage.show();














    }

    @Override
    public void handle(ActionEvent button_event) {
     if (button_event.getSource() == calories){
         //link to calories page

     }
     if (button_event.getSource()==goals) {
         //link to goals page
     }
     if (button_event.getSource()==exercise) {
         //link to exercise page
     }

     if(button_event.getSource() == friends){

     }

     if(button_event.getSource()==logout){
         //link to registration page


     }





    }
}
