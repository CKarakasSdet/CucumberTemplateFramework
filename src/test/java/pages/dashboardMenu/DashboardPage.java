package pages.dashboardMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//span[text()='Dashboard']")
    @CacheLookup
    public WebElement dashboardMenuLink ;

    @FindBy(xpath="//span[text()='Catalog']")
    @CacheLookup
    public WebElement catalogMenuLink ;

    @FindBy(xpath="//span[text()='Sales']")
    @CacheLookup
    public WebElement salesMenuLink ;

    @FindBy(xpath="(//span[text()='Customers'])[1]")
    @CacheLookup
    public WebElement customersMenuLink ;

    @FindBy(xpath="//span[text()='Promotions']")
    @CacheLookup
    public WebElement promotionsMenuLink ;

    @FindBy(xpath="//span[text()='Content management']")
    @CacheLookup
    public WebElement contentManagementMenuLink ;

    @FindBy(xpath="//span[text()='Configuration']")
    @CacheLookup
    public WebElement configurationMenuLink ;

    @FindBy(xpath="//span[text()='System']")
    @CacheLookup
    public WebElement systemMenuLink ;

    @FindBy(xpath="//span[text()='Reports']")
    @CacheLookup
    public WebElement reportsMenuLink ;

    @FindBy(xpath="//span[text()='Help']")
    @CacheLookup
    public WebElement helpMenuLink ;

    @FindBy(xpath="//span[text()='Products']")
    @CacheLookup
    public WebElement productsDD ;

    @FindBy(xpath="//span[text()='Categories']")
    @CacheLookup
    public WebElement categoriesDD ;

    @FindBy(xpath="//span[text()='Manufacturers']")
    @CacheLookup
    public WebElement manufacturersDD ;

    @FindBy(xpath="//span[text()='Product reviews']")
    @CacheLookup
    public WebElement productReviewsDD ;

    @FindBy(xpath="//span[text()='Product tags']")
    @CacheLookup
    public WebElement productTagsDD ;

    @FindBy(xpath="//span[text()='Attributes']")
    @CacheLookup
    public WebElement attributesDD ;

    @FindBy(xpath="")
    @CacheLookup
    public WebElement ordersDD ;

    @FindBy(xpath="//span[text()='Shipments']")
    @CacheLookup
    public WebElement shipmentsDD ;

    @FindBy(xpath="//span[text()='Return requests']")
    @CacheLookup
    public WebElement returnRequestsDD ;

    @FindBy(xpath="//span[text()='Recurring payments']")
    @CacheLookup
    public WebElement recurringPaymentsDD ;

    @FindBy(xpath="//span[text()='Gift cards']")
    @CacheLookup
    public WebElement giftCardsDD ;

    @FindBy(xpath="//span[text()='Shopping carts and wishlists']")
    @CacheLookup
    public WebElement shoppingCartsAndWishlistsDD ;

    @FindBy(xpath="(//span[text()='Customers'])[2]")
    @CacheLookup
    public WebElement customersDD ;

    @FindBy(xpath="//span[text()='Customer roles']")
    @CacheLookup
    public WebElement customerRolesDD ;

    @FindBy(xpath="//span[text()='Online customers']")
    @CacheLookup
    public WebElement onlineCustomersDD ;

    @FindBy(xpath="//span[text()='Vendors']")
    @CacheLookup
    public WebElement vendorsDD ;

    @FindBy(xpath="//span[text()='Activity log']")
    @CacheLookup
    public WebElement activityLogDD ;

    @FindBy(xpath="//span[text()='Activity Types']")
    @CacheLookup
    public WebElement activityTypesDD ;

    @FindBy(xpath="//span[text()='GDPR requests (log)']")
    @CacheLookup
    public WebElement GDPR_requestsDD ;


    public void clickDashboardMenuLink(){
        dashboardMenuLink.click();
    }

    public void clickCatalogMenuLink(){
        catalogMenuLink.click();
    }

    public void clickProductsDD(){
        productsDD.click();
    }

    public void clickCategoriesDD(){
        categoriesDD.click();
    }

    public void clickManufacturersDD(){
        manufacturersDD.click();
    }

    public void clickProductReviewsDD(){
        productReviewsDD.click();
    }

    public void clickProductTagsDD(){
        productTagsDD.click();
    }

    public void clickAttributesDD(){
        attributesDD.click();
    }

    public void clickSalesMenuLink(){
        salesMenuLink.click();
    }

    public void clickOrdersDD(){
        ordersDD.click();
    }

    public void clickShipmentsDD(){
        shipmentsDD.click();
    }

    public void clickReturnRequestsDD(){
        returnRequestsDD.click();
    }

    public void clickRecurringPaymentsDD(){
        recurringPaymentsDD.click();
    }

    public void clickGiftCardsDD(){
        giftCardsDD.click();
    }

    public void clickCustomersMenuLink(){
        customersMenuLink.click();
    }

    public void clickCustomersDD(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(customersDD));
        customersDD.click();
    }

    public void clickCustomerRolesDD(){
        customerRolesDD.click();
    }

    public void clickOnlineCustomersDD(){
        onlineCustomersDD.click();
    }

    public void clickVendorsDD(){
        vendorsDD.click();
    }

    public void clickActivityLogDD(){
        activityLogDD.click();
    }

    public void clickActivityTypesDD(){
        activityTypesDD.click();
    }

    public void clickGDPR_requestsDD(){
        GDPR_requestsDD.click();
    }
    /*  ****/










}
