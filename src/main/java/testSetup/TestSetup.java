package testSetup;

import org.aeonbits.owner.ConfigFactory;

import io.restassured.RestAssured;
import util.ConfigProperties1;

public class TestSetup {

	public static ConfigProperties1 configProperties;

	public synchronized static void setUpFramework() {
		ConfigFactory.setProperty("environment", "dev");
		configProperties = ConfigFactory.create(ConfigProperties1.class);
		RestAssured.baseURI=configProperties.getBaseURI();
		RestAssured.basePath=configProperties.getBasePath();

	}

}
