package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends AbstractPage {
    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardSing;

    @FindBy(xpath = "//img[@alt='profile picture']")
    private WebElement userMeniu;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logonButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}

