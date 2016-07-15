package common;

import java.io.FileInputStream;
import java.util.Properties;

public class OutFitDataProperties {
	
	private String browser;
	private String link;
	
	
	public OutFitDataProperties() {
		getPropertyData();
	}
	
	
	public void getPropertyData() {
		Properties properties = new Properties();
		
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/outfitInformation.properties");
			properties.load(fis);
			
			browser = properties.getProperty("browser");
			link = properties.getProperty("link");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public String getBrowser() {
		return browser ;
	}
	
	
	public String getLink() {
		return link ;
	}
}
