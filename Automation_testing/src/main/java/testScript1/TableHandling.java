package testScript1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public static void main(String[] args) {
		TableHandling tablehandling=new TableHandling();
		tablehandling.browserIntialization();
		//tablehandling.table();
		//tablehandling.tableRow();
		//tablehandling.tableCell();
		//tablehandling.tableColumn();
		//tablehandling.tableRow1();
		//tablehandling.tableCell1();
		tablehandling.tableColumn1();
	}
public void table()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tab=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	System.out.println(tab.getText());
	
}
public void tableRow()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tabrow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]"));
	System.out.println(tabrow.getText());
	
}
public void tableRow1()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tabrow1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]"));
	System.out.println(tabrow1.getText());
	
}
public void tableCell()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tabcell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td[1]"));
	System.out.println(tabcell.getText());
}
public void tableCell1()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tabcell1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[1]"));
	System.out.println(tabcell1.getText());
}
public void tableColumn()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> tabcol=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
	for(WebElement list:tabcol) {
	System.out.println(list.getText());
	}
}
public void tableColumn1()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> tabcol1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
	for(WebElement list:tabcol1) {
	System.out.println(list.getText());
	}
}
}
