import appium.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.PageFlight;

public class AppTest extends Hooks{

    public PageFlight pageFlight;
    @Test
    @DisplayName("Validate first flight to Thessaloniki")
    public void firstFlight() {
        pageFlight = new PageFlight(driver);
        pageFlight.selectOrigin("Wroclaw WRO");
        pageFlight.selectDestination("Thessaloniki SKG");
        pageFlight.selectCalendar();
        pageFlight.selectAdult("2");
        pageFlight.searchFlight();
        Assertions.assertEquals("Wrong search response", pageFlight.wrongSearch());
    }

    @Test
    @DisplayName("Validate second flight to London")
    public void secondFlight() {
        pageFlight = new PageFlight(driver);
        pageFlight.selectOrigin("Wroclaw WRO");
        pageFlight.selectDestination("London Stansted, London (Stansted) STN");
        pageFlight.selectCalendar();
        pageFlight.selectAdult("1");
        pageFlight.selectTeen("1");
        pageFlight.selectChild("1");
        pageFlight.searchFlight();
        Assertions.assertEquals("Wrong search response", pageFlight.wrongSearch());
    }

}