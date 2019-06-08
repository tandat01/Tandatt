package jv2_secssion_lab_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashSet;

public class Main extends Application {

    public static HashSet<String> studentList=new HashSet<>();

    public static  Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("add.fxml"));
        primaryStage.setTitle("Them Sinh Vien");
        primaryStage.setScene(new Scene(root ,600,400));
        primaryStage.show();
    }
}