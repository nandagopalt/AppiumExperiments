import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	protected static AndroidDriver<AndroidElement> driver;
	protected static DesiredCapabilities capabilities; 
	
	protected static AndroidDriver<AndroidElement> getCapabilities() throws MalformedURLException {
		File applicationDirectory  = new File("src");
		File applicationFile = new File(applicationDirectory, "ApiDemos-debug.apk");
		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "DYKZIZ797HCQDUD6"); //DYKZIZ797HCQDUD6 //LENOVO Lenovo A7010a48
		capabilities.setCapability(MobileCapabilityType.APP,applicationFile.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		return driver;
	}
	
	

}
