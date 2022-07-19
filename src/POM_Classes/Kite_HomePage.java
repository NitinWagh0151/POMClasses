package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage  // POM class 3
{
@FindBy(xpath = "//span[@class=\"user-id\"]") private WebElement userid;

Kite_HomePage(WebDriver driver)
   {
	PageFactory.initElements(driver, this);
	}

public void verifyuserID()
{
	String actualuserID = userid.getText();
	String expecteduserID = "ZAX405";
	
	if(actualuserID.equals(expecteduserID))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("FAil");
	}
	
	}

}
