
public class Project {
	// member variables
	private String name = "";
	private String description = "";
	private double initialCost = 0;
	
	// constructors
	public Project() {}
	
	public Project(String name) {
		this.setName(name);
	}
	
	public Project(String name, String description) {
		this.setName(name);
		this.setDescription(description);
	}
	
	public Project(String name, String description, double initialCost) {
		this.setName(name);
		this.setDescription(description);
		this.setInitialCost(initialCost);
	}
	
	// member methods
	public String elevatorPitch() {
		String output = this.name.concat(" (" + this.getInitialCost() + ")").concat(": ").concat(this.description);
		return output;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	
}
