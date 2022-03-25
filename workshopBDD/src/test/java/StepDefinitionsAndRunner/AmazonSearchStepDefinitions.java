package StepDefinitionsAndRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchStepDefinitions {
	
	WebDriver d;
	String url;
	@Given("^Je connecte au site de Amazon$")
	    public void je_connecte_au_site_de_amazon() throws Throwable {
	       
	url="https://www.amazon.fr";
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	d=new ChromeDriver();  
	d.get(url);
	d.manage().window().maximize();

	    }

	    @When("^Je cherche \"([^\"]*)\" dans la barre de recherche$")
	    public void je_cherche_something_dans_la_barre_de_recherche(String typeproduit) throws Throwable {
	       
	    WebElement element= d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    element.sendKeys(typeproduit);
	    d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	   
	   
	    }

	    @Then("^La page souhaitée s affiche$")
	    public void la_page_souhaite_s_affiche() throws Throwable {
	       
	    }

}
