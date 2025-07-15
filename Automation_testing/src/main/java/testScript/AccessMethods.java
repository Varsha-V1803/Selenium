package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethods extends Base{

	public static void main(String[] args) {
		AccessMethods accessmethods=new AccessMethods();
		accessmethods.browserIntialization();
		accessmethods.parent();
		accessmethods.child();

	}
public void parent()
{
	//driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement parent1=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));//here the parent is not having good attributes to take so we use the attributes of its corresponding child to locate the parent and here the targeted parent is <form>method="POST" and the child is  <button> type="button" class="btn btn-primary".......
}
public void child()
{
	WebElement child1=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));//here parent is having more attributes than the child
}
public void followingSibling()
{
	//WebElement sibling1=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
	WebElement sibling1=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));//here parent is <form>method="POST" and it is having two children like <button> type="button" class="btn btn-primary"....... and <div id="message-one" class="my-2" .... suppose our targeted child is <div id="message-one" class="my-2" the it is having a sibling like <button> type="button" class="btn btn-primary".so we use following sibling and we give the targeted child's attribute along with tag ie xpath at the end for eg div[@id='message-one']
	
}
public void following()
{
	WebElement following1=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));//here during locating if we have 1/16 divs and then we will give the targeted child attribute beneath the div at the end ie for eg from the 16 divs my targeted div is div[@id='message-two'] so its xpath is  given at the end
}
public void preceding()
{
	WebElement preceding1=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@id='collapsibleNavbar']"));//here during locating if we have 1/16 divs and then we will give the targeted child attribute is above the div at the end ie for eg from the 16 divs my targeted div is div[@id='collapsibleNavbar'] so its xpath is  given at the end
}
public void ancestor()
{
	WebElement ancestor1=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));//it is used to locate the parent,grandparent,grandgrandparent
}
public void descendant()
{
	WebElement descendant1=driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)[2]"));//it is used to locate child,grandchild...
}
public void indexing()
{
	WebElement indexing1=driver.findElement(By.xpath("(//button[@id='button-one']//preceding::div[@id='collapsibleNavbar'])[1]"));//here if we are not able to locate an element using all the 7 accessmethods,finally we use this indexing method ie,if there are 1/16 matches are present in the dom we need to give the index of the targeting web element
}
}
