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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


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
        primaryStage.setWidth(550);
        primaryStage.setHeight(600);

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
        //creating image for calorie button
        Image cal_img = new Image(getClass().getResourceAsStream("calorie.png"));
       Button calories = new Button ("Calories");
       calories.setGraphic(new ImageView(cal_img));
       //designing the button
       calories.setStyle("-fx-font-size: 40");
       calories.setText("Enter Calories");
       calories.setStyle("-fx-background-color: #0000FF");
       //setting the size of the button
        calories.setPrefSize(50,50);
        //font of the text in the button
       calories.setFont(Font.font("Arial"));


       //adding the exercise button
        //creating image for exercise button
        Image exe_img = new Image(getClass().getResourceAsStream("exercise.png"));
       Button exercise = new Button ("Exercise");
       exercise.setGraphic(new ImageView(exe_img));
       exercise.setStyle("-fx-font-size: 40");
       exercise.setText("Choose type of Exercise");
       exercise.setStyle("-fx-background-color: #1F1FFF");
       exercise.setPrefSize(50,50);
      // exercise.setMaxSize(500,700);
       exercise.setFont(Font.font("Arial"));



       //adding the goals button
        //creating image for goals button
        Image goal_img = new Image(getClass().getResourceAsStream("goals.png"));
       Button goals = new Button("Goals");
       goals.setGraphic(new ImageView(goal_img));
       goals.setStyle("-fx-font-size: 40");
       goals.setStyle("-fx-background-color: #4949FF ");
       goals.setPrefSize(50,50);
       goals.setText("Check Goals");
       goals.setFont(Font.font("Arial"));

       //adding the friends button
        Image friend_img = new Image(getClass().getResourceAsStream("friend.png"));
       Button friends = new Button ("Friends");
       friends.setGraphic(new ImageView(friend_img));
       friends.setStyle("-fx-font-size: 40");
       friends.setStyle("-fx-background-color: #7879FF ");
       friends.setPrefSize(50,50);
       friends.setText("Friends");
       friends.setFont(Font.font("Arial"));


        Image log_img = new Image(getClass().getResourceAsStream("logout.png"));
       Button logout = new Button("Logout");
       logout.setGraphic(new ImageView(log_img));
       logout.setStyle("-fx-font-size: 40");
       logout.setStyle("-fx-background-color: #A3A3FF ");
       logout.setPrefSize(50,50);
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
