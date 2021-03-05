package pages.customersMenu;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ExcelUtils;

import java.io.IOException;

public class CustomersPage {
    public CustomersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);


    @FindBy(xpath="//title[text()]")
    @CacheLookup
    public WebElement CommerceTitle ; // Customers / nopCommerce administration

    @FindBy(xpath="//div/a[@class='btn bg-blue']")
    @CacheLookup
    public WebElement addNewButton ;

    @FindBy(xpath="//button[@class='btn btn-success']")
    @CacheLookup
    public WebElement exportButton ;

    @FindBy(xpath="//i[@class='k-icon k-i-arrow-w']")
    @CacheLookup
    public WebElement previousGridButton ;

    @FindBy(xpath="//i[@class='k-icon k-i-arrow-e'][@xpath='1']")
    @CacheLookup
    public WebElement NextGridButton ;

    @FindBy(xpath="(//a[@aria-controls='customers-grid'])[2]")
    @CacheLookup
    public WebElement currentGridButton ;

    @FindBy(xpath="//button[@name='save']")
    @CacheLookup
    public WebElement saveButton ;

    @FindBy(xpath="//button[@name='save-continue']")
    @CacheLookup
    public WebElement saveAndContinueEditButton ;

    @FindBy(xpath="//*[text()='back to customer list']")
    @CacheLookup
    public WebElement backToCustomerListLink ;

    @FindBy(xpath="//input[@id='Email']")
    @CacheLookup
    public WebElement emailAddressBox ;

    @FindBy(xpath="//input[@id='Password']")
    @CacheLookup
    public WebElement passwordBox ;

    @FindBy(xpath="//input[@id='FirstName']")
    @CacheLookup
    public WebElement firstNameBox ;

    @FindBy(xpath="//input[@id='LastName']")
    @CacheLookup
    public WebElement lastNameBox ;

    @FindBy(xpath="//input[@id='Gender_Male']")
    @CacheLookup
    public WebElement genderMale_RadioButton ;

    @FindBy(xpath="//input[@id='Gender_Female']")
    @CacheLookup
    public WebElement genderFemale_RadioButton ;

    @FindBy(xpath="//input[@id='DateOfBirth']")
    @CacheLookup
    public WebElement dateOfBirthBox ;

    @FindBy(xpath="//input[@id='Company']")
    @CacheLookup
    public WebElement companyNameBox ;

    @FindBy(xpath="//input[@id='IsTaxExempt']")
    @CacheLookup
    public WebElement isTaxExemptCheckBox ;

    @FindBy(xpath="//select[@id='SelectedNewsletterSubscriptionStoreIds']")
    @CacheLookup
    public WebElement newsletterDD;

    @FindBy(xpath="//ul[@id='SelectedCustomerRoleIds_listbox']")
    @CacheLookup
    public WebElement customerRolesDD ;

    @FindBy(xpath="//select[@id='VendorId']")
    @CacheLookup
    public WebElement managerOfVendorDD ;

    @FindBy(xpath="//input[@id='Active']")
    @CacheLookup
    public WebElement activeCheckBox ;

    @FindBy(xpath="//textarea[@id='AdminComment']")
    @CacheLookup
    public WebElement adminCommentBox ;

    @FindBy(xpath = "//input[@id='SearchEmail']")
    @CacheLookup
    public WebElement searchEmailBox ;

    @FindBy(xpath = "//input[@id='SearchFirstName']")
    @CacheLookup
    public WebElement searchFirstNameBox ;

    @FindBy(xpath = "//input[@id='SearchLastName']")
    @CacheLookup
    public WebElement searchLastNameBox ;


    @FindBy(xpath = "//input[@id='SearchCompany']")
    @CacheLookup
    public WebElement searchCompanyNameBox ;


    public void clickAddNewButton(){
        addNewButton.click();
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void clickSaveAndContinueEditButton(){
        saveAndContinueEditButton.click();
    }

    public void clickOnCustomerInfoButton(){
        Driver.getDriver().findElement(By.xpath("//*[contains(@class,'panel-heading')]/div")).click();
    }

    public void setEmailAddress(String emailAddress){

        emailAddressBox.clear();
        emailAddressBox.sendKeys(emailAddress);
    }

    public void setPassword(String password){
        passwordBox.clear();
        passwordBox.sendKeys(password);
    }

    public void setFirstName(String firstName){
        firstNameBox.clear();
        firstNameBox.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        lastNameBox.clear();
        lastNameBox.sendKeys(lastName);
    }

    public void setGender(String gender){
        if(gender.trim().equalsIgnoreCase("m") || gender.trim().equalsIgnoreCase("male") ){
            genderMale_RadioButton.click();
        }
        else
        {
           genderFemale_RadioButton.click();
        }
    }



    public void setDateOfBirth(String dateOfBirth){

        if(!dateOfBirth.contains("/")){
            dateOfBirth = dateOfBirth.substring(0,2) + "/" + dateOfBirth.substring(2, 4)+ "/" + dateOfBirth.substring(4);
        }

        dateOfBirthBox.sendKeys(dateOfBirth);
    }

    public void setCompanyName(String companyName){
        companyNameBox.sendKeys(companyName);
    }

    public void setIsTaxExempt(String yesOrNo){
        if(yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes")){
            if(!isTaxExemptCheckBox.isSelected()){
                isTaxExemptCheckBox.click();
            }
        }

        if(yesOrNo.equalsIgnoreCase("n") || yesOrNo.equalsIgnoreCase("no")){
            if (isTaxExemptCheckBox.isSelected()){
                isTaxExemptCheckBox.click();
            }
        }
    }

    public void setNewsletter(/*String newsletterName*/) throws InterruptedException {
        Driver.getDriver().findElement(By.xpath("//body/div[3]/div[3]/div[1]/form[1]/div[3]/div[1]/nop-panels[1]/nop-panel[1]/div[1]/div[2]/div[1]/div[9]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("//li[text()='Your store name']")).click();
        //
    }

    public void setCustomerRoles(String customerRoles){

    }

    public void setManagerOfVendor(String managerOfVendor){
        Driver.getDriver().findElement(By.xpath("//*[@id='VendorId']")).click();

    }

    public void setActive(String yesOrNo){
        if(yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes")){
          if(!activeCheckBox.isSelected()) {
              activeCheckBox.click();
          }
        }

        if(yesOrNo.equalsIgnoreCase("n") || yesOrNo.equalsIgnoreCase("no")){
            if (activeCheckBox.isSelected()){
                activeCheckBox.click();
            }
        }
    }

    public void setAdminComment(String adminComment){
        adminCommentBox.sendKeys(adminComment);
    }

    public void setNewCustomerInfo(String rowNumber) throws IOException, InterruptedException {
        clickAddNewButton();

        Thread.sleep(1000);

        // clickOnCustomerInfoButton();
        for(int i=0 ; i<=3 ; i++) {
            if (!emailAddressBox.isDisplayed()) {
                clickOnCustomerInfoButton();
                wait.until(ExpectedConditions.visibilityOf(emailAddressBox));
                break;
            }
        }


        String sheet = ConfigurationReader.getProperty("sheetName");

        String email = RandomStringUtils.randomAlphabetic(5) + "@mail.com" ;    //ExcelUtils.getFieldValue(sheet,"email",rowNumber) ;
        System.out.println("email: " + email );
        String password = ExcelUtils.getFieldValue(sheet, "password", rowNumber) ;
        String firstName = ExcelUtils.getFieldValue(sheet, "firstName", rowNumber) ;
        String lastName = ExcelUtils.getFieldValue(sheet, "lastName", rowNumber);
        String gender = ExcelUtils.getFieldValue(sheet, "gender",rowNumber);
        String dateOfBirth= ExcelUtils.getFieldValue(sheet, "dateOfBirth", rowNumber) ;
        String companyName = ExcelUtils.getFieldValue(sheet, "companyName", rowNumber) ;
        String isTaxExempt = ExcelUtils.getFieldValue(sheet, "isTaxExempt", rowNumber) ;
        String newsletter = ExcelUtils.getFieldValue(sheet, "newsletter", rowNumber);
        String customerRoles = ExcelUtils.getFieldValue(sheet, "customerRoles", rowNumber) ;
        String managerOfVendor = ExcelUtils.getFieldValue(sheet, "managerOfVendor", rowNumber);
        String isActive = ExcelUtils.getFieldValue(sheet, "isActive", rowNumber);
        String adminComment = ExcelUtils.getFieldValue(sheet, "adminComment", rowNumber) ;

        setEmailAddress(email);
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
        setCompanyName(companyName);
        setIsTaxExempt(isTaxExempt);
        setNewsletter(/*newsletter*/);
        setCustomerRoles(customerRoles);
        setManagerOfVendor(managerOfVendor);
        setActive(isActive);
        setAdminComment(adminComment);
        clickSaveButton();

        Thread.sleep(5000);
    }




}
