package TestCases;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {
	

public void startAppiumServer(){	
	AppiumDriverLocalService service = AppiumDriverLocalService
			.buildService(new AppiumServiceBuilder()
					.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
					.withAppiumJS(new File("C:\\Users\\Yassir\\AppData\\Local\\Programs\\appium-desktop\\resources\\app\\node_modules\\appium\\build\\lib\\appium.js"))
					.withLogFile(new File("c:\\appiumlogs\\logs.txt")));
			service.start();

								}


}
