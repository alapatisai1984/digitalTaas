package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Amazon
{
	WebDriver driver = new ChromeDriver();
	
	@Given("^I am on amazon landing page$")
	public void I_am_on_amazon_landing_page() throws Throwable
	{
		driver.get("https://amazon.in/");
	}

	@When("^I search iPhone {string}$")
	public void I_search_iphone(String iphone) throws Throwable 
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(iphone);
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 12 (256GB)')]")).click();
	}

	@Then("^Add to cart$")
	public void Add_to_cart() throws Throwable 
	{
		driver.getWindowHandle();
		driver.findElement(By.id("add-to-cart-button")).click();
		String actualText = driver.findElement(By.cssSelector("h4.a-alert-heading")).getText();
		Assert.assertEquals("Added to cart", actualText);
		driver.close();
	}

}
