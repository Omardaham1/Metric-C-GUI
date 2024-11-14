import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MetricConverterGUI extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Metric Converter");

        TextField inputField = new TextField();
        ComboBox<String> unitComboBox = new ComboBox<>();
        Button convertButton = new Button("Convert");
        Label resultLabel = new Label();

        // Populate ComboBox with metric options
        unitComboBox.getItems().addAll("Meters to Kilometers", "Kilometers to Meters"); 

        convertButton.setOnAction(e -> {
            // Add conversion logic here and set resultLabel text
        });

        VBox layout = new VBox(10, inputField, unitComboBox, convertButton, resultLabel);
        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
