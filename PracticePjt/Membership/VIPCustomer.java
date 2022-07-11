package Membership;

public class VIPCustomer extends Customer { //기능은 같은것이 많은
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() { //기본 정보
		
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	
}
