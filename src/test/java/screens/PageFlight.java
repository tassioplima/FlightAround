package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
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
    private MobileElement childNumber;

    @AndroidFindBy(id = "searchButton")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement search;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement confirmCalendar;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement cancelCalendar;

    @AndroidFindBy(id = "snackbar_text")
    @iOSXCUITFindBy(accessibility = "N/A")
    private MobileElement wrongSearch;

    public void selectOrigin(String airport){
        Commons.waitForVisibilityElement(loadingInitialScreen);
        this.originStation.sendKeys(airport);
    }

    public void selectDestination(String airport){
        Commons.waitForVisibilityElement(destinationStation);
        this.destinationStation.sendKeys(airport);
    }

    public void selectCalendar(){
        Commons.waitForVisibilityElement(departure);
        this.departure.click();
        Commons.waitForVisibilityElement(confirmCalendar);
        this.confirmCalendar.click();
    }
    public void selectAdult(String adult){
        this.adultNumber.sendKeys(adult);
    }

    public void selectTeen(String teen){
        this.teenNumber.sendKeys(teen);
    }

    public void selectChild(String child){
        this.childNumber.sendKeys(child);
    }

    public void searchFlight(){
        Commons.hideKeyboard();
        this.search.click();
    }

    public String wrongSearch(){
        Commons.waitForVisibilityElement(wrongSearch);
        String viewText = this.wrongSearch.getText();
        return  viewText;
    }

}