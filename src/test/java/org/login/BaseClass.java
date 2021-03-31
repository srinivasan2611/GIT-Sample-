package org.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	static WebElement element;

	public static void browserLaunch(String browser) {
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Java workspace\\AdactinHotelBooking\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\Java workspace\\AdactinHotelBooking\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void getTheTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void toClick(WebElement e) {
		e.click();
	}

	public static void getText(WebElement e) {
		String text = e.getAttribute("value");
		System.out.println(text);
	}

	public static void quit() {
		driver.quit();
	}

	public static void fillTheBox(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

}
