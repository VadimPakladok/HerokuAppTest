import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.lang.reflect.MalformedParametersException;
import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class HerokuAppTest {
    @Test
    public void test1() throws MalformedParametersException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
      //  options.addArguments("--headless");
        options.addArguments("--strart-maximized");
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebDriver driver = new ChromeDriver(options);
        //driver.manage().window().setSize(new Dimension(1024, 768));
//        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

          driver.get("http://tut.by");
        driver.quit();
    }
}