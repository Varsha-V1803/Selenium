package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {

	public static void main(String[] args) {
		CssSelector cssselector=new CssSelector();
		cssselector.browserIntialization();
		cssselector.tagAndId();
		cssselector.tagAndClass();
		cssselector.tagAndAttribute();
		cssselector.tagClassAttribute();

	}
public void tagAndId() {
	WebElement tagandid=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement tagandid1=driver.findElement(By.cssSelector("input#value-a"));
	WebElement tagandid2=driver.findElement(By.cssSelector("input#value-b"));
	WebElement tagandid3=driver.findElement(By.cssSelector("button#button-one"));
	WebElement tagandid4=driver.findElement(By.cssSelector("input#gridCheck"));

	

}
public void tagAndClass() {
	WebElement tagandclass=driver.findElement(By.cssSelector("input.form-check-input"));
	WebElement tagandclass1=driver.findElement(By.cssSelector("textarea.form-control"));
	WebElement tagandclass2=driver.findElement(By.cssSelector("section.clearfix"));
	WebElement tagandclass3=driver.findElement(By.cssSelector("form.needs-validation"));
	WebElement tagandclass4=driver.findElement(By.cssSelector("div.top-logo"));



	
}
public void tagAndAttribute() {
	WebElement tagandattribute=driver.findElement(By.cssSelector("input[id='single-input-field']"));
	WebElement tagandattribute1=driver.findElement(By.cssSelector("input[id='value-a']"));
	WebElement tagandattribute2=driver.findElement(By.cssSelector("input[type='checkbox']"));
	WebElement tagandattribute3=driver.findElement(By.cssSelector("input[id='gridCheck']"));
	WebElement tagandattribute4=driver.findElement(By.cssSelector("textarea[id='description']"));

}
public void tagClassAttribute() {
	WebElement tagclassattribute=driver.findElement(By.cssSelector("input.form-control[id='validationCustom01']"));
	WebElement tagclassattribute1=driver.findElement(By.cssSelector("input.form-control[id='validationCustomUsername']"));
	WebElement tagclassattribute2=driver.findElement(By.cssSelector("textarea.form-control[id='description']"));
	WebElement tagclassattribute3=driver.findElement(By.cssSelector("span.select2-selection__rendered[id='select2-slhv-container']"));
	WebElement tagclassattribute4=driver.findElement(By.cssSelector("input.form-check-input[id='gridCheck']"));
	
}
}
//1.Tag and ID(tag#id)
		//2.Tag and class(tag.class)
		//3.Tag and Attribute(tag[attribute=value]
		//4.Tag,class,and Attribute(tag.classname[attribute=value]
