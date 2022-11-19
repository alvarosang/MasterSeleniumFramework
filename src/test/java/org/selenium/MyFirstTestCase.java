package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestCase {
	
	@Test
	
	public void dummyTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alvaro\\Desktop\\Formation\\Software\\Selenium\\chromedriver.exe");
		
		// En vez de añadir System.setProperty se puede añadir el path a las variables del entorno para no escribir el path del chromedriver en cada proyecto
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://askomdch.com/");
		
	}

}
