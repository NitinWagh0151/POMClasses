package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login2_Page // POM class 2
{
@FindBy(xpath ="//input[@icon=\"lock\"]") private WebElement pin;
@FindBy(xpath ="//button[@class=\"button-orange wide\"]") private WebElement ctnbtn;

Kite_Login2_Page(WebDriver driver)
   {
	PageFactory.initElements(driver, this);
	}

public void enterpin()
   {
	pin.sendKeys("143707");
	}
public void clickonctnbtn()
 {
	ctnbtn.click();
	}

}
