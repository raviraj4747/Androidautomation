package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Point;

import Apphooks.Applicationhooks;
import BaseClass.Baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.ConfigReader;
import Apphooks.Applicationhooks;
import org.testng.Assert;
import io.appium.java_client.TouchAction;

public class StepDefinitions extends Baseclass {


	@Then("veirfy permission is allow")
    public void veirfy_permission_is_allow() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
            Thread.sleep(5000);
            // Corrected XPath
            driver.findElement(By.xpath("//android.widget.Switch[@resource-id=\"android:id/switch_widget\"]")).click();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("veirfy permission is allow");
        } catch (InterruptedException e) {
            System.out.println("Interrupted while allowing permission");
        }
    }
	
	
	@Then("Verify NUX flow and Get started button")
	public void Verify_NUX_flow_and_Get_started_button() throws InterruptedException {
		try {
			Thread.sleep(4000);
			int startX = driver.manage().window().getSize().width * 4 / 5;
            int endX = driver.manage().window().getSize().width / 5;
            int centerY = driver.manage().window().getSize().height / 2;

            TouchAction<?> action = new TouchAction<>(driver);
            action.press(PointOption.point(startX, centerY))
                  .waitAction()
                  .moveTo(PointOption.point(endX, centerY))
                  .release()
                  .perform1();
            Thread.sleep(10000);
            

		} catch (Exception e) {
			System.out.println("Allow button is not present");
		}
	}

	
	@When("Click on Get Started button")
    public void Click_on_Get_Started_button() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Button is not clickable");
        } 
    }
	

	@When("user reset app")
	public void user_reset_app() throws InterruptedException {
		driver.resetApp();
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException {
		Thread.sleep(12000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name=\"Schedule\"]")));
		System.out.println("element located");
	}

	@When("user clicks on Sign_Up_Here button")
	public void user_clicks_on_Sign_Up_Here_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Sign Up Here']")).click();
	}

	@When("user fills Email Address Password Confirm Password Fields")
	public void user_fills_Email_Address_Password_Confirm_Password_Fields() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("a@a.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("Test@1234");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.FrameLayout//android.widget.EditText"))
				.sendKeys("Test@1234");
	}

	@When("user clicks on Signup button")
	public void user_clicks_on_Sign_Up__button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Sign Up']")).click();
	}

}
