/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.announcemnet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("MainAnnouncement.fxml"));
        Parent root = loader.load();
        MainAnnouncementController controller = loader.getController();

Scene scene = new Scene(root, 400, 300);

stage.setTitle("JavaFX Main Announcement");
stage.setScene(scene);

stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
