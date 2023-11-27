package mercuryTours.pages;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="input[name='firstName']")
	WebElement fName;
	
	@FindBy(css="input[name='lastName']")
	WebElement lName;
	
	@FindBy(css="input[name='phone']")
	WebElement ph;
	
	@FindBy(css="input[name='userName']")
	WebElement mail;
	
	@FindBy(css="input[name='address1']")
	WebElement add;
	
	@FindBy(css="input[name='city']")
	WebElement city;
	
	@FindBy(css="input[name='state']")
	WebElement state;
	
	@FindBy(css="input[name='postalCode']")
	WebElement pcode;
	
	@FindBy(css="input[name='email']")
	WebElement uName;
	
	@FindBy(css="input[name='password']")
	WebElement pwd;
	
	@FindBy(css="input[name='confirmPassword']")
	WebElement copwd;
	
	@FindBy(css="input[name='submit']")
	WebElement subBtn;
	
	@FindBy(css="select[name='country']")
	WebElement sd;
	
	@FindBy(css="span")
	WebElement erM;
	
	
	public void fillForm(HashMap<String,String>input) {
		
		fName.sendKeys(input.get("fName"));
		lName.sendKeys(input.get("lName"));
		ph.sendKeys(input.get("ph"));
		mail.sendKeys(input.get("mail"));
		add.sendKeys(input.get("add"));
		city.sendKeys(input.get("city"));
		state.sendKeys(input.get("state"));
		pcode.sendKeys(input.get("pcode"));
		Select dropDown= new Select(sd);
		dropDown.selectByValue(input.get("cntry"));
		uName.sendKeys(input.get("uName"));
		pwd.sendKeys(input.get("pwd"));
		copwd.sendKeys(input.get("copwd"));
		subBtn.click();
		
	}
	
	public boolean checkRegister(String msg) {
		return erM.getText().equals(msg);
	}
	
	public boolean checkSuccess(String url) {
		return driver.getCurrentUrl().equals(url);
	}
	public WebDriver getInstance() {
		return driver;
	}
	
	public void goTo() {
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
}
