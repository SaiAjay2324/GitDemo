package mercuryTours.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import mercuryTours.pages.RegisterPage;

public class baseTest {

	public WebDriver driver;
	public RegisterPage registerPage;
	
	public WebDriver intializeBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public void getScreenShot(WebDriver driver, String errName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File ssPath = new File(System.getProperty("user.dir") + "//ScreenShot//"+errName+".png");
		FileUtils.copyFile(source, ssPath);
	}
	
	public void gittest() {
		System.out.println("This is the git test");
	}

	@BeforeMethod
	public void launchPage() throws IOException {
		driver = intializeBrowser();
		registerPage = new RegisterPage(driver);
		registerPage.goTo();
	}

	@AfterMethod
	public void closeLaunch() {
		System.out.println("Hi ma");
		driver.close();
	}
	

}
