package BaseClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass {

	public static AndroidDriver<?> driver;

	public static void getDriver() {
		try {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			// Device data to run locally
		    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			capabilities.setCapability(MobileCapabilityType.UDID, "SWIR8LNVQCBEIFJJ");
		//    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			// Run in iOS
			capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
			// capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);

			capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.asahi.group.responsibledrinking.drinkDiary");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
					"com.asahi.android.wearable.datalayer.MainActivity");

			URL url = new URL("http://0.0.0.0:4723/wd/hub");
		//	URL url = new URL("http://127.0.1.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean takeScreenshot(final String name) {
		String screenshotDirectory = System.getProperty("appium.screenshots.dir",
				System.getProperty("java.io.tmpdir", ""));
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	}

	// public boolean takeScreenshot(final String name)
	// {
	// String screenshotDirectory = System.getenv("WORKING_DIRECTORY");
	// File screenshot = ((TakesScreenshot)
	// driver).getScreenshotAs(OutputType.FILE);
	// return screenshot.renameTo(new File(screenshotDirectory,
	// String.format("%s.png", name)));
	// }

}
