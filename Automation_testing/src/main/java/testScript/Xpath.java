package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {

	public static void main(String[] args) {
		

	}
public void relativeXpath()//    //tagname[@attribue='value'] here @ is used before an attribute
{
	WebElement relativepath=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement relativepath1=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement relativepath2=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement relativepath3=driver.findElement(By.xpath("//button[@id='button-two']"));
	WebElement relativepath4=driver.findElement(By.xpath("//input[@id='value-b']"));

}
public void contains()//  //tagname[contains(@attribue,'value')]
{
	WebElement contains=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
	WebElement contains1=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
	WebElement contains2=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
	WebElement contains3=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
	WebElement contains4=driver.findElement(By.xpath("//input[contains(@id,'ngle-input-field')]"));
	
}
public void startsWith()//   //tagname[startsWith(@attribue,'value')]
{
	WebElement startswith=driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
	WebElement startswith1=driver.findElement(By.xpath("//input[starts-with(@id,'value')]"));
	WebElement startswith2=driver.findElement(By.xpath("//input[starts-with(@id,'grid')]"));
	WebElement startswith3=driver.findElement(By.xpath("//input[starts-with(@id,'is_')]"));
	WebElement startswith4=driver.findElement(By.xpath("//span[starts-with(@id,'select2-ktjr-container')]"));



	

}
public void text()//    //tagname[text()='value')]  text() is a method so we didn't use @ before it.
{
	WebElement text=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement text1=driver.findElement(By.xpath("//button[text()='Get Total']"));
	WebElement text2=driver.findElement(By.xpath("//div[text()='Total A + B : NaN']"));
	WebElement text3=driver.findElement(By.xpath("//label[text()='Subject']"));
	WebElement text4=driver.findElement(By.xpath("//button[text()='Get All Selected']"));
	
}
public void and()//   //tagname[@attribue='value' and @attribue='value']
{
	WebElement and=driver.findElement(By.xpath("//select[@class='form-control' and @id='single-input-field']"));
	WebElement and1=driver.findElement(By.xpath("//input[@class='form-control' and @id='single-input-field']"));
	WebElement and2=driver.findElement(By.xpath("//input[@class='form-control' and @id='value-a']"));
	WebElement and3=driver.findElement(By.xpath("//input[@class='form-control' and @id='value-b']"));
	WebElement and4=driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
	WebElement and5=driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='Message']"));


}
public void or()//   //tagname[@attribue='value' or @attribue='value']
{ 
	WebElement or=driver.findElement(By.xpath("//select[@class='form-control' or @id='single-input-field']"));
	WebElement or1=driver.findElement(By.xpath("//input[@class='form-control' or @id='single-input-field']"));
	WebElement or2=driver.findElement(By.xpath("//input[@class='form-control' or @id='value-a']"));
	WebElement or3=driver.findElement(By.xpath("//input[@class='form-control' or @id='value-b']"));
	WebElement or4=driver.findElement(By.xpath("//button[@type='button' or @id='button-one']"));	
}

}

