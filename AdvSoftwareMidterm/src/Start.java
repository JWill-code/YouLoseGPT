import javafx.scene.image.Image;

public class Start extends Path {

	// Where the count for the path will be stored
	public Start(int count) {
		super(count);
	}

	Image beginning = new Image("Images/HauntedMaze.jpg");
	
	//Story for beginning journey
	@Override
	public String toString() {
		return "You Are lost, in a foreign area and must figure out a way to survive What do you do? Go left? Right? Or Maybe just Cry! ";
	}


}
