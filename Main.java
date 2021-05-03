package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.nio.file.Paths;

public class Main extends Application {


    MediaPlayer mediaPlayer;
    public void  music(){
        String str="home.mp3";
        Media md=new Media(Paths.get(str).toUri().toString());
        mediaPlayer=new MediaPlayer(md);
        mediaPlayer.play();

    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        music();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("SIMPLE CALCULATOR");
        primaryStage.setScene(new Scene(root, 400, 435));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
