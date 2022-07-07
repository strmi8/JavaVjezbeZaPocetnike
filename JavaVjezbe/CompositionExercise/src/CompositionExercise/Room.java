package CompositionExercise;

public class Room {
	

	private Furniture theFurniture;
	private TV theTV;
	private Window theWindow;
	
	
	public Room(Furniture theFurniture, TV theTV, Window theWindow) {
		super();
		this.theFurniture = theFurniture;
		this.theTV = theTV;
		this.theWindow = theWindow;
	}

	

	public Furniture getTheFurniture() {
		return theFurniture;
	}


	public TV getTheTV() {
		return theTV;
	}


	public Window getTheWindow() {
		return theWindow;
	}
	
	
	
	
	
	

}
