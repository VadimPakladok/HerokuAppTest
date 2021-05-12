import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class СheckingTypos extends BaseTest {
    private Object assertEquals;

    @Test


    public void chekingTypos() {
        driver.get("http://the-internet.herokuapp.com/typos");
       // String text = driver.findElement(By.tagName("p")).getText();


        WebElement element = driver.findElement(By.id("content"));
        element.getAttribute("innerText");
        assertEquals(element, "Typos\n" +
                "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                "\n" +
                "Sometimes you'll see a typo, other times you won't.", "Typos\n" +
                "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                "\n" +
                "Sometimes you'll see a typo, other times you won,t.");



    }
}
