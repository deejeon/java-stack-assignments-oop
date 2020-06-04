import java.util.ArrayList;

public class Portfolio {
	// member variables
	private ArrayList<Project> projects;
	
	// constructors
	public Portfolio() {
		ArrayList<Project> emptyProjects = new ArrayList<Project>();
		this.setProjects(emptyProjects);
	}
	
	public Portfolio(ArrayList<Project> projects) {
		this.setProjects(projects);
	}
	
	// member methods
	public void addProject(Project project) {
		this.projects.add(project);
	}
	
	public double getPortfolioCost() {
		double total = 0;
		for (Project project : this.getProjects()) {
			total += project.getInitialCost();
		}
		return total;
	}
	
	public void showPortfolio() {
		for (Project project : this.getProjects()) {
			System.out.println(project.elevatorPitch());
		}
		System.out.println("Total Cost: " + this.getPortfolioCost());
	}
	
	// getters and setters
	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
}
