package testScript1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Base {

	public static void main(String[] args) {
		ActionClass actionclass=new ActionClass();
		actionclass.browserIntialization();
		actionclass.action();
		//actionclass.driverQuitAndClose();

	}
public void action()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement action=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement action1=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	Actions actions=new Actions(driver);
	//actions.dragAndDrop(action, action1).build().perform();//used to drag and drop
	//actions.contextClick(action).build().perform();//used to perform rightclicking
	//actions.moveToElement(action).build().perform();//used for mouse hovering
	actions.doubleClick(action).build().perform();
	
}
}
