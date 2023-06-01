import appium.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import screens.PageFlight;

public class AppTest extends Hooks{

    public PageFlight pageFlight;
    @Test
    @DisplayName("First Flight")
    public void newFlight() throws InterruptedException {
      //  Thread.sleep(1000);
        pageFlight = new PageFlight(driver);
        pageFlight.selectOriginStation();

    }

}