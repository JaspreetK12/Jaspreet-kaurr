package localfiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basefiles.swiggybasefile;

public class swiggytest extends swiggybasefile {
	public swiggytest ()
	{
	PageFactory.initElements(driver, this);
	}
	//login for 
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]")
	WebElement login;
	@FindBy(xpath="//*[@id=\"mobile\"]")
	WebElement mobile;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")
	WebElement clicklogin;
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a")
	WebElement verifyotp;
	@FindBy(xpath="//*[@id=\"location\"]")
	WebElement location;
	
	//search functionality
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/div[2]/button[1]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")
	WebElement searchclick;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[3]/div[1]/div[3]/div/div/div[2]/div/div/div[1]/button")
	WebElement pizaa;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/button[1]/div[1]")
	WebElement clickpiza;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/span[1]")
	WebElement resturant;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/span[2]/span")
	WebElement dishes;
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/a")
	WebElement swiggylogo;
	
	//visibility test
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]")
	WebElement sign;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/svg")
	WebElement swiggyloggo;
	
	
	//login
	public WebElement login() {
		return login;
	}
	public WebElement mobileno() {
		return mobile;
	}
	public WebElement loginclick() {
		return clicklogin;
	}
	public WebElement verifyotp() {
		return verifyotp;
	}
	public WebElement location() {
		return location;
	}
	//search functionality
	
	public WebElement search() {
		return search;
	}
	public WebElement searchclick() {
		return searchclick;
	}
	public WebElement searchpizaa() {
		return pizaa;
	}
	public WebElement pizaa() {
		return clickpiza;
	}
	public WebElement resturant() {
		return resturant;
	}
	public WebElement dishes() {
		return dishes;
	}
	public WebElement swiggylogo() {
		return swiggylogo;
	}
	//visibility
	public WebElement signinlogo() {
		return sign;
	}
	public WebElement swiggyylogo() {
		return swiggyloggo;
	}
	

}
