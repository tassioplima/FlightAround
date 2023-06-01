import appium.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import screens.PageFlight;

public class AppTest extends Hooks{

    public PageFlight pageFlight;
    @Test
    @DisplayName("First Flight to Thessaloniki")
    public void newFlight() {
        pageFlight = new PageFlight(driver);
        pageFlight.selectOrigin("Wroclaw WRO");
        pageFlight.selectDestination("Thessaloniki SKG");
        pageFlight.selectCalendar();
        pageFlight.selectAdult("2");
        pageFlight.searchFlight();
        Assertions.assertEquals("Wrong search response", pageFlight.wrongSearch());
    }

}