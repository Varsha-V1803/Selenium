package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base{

	public static void main(String[] args) {
			Checkbox checkbox=new Checkbox();
			checkbox.browserIntialization();
			//checkbox.checkbox();
			checkbox.checkboxDemo();
			//checkbox.driverQuitAndClose();

	}
	public void checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.id("gridCheck"));
		checkbox.click();
	}
	public void checkboxDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkboxdemo=driver.findElement(By.id("gridCheck"));
	//	checkboxdemo.click();
		if(checkboxdemo.isSelected())
		{
			System.out.println("Checkbox is already selected");
			
		}
		else
		{
			checkboxdemo.click();
			System.out.println("Checkbox is selected");
		}
	}

}
