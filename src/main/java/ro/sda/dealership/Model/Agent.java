package ro.sda.dealership.Model;

public class Agent {
    private Integer agentID;
    private String agentName;

    public Agent(Integer agentID, String agentName) {
        this.agentID = agentID;
        this.agentName = agentName;
    }

    public Integer getAgentID() {
        return agentID;
    }

    public void setAgentID(Integer agentID) {
        this.agentID = agentID;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }
}
