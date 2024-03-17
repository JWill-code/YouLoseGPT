import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


//This is a successful implementation of a controller class as seen in ch.8
public class HorrorBoxController {
	
	Start startOfGame = new Start(0);
	Path path = new Path(0);

	@FXML
	private Button leftPath; //choice one of storyline 12.3, 12.4

	@FXML
	private Button rightPath; //choice two 12.3, 12.4

	@FXML
	private Button straightPath; //choice three 12.3, 12.4

	@FXML
	private Button cry; //immediately give up, game over. 12.3, 12.4

	@FXML
	private TextArea userTxt; /*we will have the user enter something, but we will do tha 
	code for the semester final, working with chatgpt. 12.5*/

	@FXML
	private ImageView pathPhoto; //affected by user decision on button, picture path on presentation 13.3

	@FXML
	private Label narrator; //contains instructions/stuff for chatgpt which we will do later. from 12.4
	//also contains the description of the result of each button press.
	//event handling, stage set, user data, property binding for the pathPhoto image
	@FXML
	void startGame(MouseEvent event) { //13.3-13.5
		
		while(path.counter == 0) {
			narrator.setText(startOfGame.toString()); //number of story points involved. start, points 1-3 (at most), game over
			++path.counter;
			pathPhoto.setImage(startOfGame.beginning);
		}
	}

	@FXML
	void cryButton(MouseEvent event) { //13.3-13.5
		path.counter += 4;
		pathPhoto.setImage(path.gameOver);
		narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
	}

	@FXML
	void walkLeftButton(MouseEvent event) { //13.3-13.5 

		if (path.counter == 1) {
			++path.counter;
			pathPhoto.setImage(path.forest1); //left, right, and straight are all dependent on the
			//counter number
			narrator.setText("First");
		}
		else if (path.counter == 2) {
			++path.counter;
			pathPhoto.setImage(path.forest2);
			narrator.setText("Second");
		}
		else if (path.counter == 3) {
			++path.counter;
			pathPhoto.setImage(path.forest3);
			narrator.setText("Third");
		}
		else if(path.counter == 0){
			path.counter+=2;
			pathPhoto.setImage(path.forest1); 
			narrator.setText("First");
		}
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
		}
	}

	@FXML
	void walkRightButton(MouseEvent event) { //13.3-13.5
		if (path.counter == 1) {
			++path.counter;
			pathPhoto.setImage(path.forest4);//change to other picture
			narrator.setText("First");
		}
		else if (path.counter == 2) {
			++path.counter;
			pathPhoto.setImage(path.forest5);
			narrator.setText("Second");
		}
		else if (path.counter == 3) {
			++path.counter;
			pathPhoto.setImage(path.forest6);
			narrator.setText("Third");
		}
		else if(path.counter == 0){
			path.counter+=2;
			pathPhoto.setImage(path.forest4);//change to other picture
			narrator.setText("First");
		}
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
		}

	}

	@FXML //this one should use the haunted maze pictures 
	void walkStraightButton(MouseEvent event) { //13.3-13.5
		if (path.counter == 1) {
			++path.counter;
			pathPhoto.setImage(path.road1);
			narrator.setText("First");
		}
		else if (path.counter == 2) {
			++path.counter;
			pathPhoto.setImage(path.maze2);
			narrator.setText("Second");
		}
		else if (path.counter == 3) {
			++path.counter;
			pathPhoto.setImage(path.maze3);
			narrator.setText("Third");
		}
		else if(path.counter == 0){
			path.counter+=2;
			pathPhoto.setImage(path.road1);
			narrator.setText("First");
		}
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
		}

	}


}
