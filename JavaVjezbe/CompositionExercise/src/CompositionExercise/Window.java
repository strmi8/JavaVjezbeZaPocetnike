package CompositionExercise;

public class Window {
	
	private String model;
	private String manufacturer;
	private Dimensions dimensions;
	
	
	public Window(String model, String manufacturer, Dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.dimensions = dimensions;
	} 
	
	public void openWindow() {
		System.out.println("Window is opened");
	}
	

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	
	
	
	
	

}
