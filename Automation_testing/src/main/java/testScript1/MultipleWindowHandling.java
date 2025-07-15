package testScript1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{

	public static void main(String[] args) {
		MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
		multiplewindowhandling.browserIntialization();
		multiplewindowhandling.multipleWindowHandling();

	}
public void multipleWindowHandling()
{
	driver.navigate().to("https://webdriveruniversity.com/");
	WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contactus.click();
	WebElement loginportal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	loginportal.click();
	String parenthandle=driver.getWindowHandle();//this will returns a hanlde which is a character-numbers combination
	System.out.println(parenthandle);
	System.out.println("**************************************************");
	Set<String> allwindows=driver.getWindowHandles();//returns all the handles of multiple windows so it placed inside a set
	for(String set:allwindows)
	{
		System.out.println(set);//printing the handle of the parent window first
		driver.switchTo().window(set);//switching to the corresponding windows
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("********************************************************");
	}	
}
}
