import appium.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AppTest extends Hooks{

    @Test
    @DisplayName("First Flight")
    public void newFlight() throws InterruptedException {
      //  Thread.sleep(1000);

        driver.findElement(By.id("formContainer"));

    }

}