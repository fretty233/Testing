package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("^open chrome and start aplication$")
	public void open_chrome_and_start_aplication() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mksshoes.com/");
	}
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("prettysilalahi27@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Lingkaran!");
	}
	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {

	   driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")).click();
	}

	@When("^I click bag manu $")
	public void I_click_bag_manu() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[1]/div[2]/div/ul/li[2]")).click();
	}

	@Then("^I click viewchart$")
	public void I_click_viewchart() throws Throwable {

	   driver.findElement(By.xpath("//*[@id=\"cart-sidebar\"]/div[2]/div[2]/div[2]/p/a[1]")).click();
	}
}