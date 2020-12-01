import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application
{
    @Override
    public void start(Stage stage)
    {

        TilePane pane = new TilePane();
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane);

        stage.setMinHeight(600);
        stage.setMinWidth(600);
        stage.setScene(scene);
        stage.setTitle("Java FX Animation");

        FlowPane a = new FlowPane();
        a.setPrefHeight(250);
        a.setPrefWidth(250);
        a.setPadding(new Insets(60, 60, 60, 60));
        a.setHgap(30);

        FlowPane b = new FlowPane();
        b.setPrefHeight(200);
        b.setPrefWidth(200);
        b.setPadding(new Insets(60, 60, 60, 60));
        b.setHgap(30);

        FlowPane c = new FlowPane();
        c.setPrefHeight(200);
        c.setPrefWidth(200);
        c.setPadding(new Insets(60, 60, 60, 60));
        c.setHgap(30);

        FlowPane d = new FlowPane();
        d.setPrefHeight(200);
        d.setPrefWidth(200);
        d.setPadding(new Insets(60, 60, 60, 60));
        d.setHgap(30);

        // creating shapes and giving colors
        Sphere sphere = new Sphere(40);
        Cylinder cylinder = new Cylinder(30, 75);
        Box box = new Box(75, 75, 75);
        Polygon polygon = new Polygon();

        PhongMaterial sColor = new PhongMaterial();
        sColor.setSpecularColor(Color.PINK);
        sColor.setDiffuseColor(Color.PINK);
        sphere.setMaterial(sColor);

        PhongMaterial cColor = new PhongMaterial();
        cColor.setDiffuseColor(Color.BLUE);
        cylinder.setMaterial(cColor);

        PhongMaterial bColor = new PhongMaterial();
        bColor.setDiffuseColor(Color.POWDERBLUE);
        box.setMaterial(bColor);

        polygon.getPoints().addAll(new Double[]
                {
                        100.0, 50.0,
                        75.0, 125.0,
                        150.0, 50.0
                });
        polygon.setFill(Color.BROWN);

        // creating transition choices
        ChoiceBox<String> transitions1 = new ChoiceBox<>();
        transitions1.getItems().addAll("Rotate","Scale", "Sequential");

        ChoiceBox<String> transitions2 = new ChoiceBox<>();
        transitions2.getItems().addAll("Rotate","Scale", "Sequential");

        ChoiceBox<String> transitions3 = new ChoiceBox<>();
        transitions3.getItems().addAll("Rotate","Scale", "Sequential");

        ChoiceBox<String> transitions4 = new ChoiceBox<>();
        transitions4.getItems().addAll("Fade", "Rotate","Scale", "Sequential");

        // add shapes and transition choices to their respective grid
        a.getChildren().addAll(sphere, transitions1);
        b.getChildren().addAll(cylinder, transitions2);
        c.getChildren().addAll(box, transitions3);
        d.getChildren().addAll(polygon, transitions4);

        // handles the transition being chosen
        EventHandler<ActionEvent> transitionSelect = new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event)
            {
                // for sphere
                if (event.getSource() == transitions1)
                {
                    RotateTransition rotate = new RotateTransition(Duration.millis(2000), sphere);
                    rotate.setByAngle(180);
                    rotate.setCycleCount(1);
                    ScaleTransition scale = new ScaleTransition(Duration.millis(2000), sphere);
                    scale.setByX(.2f);
                    scale.setByY(.2f);
                    if (transitions1.getValue() == "Rotate")
                        rotate.play();
                    else if (transitions1.getValue() == "Scale")
                        scale.play();
                    else
                    {
                        SequentialTransition sequential = new SequentialTransition(sphere, rotate, scale);
                        sequential.play();
                    }
                }
                // for cylinder
                else if (event.getSource() == transitions2)
                {
                    RotateTransition rotate = new RotateTransition(Duration.millis(2000), cylinder);
                    rotate.setByAngle(180);
                    rotate.setCycleCount(1);
                    ScaleTransition scale = new ScaleTransition(Duration.millis(2000), cylinder);
                    scale.setByX(.2f);
                    scale.setByY(.2f);
                    if (transitions2.getValue() == "Rotate")
                        rotate.play();
                    else if (transitions2.getValue() == "Scale")
                        scale.play();
                    else
                    {
                        SequentialTransition sequential = new SequentialTransition(cylinder, rotate, scale);
                        sequential.play();
                    }
                }
                // for box
                else if (event.getSource() == transitions3)
                {
                    RotateTransition rotate = new RotateTransition(Duration.millis(2000), box);
                    rotate.setByAngle(180);
                    rotate.setCycleCount(1);
                    ScaleTransition scale = new ScaleTransition(Duration.millis(2000), box);
                    scale.setByX(.2f);
                    scale.setByY(.2f);
                    if (transitions3.getValue() == "Rotate")
                        rotate.play();
                    else if (transitions3.getValue() == "Scale")
                        scale.play();
                    else
                    {
                        SequentialTransition sequential = new SequentialTransition(box, rotate, scale);
                        sequential.play();
                    }
                }
                // for polygon
                else if (event.getSource() == transitions4)
                {
                    FadeTransition fade = new FadeTransition(Duration.millis(2000), polygon);
                    fade.setFromValue(1.0);
                    fade.setToValue(0.5);
                    RotateTransition rotate = new RotateTransition(Duration.millis(2000), polygon);
                    rotate.setByAngle(180);
                    rotate.setCycleCount(1);
                    ScaleTransition scale = new ScaleTransition(Duration.millis(2000), polygon);
                    scale.setByX(.2f);
                    scale.setByY(.2f);
                    if (transitions4.getValue() == "Rotate")
                        rotate.play();
                    else if (transitions4.getValue() == "Scale")
                        scale.play();
                    else if (transitions4.getValue() == "Fade")
                        fade.play();
                    else
                    {
                        SequentialTransition sequential = new SequentialTransition(polygon, fade, rotate, scale);
                        sequential.play();
                    }
                }

            }

        };

        // performs transitions
        transitions1.setOnAction(transitionSelect);
        transitions2.setOnAction(transitionSelect);
        transitions3.setOnAction(transitionSelect);
        transitions4.setOnAction(transitionSelect);

        // final touches to pane
        pane.setPrefColumns(2);
        pane.setVgap(1);
        pane.setHgap(1);
        a.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        b.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        c.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        d.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        // adding grids
        pane.getChildren().addAll(a, b, c, d);

        // displays output
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}