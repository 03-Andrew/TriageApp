package com.dsa.triageapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("triageForm-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            //scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("jetbrains://idea/navigate/reference?project=TriageApp&path=com/dsa/triageapp/CSS/Style.css")).toExternalForm());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
/*
//FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 540);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

 */

