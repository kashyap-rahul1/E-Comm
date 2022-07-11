package com.mystore.base;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.mystore.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() throws IOException {
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("C:\\Users\\thinksysuser\\eclipse-workspace\\MyStoreProject\\Configuration\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialisation() {
		WebDriverManager.chromedriver().setup();
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			
			driver=new ChromeDriver();
		}
		else if (browserName.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Action.implicitWait(driver, 30);
		Action.pageLoadTimeOut(driver, 10);
		driver.get(prop.getProperty("url"));
	}
	
}
