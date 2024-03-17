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
	private Button leftPath;

	@FXML
	private Button rightPath;

	@FXML
	private Button straightPath;

	@FXML
	private Button cry;

	@FXML
	private TextArea userTxt;

	@FXML
	private ImageView pathPhoto;

	@FXML
	private Label narrator;

	@FXML
	void startGame(MouseEvent event) {
		
		while(path.counter == 0) {
			narrator.setText(startOfGame.toString());
			++path.counter;
			pathPhoto.setImage(startOfGame.beginning);
		}
	}

	@FXML
	void cryButton(MouseEvent event) {
		path.counter += 4;
		pathPhoto.setImage(path.gameOver);
		narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
	}

	@FXML
	void walkLeftButton(MouseEvent event) {

		if (path.counter == 1) {
			++path.counter;
			pathPhoto.setImage(path.forest1);
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
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
		}
	}

	@FXML
	void walkRightButton(MouseEvent event) {
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
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
		}

	}

	@FXML //this one should use the haunted maze pictures but HauntedMaze.jpg doesn't work
	void walkStraightButton(MouseEvent event) {
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
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
		}

	}


}
