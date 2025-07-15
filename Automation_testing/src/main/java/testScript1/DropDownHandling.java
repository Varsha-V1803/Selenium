package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends Base {

	public static void main(String[] args) {
		DropDownHandling dropdownhandling=new DropDownHandling();
		dropdownhandling.browserIntialization();
		dropdownhandling.dropdown();
		//dropdownhandling.driverQuitAndClose();
		
	}
public void dropdown()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement drop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select=new Select(drop);
	//select.selectByVisibleText("Red");
	select.selectByValue("Yellow");
	//select.selectByIndex(2);
}

}
