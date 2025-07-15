package testScript1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base { 


	public static void main(String[] args) {
		Base base=new Base();
		base.browserIntialization();
	}
	public WebDriver driver;//global initialization of driver
public void browserIntialization()//method used for initialize browser 
{
	 driver=new ChromeDriver();//browser initialize step,driver is assigned or initialized to driver reference variable
	//WebDriver driver=new EdgeDriver();
	driver.get("https://selenium.qabible.in/");//used to launch url
	driver.manage().window().maximize();//used to maximize the window
}
	public void driverQuitAndClose() 
	{
	driver.quit();//used to close all the open windows
	//driver.close(); used to close the parent window
	}
}

