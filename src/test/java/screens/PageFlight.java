package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import utils.Commons;

public class PageFlight extends PageBase{

    private MobileDriver<MobileElement> driver;

    public PageFlight(AppiumDriver<MobileElement> driver){
        super(driver);
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
        this.originStation.click();
    }

    public void sendInformation(String airport){
        Commons.waitForVisibilityElement(originStation);
        this.originStation.sendKeys(airport);
    }
}