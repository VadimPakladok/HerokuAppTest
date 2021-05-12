import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckBoxesTest extends BaseTest {

    @Test
    public void checkBox() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        assertFalse(checkboxes.get(0).isSelected(), "CheckBox Is Selected");
        checkboxes.get(0).click();
        assertTrue(checkboxes.get(0).isSelected(),"CheckBox Is Not Selected");
        assertTrue(checkboxes.get(1).isSelected(),"CheckBox Is Not Selected");
        checkboxes.get(1).click();
        assertFalse(checkboxes.get(1).isSelected(), "CheckBox Is Selected");






    }
}
