 package testScript;

public class BrowserCommands extends Base {

	public static void main(String[] args) {
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.browserIntialization();//calling parent class method 
		browsercommands.browserCommands();//calling child class method
		browsercommands.driverQuitAndClose();//calling quit method,the quit method should be called last because if not called last it may close the window and the changes can't be seen
	}
public void browserCommands()//used to interact with browser and perform some actions
{
	//driver.getTitle();//used to get the title in a page we opens
	String title=driver.getTitle();//store the title in the string variable title
	//System.out.println(title);
	String url=driver.getCurrentUrl();//used to get the current url of the pages
	//System.out.println(url);
	String source=driver.getPageSource();//used to get the html code of the page that opens up
	System.out.println(source);
}

}
