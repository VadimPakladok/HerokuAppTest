import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputTest extends BaseTest{
    @Test
    public void inputTest() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("1");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("aaa");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("Keys.ARROW_UP");
        driver.findElement(By.tagName("input")).sendKeys("Keys.ARROW_UP");
        driver.findElement(By.tagName("input")).sendKeys("Keys.ARROW_UP");
        driver.findElement(By.tagName("input")).sendKeys("Keys.ARROW_UP");
//        public void arrowUp() {
//            driver.findElement(By.tagName("input")).sendKeys("Keys.ARROW_UP");
//        }


    }
}
