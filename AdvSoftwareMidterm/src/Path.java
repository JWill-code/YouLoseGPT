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

	Image forest1 = new Image("Images/Jungle Tiger.png");
	Image forest2 = new Image("Images/CreepyForest2.png");
	Image forest3 = new Image("Images/CreepyForest3.png");
	Image forest4 = new Image("Images/ForestSnake.png");
	Image forest5 = new Image("Images/CreepyForest5.png");
	Image gameOver = new Image("Images/GameOVer.png");
	Image forest6 = new Image("Images/HauntedForest6.png");
	Image maze1 = new Image("Images/HauntedMaze.png");
	Image maze2 = new Image("Images/HauntedMazeTwo.png");
	Image maze3 = new Image("Images/HauntedMazeThree.png");
	Image house1 = new Image("Images/SwampHouse.png");
	Image road1 = new Image("Images/CreepyRoad.png");
	Image beginning = new Image("Images/HauntedMaze.png");
	Image monkey1 = new Image("Images/DesrtMonkey.png");
	//add images and make sure they upload
	
	
}
