//This exemplifies the Super class sub class relationship in ch.9 section 9.4
public class Start extends Path {

	// Where the count for the path will be stored
	public Start(int count) {
		super(count);
	}

	
	//Story for beginning journey
	@Override
	public String toString() {
		return "You Are lost, in a foreign area and must figure out a way to survive. \nWhat do you do? Go left? Right? Or Maybe just Cry! ";
	}


}
