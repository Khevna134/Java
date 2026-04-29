import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class pr35 extends Application {
    public void start(Stage stage) {

        VBox p = createBar("Projects — 20%", 20, Color.RED);
        VBox q = createBar("Quizzes — 10%", 10, Color.BLUE);
        VBox m = createBar("Midterm Exams — 30%", 30, Color.GREEN);
        VBox f = createBar("Final Exam — 40%", 40, Color.ORANGE);

        HBox root = new HBox(20, p, q, m, f);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 500, 300);
        stage.setScene(scene);
        stage.setTitle("Grade Distribution");
        stage.show();
    }

    VBox createBar(String text, int percent, Color color) {
        Rectangle rect = new Rectangle(50, percent * 4);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(5, rect, label);
        box.setAlignment(Pos.BOTTOM_CENTER);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
