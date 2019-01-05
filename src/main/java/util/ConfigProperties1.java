package util;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "file:src\\test\\resources\\propertyFile\\${environment}.properties" })

public interface ConfigProperties1 extends Config {

	@Key("secretKey")
	String getSecretKey();

	@Key("baseURI")
	String getBaseURI();

	@Key("basePath")
	String getBasePath();

}
