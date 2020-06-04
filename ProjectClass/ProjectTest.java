
public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project np1 = new Project("New Project 1");
		System.out.println(np1.elevatorPitch());
		np1.setDescription("Edited description for New Project 1");
		np1.setInitialCost(5.99);
		System.out.println(np1.elevatorPitch());
		
		Project np2 = new Project("New Project 2", "Some description", 10.99);
		Project np3 = new Project("New Project 3", "Some other description", 15.99);
		
		Portfolio newPortfolio = new Portfolio();
		newPortfolio.addProject(np1);
		newPortfolio.addProject(np2);
		newPortfolio.addProject(np3);
		
		System.out.println(newPortfolio.getPortfolioCost());
		newPortfolio.showPortfolio();	
	}
}
