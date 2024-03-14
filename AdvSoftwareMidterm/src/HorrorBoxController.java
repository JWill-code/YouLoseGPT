import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class HorrorBoxController {

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

	public int counter = 0;

	Image gameOver = new Image("Images/GameOVer.jpg");
	Image beginning = new Image("Images/HauntedMaze.jpg");
	Image forest1 = new Image("Images/CreepyForest1.jpg");
	Image forest2 = new Image("Images/CreepyForest2.jpg");
	Image forest3 = new Image("Images/CreepyForest3.jpg");
	Image forest4 = new Image("Images/CreepyForest4.jpg");
	Image forest5 = new Image("Images/CreepyForest5.jpg");



	@FXML
	void startGame(MouseEvent event) {
		while(counter == 0) {
			++counter;
			pathPhoto.setImage(beginning);
			narrator.setText("You Are lost, in a foreign area and must figure out a way to survive.\nWhat do you do? Go left? Right? Or Maybe just Cry!");
		}


	}

	@FXML
	void cryButton(MouseEvent event) {
		pathPhoto.setImage(gameOver);
		narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
	}

	@FXML
	void walkLeftButton(MouseEvent event) {

		if (counter == 1) {
			++counter;
			pathPhoto.setImage(forest1);
			narrator.setText("First");
		}
		else if (counter == 2) {
			++counter;
			pathPhoto.setImage(forest2);
			narrator.setText("Second");
		}
		else if (counter == 3) {
			++counter;
			pathPhoto.setImage(forest3);
			narrator.setText("Third");
		}
		else {
			pathPhoto.setImage(gameOver);
			narrator.setText("There are right decisions, and then there is what you did.\nEither way your journey is over!");
		}
	}

	@FXML
	void walkRightButton(MouseEvent event) {

	}

	@FXML
	void walkStraightButton(MouseEvent event) {

	}


}
