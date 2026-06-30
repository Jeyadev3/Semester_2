package q2;

public class AdvancedMember extends ProgramMember implements Billable{
	int extraCareFree;
	
	AdvancedMember(int visitorId, String fullName, String programName, int sessionsAttended, double costPerSession, int extraCareFree) {
		super(visitorId, fullName, programName, sessionsAttended, costPerSession);
		this.extraCareFree=extraCareFree;
	}
	
	@Override
	void displayBasicInfo() {
		System.out.println("---ADV VISITOR INFO---");
		System.out.println("ID : "+visitorId);
		System.out.println("Name : "+fullName);
		System.out.println("Program : "+programName);
		System.out.println("Sessions attended : "+sessionsAttended);
		System.out.println("Cost per session : "+costPerSession);
		System.out.println("Care Fee : "+extraCareFree);
		
	}

	@Override
	public void generateBill() {
		System.out.print("ID : "+visitorId+" | ");
		System.out.println("Total Cost : "+extraCareFree+sessionsAttended*costPerSession);
		
	}

}
