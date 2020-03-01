import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class GuiProgram extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {        // the GUI class
		
		//StackPane layOut = new StackPane();               // pane is the first 
		//Scene scene = new Scene(layOut,300,300);          // a scene is created to handle a pane
		
		GridPane singUpPane = new GridPane();
		
		
		singUpPane.setAlignment(Pos.CENTER);
		singUpPane.setHgap(5);
		singUpPane.setVgap(5);
		singUpPane.setGridLinesVisible(false);
		Scene scene = new Scene(singUpPane, 500, 500);
		
		
		Label fname = new Label("First name");
		singUpPane.add(fname, 0,0);                    // add the label object to the pane and give it location 
		TextField fnameT = new TextField();
		singUpPane.add(fnameT, 1, 0);

		Label lname = new Label("Last name");
		singUpPane.add(lname, 0,1);  
		TextField lnameT = new TextField();
		singUpPane.add(lnameT, 1,1);
		
		Label email = new Label("Email");
		singUpPane.add(email, 0,2);  
		TextField textEmail = new TextField();
		singUpPane.add(textEmail, 1,2); 
		
		
		Label passwprd = new Label("password");
		singUpPane.add(passwprd, 0,3);  
		PasswordField passwordT = new PasswordField();
		singUpPane.add(passwordT, 1,3);

		Button btnButton  = new Button("sing up");
		HBox hbBtnBox = new HBox(10);
		hbBtnBox.setAlignment(Pos.CENTER);
		hbBtnBox.getChildren().add(btnButton);
		singUpPane.add(hbBtnBox, 1, 5);
		                          
		
		
		
		//Button newButton = new Button ();                    // create a button object
		//newButton.setText ("Hello guys");                   // give it text
		//layOut.getChildren().add(newButton);                // display the button on a pane
		

		
		
		
		
		primaryStage.setScene(scene);                    // a stage (window) to desplay the scene
		primaryStage.show ();                           // start the stage
	}
	

	public static void main (String[] args) {
		
		
		launch(args);
		
	}
	
	
}
