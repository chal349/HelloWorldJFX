package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import helper.JDBC;


public class Main extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
        primaryStage.setTitle("SCHEDULER");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
        Main.primaryStage = primaryStage;
    }

    public static Stage getPrimaryStage(){
        return Main.primaryStage;
    }

    public static void main(String[] args) {
        JDBC.makeConnection();
        launch(args);
        JDBC.closeConnection();
    }
}
