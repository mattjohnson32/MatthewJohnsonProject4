package bsu.comp152;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox box = new VBox();
        box.setAlignment(Pos.BOTTOM_CENTER);
        var text = new TextField("");
        var font = Font.font(20);
        text.setFont(font);
        box.getChildren().add(text);
        Rectangle rect = new Rectangle(400,200);
        var firstColor = Paint.valueOf("Red");
        rect.setFill(firstColor);
        box.getChildren().add(rect);
        Button pushButton = new Button("Change Color");

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                var test = text.getText();
                rect.setFill(Paint.valueOf(test));
            }
        };

        pushButton.setOnAction(handler);
        pushButton.setFont(font);
        var secondColor = Paint.valueOf("Blue");
        pushButton.setTextFill(secondColor);
        box.getChildren().add(pushButton);
        var windowCreate = new Scene(box);
        primaryStage.setScene(windowCreate);
        primaryStage.setTitle("Window");
        primaryStage.setMinWidth(300);
        primaryStage.show();



    }
}
