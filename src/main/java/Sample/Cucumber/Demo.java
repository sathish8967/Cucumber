package Sample.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo {
	static WebDriver driver;
	@Given("The user is in Home page")
	public void the_user_is_in_Home_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-17\\Desktop\\karthi\\Sat\\Cucumber\\src\\main\\java\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	}

	@When("The user Search the Somthing")
	public void the_user_Search_the_Somthing() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("Asp.net");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();    
	}
	@Then("The user Get the Details")
	public void the_user_Get_the_Details() {
		System.out.println("User get The Details");
	}
}
