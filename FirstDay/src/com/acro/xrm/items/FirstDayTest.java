package com.acro.xrm.items;

import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDayTest {

	static WebDriver driver;
	
	static ResourceBundle readResourceBundle(){
	//ResourceBundle rb = new ResourceBundle(); // abstract class
		ResourceBundle rb = ResourceBundle.getBundle("config");
	return rb;
	}
	
	static String getValue(String key){
		ResourceBundle rb = readResourceBundle();
		String value = rb.getString(key);
	return  value;
}
	
	public static void main(String[] args) {
		
		System.setProperty(getValue("drivername"), getValue("driverpath"));
	    driver= new ChromeDriver();
		driver.get(getValue("url"));
		
		driver.findElement(By.id("TextBoxUserID")).sendKeys("joexrm");
	    driver.findElement(By.id("TextBoxPassword")).sendKeys("1qaz!QAZ");
	    driver.findElement(By.id("ButtonLogin")).click();
	    
	   List<WebElement> elements =  driver.findElements(By.className("newtabletext"));
	  System.out.println(elements.size());
	    
	}

}




