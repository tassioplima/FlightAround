package screens;

import appium.AppiumController;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Commons;

public class PageFlight{

    public PageFlight(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(AppiumController.getDriver()),this);
    }

    @AndroidFindBy(id = "formContainer")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement loadingInitialScreen;

    @AndroidFindBy(id = "originAutoCompleteTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement originStation;

    @AndroidFindBy(id = "destinationAutoCompleteTextView")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement destinationStation;

    @AndroidFindBy(id = "departureEditText")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement departure;

    @AndroidFindBy(id = "adultsEditText")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement adultNumber;

    @AndroidFindBy(id = "teensEditText")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement teenNumber;

    @AndroidFindBy(id = "childrenEditText")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement childNumber;

    @AndroidFindBy(id = "searchButton")
    @iOSXCUITFindBy(accessibility = "N/A")
    private WebElement search;

    public void selectOriginStation(){
        Commons.waitForVisibilityElement(loadingInitialScreen);
        this.originStation.sendKeys("London");
    }
}