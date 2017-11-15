package utility;

import io.appium.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.*;
import java.net.URL;

public abstract class AppiumDriverBuilder<SELF, DRIVER extends AppiumDriver> {

	public static class IOSDriverBuilder extends AppiumDriverBuilder<IOSDriverBuilder, IOSDriver> {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		public IOSDriver build() {

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("app", "/Users/elderhuffman/Documents/GospelLiving.app");
			capabilities.setCapability("deviceName", "iPhone 8 Plus");
			capabilities.setCapability("automationName", "XCUItest");

			return new IOSDriver(capabilities);

		}

	}

	public abstract DRIVER build();

	public static IOSDriverBuilder forIOS() {
		return new IOSDriverBuilder();
	}
}
