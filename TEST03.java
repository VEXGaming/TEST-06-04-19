package application;
	
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Label lb1 = new Label("Enter your name, General :");
		Label k1 = new Label("");
		TextField tf = new TextField ();
		HBox hb = new HBox();
		hb.getChildren().addAll(lb1,tf,k1);
		hb.setSpacing(10);
		
		
		
		
		Button btn = new Button();
		btn.setText("ENTER");
		btn.setLayoutX(50);
		btn.setLayoutY(50);
		
		
		
		
		EventHandler<javafx.scene.input.MouseEvent> ehb = 
				new EventHandler<javafx.scene.input.MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						if(tf.getText().contentEquals("")) {
							k1.setText("Hello There! Hello? HELLO? Feck, wrong place");
						}
						else {
						k1.setText("Hello There! General "+tf.getText());
						}
					}
			
		};
		EventHandler<javafx.scene.input.MouseEvent> ehb2 = 
				new EventHandler<javafx.scene.input.MouseEvent>() {

					@Override
					public void handle(MouseEvent arg0) {
						
						
					}
			
		};
		
		btn.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, ehb);
		
		Group root = new Group(btn,hb);
		Scene scene =  new Scene
		(root,600,300);
		
		PerspectiveCamera  camera = new PerspectiveCamera();
		camera.setTranslateX(0);
		camera.setTranslateY(0);
		camera.setTranslateZ(0);
		
		scene.setCamera(camera);
		
		primaryStage.setScene(scene);;
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
