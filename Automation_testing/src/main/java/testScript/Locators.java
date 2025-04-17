package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.browserIntialization();
		locators.id();
		//locators.driverQuitAndClose();

	}
public void id()//using id selector we can fastly locate a webelement
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	//WebElement elementname=driver.findElement(By.locator(locatorvalue));//syntax to locate webelement,By-class and inside it 8 locators are present
	WebElement textfield=driver.findElement(By.id("single-input-field"));//textfield is located
	//textfield.sendKeys("Varsha Venu");
	WebElement button=driver.findElement(By.id("button-one"));//used to locate the button
	//button.click();
	WebElement buttonGettotal=driver.findElement(By.id("button-two"));//used to locate the button
	//buttonGettotal.click();
	WebElement textfield1=driver.findElement(By.id("value-a"));//textfield is located
	textfield1.sendKeys("Varsha");
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkbox=driver.findElement(By.id("gridCheck"));//used to locate the checkbox
	checkbox.click();
	
	
	
}
public void className()
{
	WebElement class1=driver.findElement(By.className("header-top"));
	WebElement class2=driver.findElement(By.className("top-logo"));
	WebElement class3=driver.findElement(By.className("mb-sec"));	
	
}
public void name()
{
WebElement name1=driver.findElement(By.className("viewport"));
WebElement name2=driver.findElement(By.className("author"));
WebElement name3=driver.findElement(By.className("keywords"));
WebElement name4=driver.findElement(By.className("description"));
}
public void linktext()
{
	WebElement link1=driver.findElement(By.linkText("Checkbox Demo"));//textmame will by given here for eg Checkbox Demo
	WebElement link2=driver.findElement(By.linkText("Ajax Form Submit"));
	WebElement link3=driver.findElement(By.linkText("Jquery Select2"));
}
public void partiallinktext()
{
	WebElement partiallink1=driver.findElement(By.partialLinkText("Checkbox De"));
	WebElement partiallink2=driver.findElement(By.partialLinkText("Ajax Form S"));
	WebElement partiallink3=driver.findElement(By.partialLinkText("Jquery Sel"));
}
}