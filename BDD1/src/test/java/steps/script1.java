package steps;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class script1 {
	
	
	WebDriver d1;
	
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASWATHI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver d1;
		d1 = new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
	    System.out.println("Given stt");
	}

	@When("Enter the {string},{string} and click on login button")
	public void enter_the_and_click_on_login_button(String username, String password) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		
		d1.findElement(By.id("userName")).sendKeys(username);
		d1.findElement(By.id("password")).sendKeys(password);
		d1.findElement(By.id("submitBtn")).click();
		
	 System.out.println("when done");
	 

		TakesScreenshot tk1=(TakesScreenshot) d1;
	File Source=tk1.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\ASWATHI\\Pictures\\new\\login.png");
	FileHandler.copy(Source, destination);
		
		
	}
	@Then("Success in login")
	public void success_in_login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("then done");
	   // d1.findElement(By.cssSelector("#bookingsForm > div.main-booking > div > div:nth-child(2) > div.col-md-2.mb-1.booking-input > button > i")).click();
	    
}
	@Then("user is navigate to search page")
	public void user_is_navigate_to_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("then done");
	}

	
	@When("Enter  bording place name,alighting place name,txtJourneyDate,txtReturnJourneyDate and click on search button")
	public void enter_bording_place_name_alighting_place_name_txtJourneyDate_txtReturnJourneyDate_and_click_on_search_button() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		d1.findElement(By.id("fromPlaceName")).sendKeys("BANG");
		Thread.sleep(3000);
		
		List<WebElement> element1=d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

		for(WebElement el:element1) {
			if(el.getText().equalsIgnoreCase("BANGALORE")) {
				el.click();
				break;
			}
		}
		
		d1.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[1]/div/div[2]/div/input[3]")).sendKeys("MANG");
		Thread.sleep(3000);
		List<WebElement> element2=d1.findElements(By.xpath("//ul[@id=\'ui-id-2\']/li"));

		for(WebElement e2:element2) {
			if(e2.getText().equalsIgnoreCase("MANGALORE")) {
				e2.click();
				break;
			}
		}
		//public void javascript1() {
	        //System.setProperty("webdriver.chrome.driver","C:\\Users\\ASWATHI\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//WebDriver d1;
			//d1 = new ChromeDriver();
			//d1.get("http://demo.automationtesting.in/Datepicker.html");
		//d1.findElement(By.id("/html/body/main/form/div[1]/div/div[2]/div[2]/div/div[1]/div/input")).sendKeys("BANG");
		//Thread.sleep(3000);
			JavascriptExecutor jse=(JavascriptExecutor) d1;
			jse.executeScript("document.getElementById('txtJourneyDate').value='25/01/2022'");
			jse.executeScript("document.getElementById('txtReturnJourneyDate').value='30/01/2022'");
			
			//d1.findElement(By.xpath("//label[text()='singleLady']")).click();
			d1.findElement(By.cssSelector("#bookingsForm > div.main-booking > div > div:nth-child(2) > div.col-md-2.mb-1.booking-input > button > i")).click();
			 System.out.println("when done");

				TakesScreenshot tk1=(TakesScreenshot) d1;
			File Source=tk1.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\ASWATHI\\Pictures\\new\\search.png");
			FileHandler.copy(Source, destination);
				
	}


	
	@Then("Success in search")
	public void success_in_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("then done");
	}

}
