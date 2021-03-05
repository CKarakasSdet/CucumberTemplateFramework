package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    WebDriver driver ;

    @Given("I launch browser")
    public void i_launch_browser() {
        System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver");
        driver = new ChromeDriver();

    }

    @When("I open orangeHRM homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

    }
    @Then("I verify that the logo is present on the homepage")
    public void i_verify_that_the_logo_is_present_on_the_homepage() {
        boolean status = driver.findElement(By.xpath("//*[@id='divLogo']/img")).isDisplayed();
        Assert.assertEquals(true, status);

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
    }
    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
