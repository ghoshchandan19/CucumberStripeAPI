package stepDefinitions;

import java.io.File;

import com.cucumber.listener.Reporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import testSetup.TestSetup;

public class Hooks {
	
	@Before
	public void beforeScenario()
	{
		System.out.println("Executed Before Scenario");
		TestSetup.setUpFramework();
	}
	
	
	@After
	public void afterScenario()
	{
		System.out.println("Executed After Scenario");
		
	}

}
