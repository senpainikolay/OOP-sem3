
package  com.gui.lab9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class Main extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Nicolae Gherman FAF-202 ");

        //Form input Dividend
        Label nr1 = new Label("Dividend:");
        TextField nr1Input = new TextField("");
        nr1Input.setPromptText("Dividend");

        // Form input Divisor
        Label nr2 = new Label("Divisor:");
        TextField nr2Input = new TextField("");
        nr2Input.setPromptText("Divisor");

        // Label Result:
        Label resultLabel = new Label("Result:");

        // The Button
        button = new Button("Caculate");



        // The Layout on the page:
        VBox layout =  new VBox(10);
        layout.setPadding(new Insets(60,20,20,20));

       // Once clicked:
        button.setOnAction ( e -> new ErrCheck().check(resultLabel, nr1Input, nr2Input) );

        // Places the  GUI's elements
        layout.getChildren().addAll(nr1, nr1Input,nr2, nr2Input,button,resultLabel);


        // Scene Loading
        Scene scene = new Scene(layout,400,350);
        window.setScene(scene);
        window.show();


    }

}