package TestCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ScrollingTest {
public static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

//		AppiumServer as = new AppiumServer();
//		as.startAppiumServer();
		// File app = new File(System.getProperty("user.dir")+ "//apk//selendroid-test-app-0.17.0.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Android");
		//caps.setCapability("app", app.getAbsolutePath());
		caps.setCapability("appPackage", "com.mobeta.android.demodslv");
		caps.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		driver.findElements(By.id("com.mobeta.android.demodslv:id/activity_desc")).get(0).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.mobeta.android.demodslv:id/drag_handle")));

		String text = "McCoy";
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).scrollIntoView(new UiSelector().textContains(\""+text+"\"))").click();
		
		
		
		Thread.sleep(10000); 
		driver.quit();
		
		
		
	}

}