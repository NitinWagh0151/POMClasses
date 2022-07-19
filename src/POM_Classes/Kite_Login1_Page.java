package POM_Classes;
// Page Object Module

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login1_Page //pom class 1
{
	  @FindBy(xpath ="//input[@id=\"userid\"]") private WebElement un;
	  @FindBy(xpath ="//input[@placeholder=\"Password\"]") private WebElement pwd;
	  @FindBy(xpath ="//button[@type=\"submit\"]") private WebElement loginbtn;


	  Kite_Login1_Page(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	public void enterUN()
	{
		un.sendKeys("ZAX405");
	}
	public void enterpwd()
	{
	     pwd.sendKeys("Akshay@1437");
	}
	public void clickonloginbtn()
	{
		loginbtn.click();

	}
	

}
