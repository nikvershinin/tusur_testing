import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class calculatortest {
		WebDriver driver;
	
	@Given("^I use the calculater$")
	public void use(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.calculator.net/");	
	//driver.get("https://www.calculator.net/triangle-calculator.html");
	}
	
	@When("^I enter \"1\" into the calculator$")
	public void enter1(){
    driver.manage().window().setSize(new Dimension(1040, 666));
    driver.findElement(By.cssSelector(".scieq:nth-child(3)")).click();//clear
    driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(1)")).click();//1
	}
	
	@And("^I add \"200\"$")
	public void enter2() {
    driver.findElement(By.cssSelector("div:nth-child(1) > .sciop:nth-child(4)")).click();//+
    driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(2)")).click();//2
    driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();//0
    driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();//0
	}
    
	@And("^I subtract \"200\"$")
	public void enter3() {
	    driver.findElement(By.cssSelector("div:nth-child(2) > .sciop:nth-child(4)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(3) > .scinm:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(4) > .scinm:nth-child(1)")).click();
	}
	@And("^I divide by \"555\"$")
	public void enter4() {
	    driver.findElement(By.cssSelector("div:nth-child(3) > .sciop:nth-child(4)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
	}
	@And("^I multiply by \"555\"$")
	public void enter5() {
		    driver.findElement(By.cssSelector("div:nth-child(4) > .sciop:nth-child(4)")).click();
		    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
		    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
		    driver.findElement(By.cssSelector("div:nth-child(2) > .scinm:nth-child(2)")).click();
	}
	@Then("^the calculated result is \"1\"$")
	public void assert1() {
	driver.findElement(By.cssSelector(".scieq:nth-child(4)")).click();
    driver.findElement(By.id("sciOutPut")).click();
    assertEquals(driver.findElement(By.id("sciOutPut")).getText(), " 1");
    driver.close();
	}
			}	
