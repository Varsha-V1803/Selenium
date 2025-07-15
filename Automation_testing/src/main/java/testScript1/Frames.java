package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base {

	public static void main(String[] args) {
		Frames frames=new Frames();
		frames.browserIntialization();
		frames.frame1();

	}
public void frame1()
{
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));//need to locate iframe and switch the iframe
	driver.switchTo().frame(iframe);//switching to iframe and the interacting
	WebElement frame=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));//frame is located
	frame.click();//frame is clicked
}
}
