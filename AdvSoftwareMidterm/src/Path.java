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

	Image forest1 = new Image("file:Images/CreepyForest1.jpg");
	Image forest2 = new Image("file:Images/CreepyForest2.jpg");
	Image forest3 = new Image("file:Images/CreepyForest3.jpg");
	Image forest4 = new Image("file:Images/CreepyForest4.jpg");
	Image forest5 = new Image("file:Images/CreepyForest5.jpg");
	Image gameOver = new Image("file:Images/GameOVer.jpg");
	Image forest6 = new Image("file:Images/HauntedForest6.jpg");
	Image maze1 = new Image("file:Images/HauntedMaze.jpg");
	Image maze2 = new Image("file:Images/HauntedMazeTwo.jpg");
	Image maze3 = new Image("file:Images/HauntedMazeThree.jpg");
	Image house1 = new Image("file:Images/SwampHouse.jpg");
	Image road1 = new Image("file:Images/CreepyRoad.jpg");
	//add images and make sure they upload
	
	
}
