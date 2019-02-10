package ro.sda.dealership.Presentation;

public class AgentMenu extends AbstractMenu{

    protected void displayOption() {
        System.out.println("1.View all agents");
        System.out.println("2.View agent details");
        System.out.println("3.Edit agent");
        System.out.println("4.Add new agent");
        System.out.println("5.Delete agent");
        System.out.println("0.Exit");
    }

    protected void executeComand(Integer option) {
        switch (option) {
            case 1:
                System.out.println("List of agents");
                break;
            case 2:
                System.out.println("Agent details are:");
                break;
            case 3:
                System.out.println("Edit agent");
                break;
            case 4:
                System.out.println("Add new agent here");
                break;
            case 5:
                System.out.println("Select agent to delete");
            case 0:
                System.out.println("Exiting to Main menu");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
