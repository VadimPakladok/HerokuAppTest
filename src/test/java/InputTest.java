import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputTest extends BaseTest{
    @Test
    public void inputTest() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("10");
        input.sendKeys(Keys.ARROW_UP);
        assertEquals(input.getAttribute("value"), "11", "ARROW UP IS NOT WORK");
        input.sendKeys(Keys.ARROW_DOWN);
        assertEquals(input.getAttribute("value"),"10", "ARROW DOWN IS NOT WORK");


    }
}
