package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {

	public static void main(String[] args) {
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.browserIntialization();
		//alerthandling.simpleAlert();
		//alerthandling.confirmationAlert();
		alerthandling.promptAlert();	
	}
public void simpleAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement button1=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	button1.click();//used to click the alert button
	String a=driver.switchTo().alert().getText();//used for printing the text message inside the alert to console
	System.out.println(a);
	driver.switchTo().alert().accept();//used to click on ok button inside the alert
	
	
}
public void confirmationAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement button2=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	button2.click();//used to click the alert button
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();//used for cancel button
}
public void promptAlert()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement button3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));//locating the alert button
	button3.click();//on clicking the button alert will be seen
	driver.switchTo().alert().sendKeys("Varsha");//entering the text in the textfield
	driver.switchTo().alert().accept();//for ok
	//driver.switchTo().alert().dismiss();// for cancel
}
}
