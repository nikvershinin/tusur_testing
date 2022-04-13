import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class CucumberVershinin {
		WebDriver driver;
	
	@Given("^I use the calculater1$")
	public void use1(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.calculator.net/triangle-calculator.html");	
    driver.manage().window().setSize(new Dimension(1040, 664));
	}
	@When("^I enter \"100\" into one angle$")
	public void enter11(){
		driver.findElement(By.cssSelector(".clearbtn")).click();
	    driver.findElement(By.name("vc")).click();
	    driver.findElement(By.name("vc")).sendKeys("100");
	}
	@And("^I enter \"4\" into one side$")
	public void enter22(){
    driver.findElement(By.name("vx")).click();
    driver.findElement(By.name("vx")).sendKeys("4");
	}
	
	@And("^I enter \"40\" into other side$")
	public void enter33(){
	driver.findElement(By.name("va")).click();
    driver.findElement(By.name("va")).sendKeys("40");
	}
    @Then("^the calculated result is \"Obtuse Isosceles Triangle\"$")
    public void enter44(){
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
        assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(), "Obtuse Isosceles Triangle");
        driver.close();
    }}
    
    
   
	
	
	
	
	
	
	
	
	
	
	
