package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {

	public static void main(String[] args) {
	RadioButton radiobutton=new RadioButton();
	radiobutton.browserIntialization();
	radiobutton.radiobutton();
	radiobutton.radiobuttonDemo();

	}
	public void radiobutton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton=driver.findElement(By.id("inlineRadio2"));
		//radiobutton.click();
	
		
	}
	public void radiobuttonDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobuttondemo=driver.findElement(By.id("inlineRadio2"));
		//radiobuttondemo.click();
		if(radiobuttondemo.isSelected())
		{
			System.out.println("Radiobutton is already selected");
		}
		else
		{
			radiobuttondemo.click();
			System.out.println("Radiobutton is selected");
		}
	}
}
