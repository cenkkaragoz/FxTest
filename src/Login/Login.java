package Login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;


/*
 * Created by cenk on 02.08.2016.
 *
 */

public class Login extends Application {

    @Override
    public void start(Stage primaryStage) {

        // GridPane oluşturuyoruz.
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Text sceneTitle = new Text ("TÜRKKEP ALTYAPI UYGULAMASINA HOŞGELDİNİZ.");
        sceneTitle.setId("welcome-text");
        // sceneTitle.setFont(Font.font("Arial", FontWeight.NORMAL,20));
        grid.add(sceneTitle,0,0,3,1);

        Label username = new Label("Kullanıcı İsmi:");
        grid.add(username,0,1);

        TextField unBox = new TextField();
        grid.add(unBox,1,1);

        Label pw = new Label("Şifre:");
        grid.add(pw,0,2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox,1,2);

        Button login = new Button("Giriş");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(login);
        grid.add(hbBtn,1,4);

        final Text actiontarget = new Text();
        actiontarget.setId("actiontarget");
        grid.add(actiontarget,1,6);

        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               // actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in Button Pressed");
            }
        });



        primaryStage.setTitle("Welcome to the JavaFX");
        Scene scene = new Scene(grid,600,400);
        primaryStage.setScene(scene);

        // File f = new File("src\\Login.css");
        //scene.getStylesheets().clear();
        //scene.getStylesheets().add(""+ f.getAbsolutePath().replace("/", "\\"));
        // scene.getStylesheets().add(""+f);
        // System.out.println(f);

        // Css From compiled jar.
        String cssFile = this.getClass().getResource("Login.css").toExternalForm();
        scene.getStylesheets().add(cssFile);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}

