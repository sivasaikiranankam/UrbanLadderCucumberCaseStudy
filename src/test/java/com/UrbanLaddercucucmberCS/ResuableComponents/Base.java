package com.UrbanLaddercucucmberCS.ResuableComponents;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.UrbanLaddercucumberCS1.Utlities.*;

public class Base {
	public static  WebDriver driver;
	public static Properties prop;
	public static Logger logger;

	public WebDriver initializedriver() throws IOException
	{
		/*prop=new Properties();
		prop.load(PropertyFileReader.LoadFile());*/
		prop=ULCucumberPropertyFileReader.LoadFile();
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		ReusableMethods.Implicitwait(driver);
		logger = Logger.getLogger("Automation Practice");
		PropertyConfigurator.configure("log4j.properties");
		return driver;
	}
	
	public static void OpenUrl()
	{
		driver.get(prop.getProperty("url"));
	}
	
}

	
