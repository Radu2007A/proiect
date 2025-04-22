package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends AbstractPage {
    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardSing;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}

