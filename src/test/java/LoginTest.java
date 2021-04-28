import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Test
    public void login() {
        driver.get("http://the-internet.herokuapp.com/login");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("tomsmith");
        driver.findElement(By.cssSelector("[value=submit]"));
        assertEquals(userName.getAttribute("value"), "tomsmith", "Юзер не найден");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        userName.submit();
//        String message = driver.findElement(By.id("flach")).getText();



    }
}
