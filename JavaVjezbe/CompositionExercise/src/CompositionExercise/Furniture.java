package CompositionExercise;

public class Furniture {
	
	private String name;
	private String material;
	private int numberOfLegs;
	
	public Furniture(String name, String material, int numberOfLegs) {
		super();
		this.name = name;
		this.material = material;
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	public String getMaterial() {
		return material;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	
	
	
	
}
