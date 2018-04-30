package TestCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Test1 {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

//		AppiumServer as = new AppiumServer();
//		as.startAppiumServer();
		File app = new File(System.getProperty("user.dir")+ "//apk//selendroid-test-app-0.17.0.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Android");
		caps.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		Thread.sleep(10000);
		driver.quit();
		
		
		
	}

}
