import appium.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import screens.PageFlight;

public class AppTest extends Hooks{

    public PageFlight pageFlight;
    @Test
    @DisplayName("First Flight")
    public void newFlight() {
        pageFlight = new PageFlight(driver);
        pageFlight.selectOriginStation();
        pageFlight.sendInformation("London");
    }

}