package stepDefinition;

import Page.HomePage;
import Page.LoginPage;
import Util.PropertyLoader;
import org.openqa.selenium.WebDriver;

import java.util.logging.LogManager;

public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage = new LoginPage(driver);
    public HomePage homePage = new HomePage(driver);
    protected static String chromeDriver = PropertyLoader.loadProperty("chromeDriver");
    protected static String loginPageUrl = PropertyLoader.loadProperty("loginPageUrl");
    public static String excelFilePaht = PropertyLoader.loadProperty("excelFilePath");
    public static String autoItUploadFileSite = PropertyLoader.loadProperty("autoItUploadFileSite");
    public static String restAssuredBaseURL = PropertyLoader.loadProperty("restAssuredBaseURL");
}
