import javafx.scene.image.Image;

public class Path {
	//This Counter will keep track of how far along the player is in the story
	int counter = 0;

	//This will be the area for generating content for their journey
	public String toString() {
		return " "; 
	}

	// This is the constructor where the counter is stored.
	Path(int count) {
		this.counter = count;
	}

	Image forest1 = new Image("Images/CreepyForest1.jpg");
	Image forest2 = new Image("Images/CreepyForest2.jpg");
	Image forest3 = new Image("Images/CreepyForest3.jpg");
	Image forest4 = new Image("Images/CreepyForest4.jpg");
	Image forest5 = new Image("Images/CreepyForest5.jpg");
	Image gameOver = new Image("Images/GameOVer.jpg");
	
	
}
