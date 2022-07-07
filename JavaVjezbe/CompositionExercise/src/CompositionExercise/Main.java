package CompositionExercise;

public class Main {

	public static void main(String[] args) {
		
		Dimensions dimensions = new Dimensions(20,25,1);
		Furniture furniture = new Furniture("Sofa", "Leather", 4);
		TV flatscreen = new TV("Big Screen","Samsung",27, new Resolution(1920,1080));
		Window theWindow = new Window("Openable","Salamander",dimensions);
		
		Room livingRoom = new Room(furniture,flatscreen,theWindow);
		livingRoom.getTheTV().drawPixelAt(920,500,"red");
		System.out.println(livingRoom.getTheFurniture().getMaterial());

	}

}
