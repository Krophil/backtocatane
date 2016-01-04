package src.model;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import src.view.AppCataneController;

/**
 * Created by csammiec on 04/01/16.
 */
public class MainApp extends Application{

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Back To Catane");

        try{
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e){
            //exeption si le fxml ne peut pas etre chargé
            e.printStackTrace();
        }

       showAppCatane();

    }


    /**
     *return the main stage
     */
    public Stage getPrimaryStage(){
        return primaryStage;
    }


    /**
     * show the appcatane scene
     */
    public void showAppCatane() {
        try {
            // charger lefichier xml et le placer au center du layout
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("view/AppCatane.fxml"));
            AnchorPane overviewPage = (AnchorPane) loader.load();
            rootLayout.setCenter(overviewPage);

            //donner l'accès au mainapp par le controller
            AppCataneController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        launch(args);
    }






}
