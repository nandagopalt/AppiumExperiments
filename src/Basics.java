import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = getCapabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/**
		 * Syntax for defining the XPATH 
		 * tagname[@attribute = value]
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

	}

}
