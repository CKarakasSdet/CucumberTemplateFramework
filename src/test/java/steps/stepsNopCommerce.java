package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.customersMenu.CustomersPage;
import pages.dashboardMenu.DashboardPage;
import pages.loginPage.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.IOException;

public class stepsNopCommerce {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    CustomersPage newCustomer = new CustomersPage();


    @Given("user launched the browser")
    public void user_launched_the_browser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user opens homepage")
    public void user_opens_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //Driver.getDriver().manage().window().maximize();
    }
    @When("user enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        loginPage.setUsername(email);
        loginPage.setPassword(password);

    }
    @When("click on login")
    public void click_on_login() {
        loginPage.clickLogin();
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Then("page title should be {string}")
    public void page_title_should_be(String title) {



        if(Driver.getDriver().getPageSource().contains("Login was unsuccessful.")){
            Driver.getDriver().quit();
        } else {

            Assert.assertEquals(title, Driver.getDriver().getTitle());
        }
    }
    @When("user clicks on log out link")
    public void user_clicks_on_log_out_link() {
        try {
            loginPage.clickLogout();
        } catch (Exception e){
            System.out.println("Unable to click logout");

        }

    }
    @Then("close the browser")
    public void close_the_browser()  {
        Driver.closeDriver();
    }

    @Then("user navigates to dropdown menu item {string}")
    public void user_navigates_to_dropdown_menu_item(String dropdownMenuItem) {
        if(dropdownMenuItem.equals("Dashboard")){
            dashboardPage.clickDashboardMenuLink();
        }

        if(dropdownMenuItem.equals("Catalog")){
            dashboardPage.clickCatalogMenuLink();
        }

        if(dropdownMenuItem.equals("Sales")){
            dashboardPage.clickSalesMenuLink();
        }

        if(dropdownMenuItem.equals("Customers")){
            dashboardPage.clickCustomersMenuLink();
        }

    }

    @Then("user clicks on sub-dropdown menu item {string}")
    public void user_clicks_on_sub_dropdown_menu_item(String subDropdownMenuItem) {
        if(subDropdownMenuItem.equals("Customers")){

            dashboardPage.clickCustomersDD();
        }
    }
    @Then("user enters info for new customer {string}")
    public void user_enters_info_for_new_customer(String rowNumber) throws IOException, InterruptedException {
        System.out.println("row num in steps: " + rowNumber);
        newCustomer.setNewCustomerInfo(rowNumber);

    }

    @Then("user verifies successful registration")
    public void user_verifies_successful_registration() throws InterruptedException {
        String successMessage = "The new customer has been added successfully.";
        Assert.assertTrue(Driver.getDriver().findElement(By.tagName("body")).getText().contains(successMessage));
        Thread.sleep(3000);
    }


    @Then("user enters search parameters for {string}")
    public void user_enters_search_parameters_for(String name) {

    }
}
