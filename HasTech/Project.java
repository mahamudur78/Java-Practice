
package HasTech;

public class Project {
    int Project_ClientID;
    int projectID; 
    String projectName, projectDescriotion;
    double budget;
    int assignEmpolyeeID;
    boolean projectStates;
    
    public Project(int projectID, int clientID, String projectName, String projectDescriotion, double budget, int assignEmpolyeeID, boolean projectStates){
        this.Project_ClientID = clientID;
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDescriotion = projectDescriotion;
        this.budget = budget;
        this.assignEmpolyeeID = assignEmpolyeeID;
        this.projectStates = projectStates;
        
        
    }
    
    public void getProjectInfo(){
        System.out.println("\n--------------------------");
        System.out.println("Client ID: " + Project_ClientID);
        System.out.println("Project ID: " + projectID);
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Descriotion: " + projectDescriotion);
        System.out.println("Project Budget: " + budget);
        System.out.println("Assign for Empolyee: " + assignEmpolyeeID);
        System.out.println("Project States " + projectStates);
        System.out.println("--------------------------\n");
    }
    
    
}
