import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


//This is a successful implementation of a controller class as seen in ch.8
public class HorrorBoxController {
	
	Path startOfGame = new Start(0);
	Path path = new Path(0);
	Path endOfGame = new End(0);
	//I'm going to use a collection/map for the images and storyline branching.
	//I will do a better job than the one I put in the presentation.
	

	@FXML
	private Button leftPath; //choice one of storyline 12.3, 12.4

	@FXML
	private Button rightPath; //choice two 12.3, 12.4

	@FXML
	private Button straightPath; //choice three 12.3, 12.4

	@FXML
	private Button cry; //immediately give up, game over. 12.3, 12.4
	 
	@FXML
	private Button chatGPTButton; //button that says continue

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
		userTxt.setDisable(true);
		path.counter += 4;
		pathPhoto.setImage(path.gameOver);
		narrator.setText(endOfGame.toString());
	}

	@FXML
	void walkLeftButton(MouseEvent event) { //13.3-13.5 
		userTxt.setDisable(true);
		if (path.counter == 1) {
			++path.counter;
			pathPhoto.setImage(path.forest1); //left, right, and straight are all dependent on the
			//counter number
			narrator.setText("You find yourself in a forest, \nyou aren't sure if there are wild animals or something worse \nlurking in the shadows ");
		}
		else if (path.counter == 2) {
			++path.counter;
			pathPhoto.setImage(path.forest2);
			narrator.setText("You now find yourself deep in the center of a forest.\nIn the corner of your eye you think you see the figure of a \npanther, but you arent sure.");
		}
		else if (path.counter == 3) {
			++path.counter;
			pathPhoto.setImage(path.forest3);
			narrator.setText("You think you see a woman if you squint in the mist, but you aren't sure.\n Are you hallucinating! Maybe but what if they can help you!");
		}
		else if(path.counter == 0){
			path.counter+=2;
			pathPhoto.setImage(path.forest1); 
			narrator.setText("You find yourself in a forest, \nyou aren't sure if there are wild animals or something worse \nlurking in the shadows ");
		}
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText(endOfGame.toString());
		}
	}

	@FXML
	void walkRightButton(MouseEvent event) { //13.3-13.5
		userTxt.setDisable(true);
		if (path.counter == 1) {
			++path.counter;
			pathPhoto.setImage(path.forest4);//change to other picture
			narrator.setText("You wander right, and find you self in a tight forested area.\n It's incredibly quiet, but something tells you that you shouldnt make noise here.");
		}
		else if (path.counter == 2) {
			++path.counter;
			pathPhoto.setImage(path.forest5);
			narrator.setText("You see a mess of broken stones, in what looks like a man made \nclearing. Do you investigate further?");
		}
		else if (path.counter == 3) {
			++path.counter;
			pathPhoto.setImage(path.forest6);
			narrator.setText("The trees around you begin to whisper.\n You hear their voices. \n They tell you to come closer");
		}
		else if(path.counter == 0){
			path.counter+=2;
			pathPhoto.setImage(path.forest4);//change to other picture
			narrator.setText("You wander right, and find you self in a tight forested area.\n It's incredibly quiet, but something tells you that you shouldnt \nmake noise here.");
		}
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText(endOfGame.toString());
		}
	}

	@FXML //this one should use the haunted maze pictures 
	void walkStraightButton(MouseEvent event) { //13.3-13.5
		userTxt.setDisable(true); //disable user text field
		if (path.counter == 1) {
			++path.counter;
			pathPhoto.setImage(path.road1);
			narrator.setText("You wonder onto a road and stumble \nand hear a loud noise in further left what do you do?");
		}
		else if (path.counter == 2) {
			++path.counter;
			pathPhoto.setImage(path.maze2);
			narrator.setText("You wonder further and encounter a cornfield, do you enter the cornfield \n or do you continue go a different dircection");
		}
		else if (path.counter == 3) {
			++path.counter;
			pathPhoto.setImage(path.maze3);
			narrator.setText("You feel as if your being watched and are now deep in a cornfield.\nNow you are hoplessly lost, you arent sure if your going to make it!");
		}
		else if(path.counter == 0){
			path.counter+=2;
			pathPhoto.setImage(path.road1);
			narrator.setText("You wonder onto a road and stumble \nand hear a loud noise in further left what do you do?");
		}
		else {
			pathPhoto.setImage(path.gameOver);
			narrator.setText(endOfGame.toString());
		}
		
	}
	@FXML
	void selectUserTxt(MouseEvent event) { 
		//disables buttons because the chatgpt user narration is selected.
		//leftPath, rightPath, straightPath, cry
		//leave message in label???
		//this code is on the userTxt select, not the button that says continue
		leftPath.setDisable(true);
		rightPath.setDisable(true);
		straightPath.setDisable(true);
		cry.setDisable(true);
		}

}
