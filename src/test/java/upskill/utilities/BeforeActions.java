package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before																
	public void beforeActions(Scenario scen){							
		System.out.print("--->>>> Initializing Driver....");			
		SetupDrivers.setupDriver();										
		System.out.print("Test Scenario Name : " + scen.getName());
	}

}
