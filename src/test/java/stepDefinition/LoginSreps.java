package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Getter;
import org.junit.Assert;

import static Actions.Action.*;
import static Util.DataKeys.PASSWORD;
import static Util.DataKeys.USERNAME;
import static Util.HighlightElement.highlightElement;
import static Util.ScenarioContext.getData;
import static Util.ScenarioContext.saveData;
import static Util.WaitUntil.waitUntil;

@Getter
public class LoginSreps extends AbstractStepDef {
    @Given("user insert username")
    public void UserInsertUsername() throws InterruptedException {
        navigate(loginPageUrl, driver);
        Thread.sleep(3000);
        sendKey(loginPage.getUsernameField(), "Admin");
        saveData(USERNAME, "Admin");
    }

    @And("user insert password")
    public void UserInsertPassword() {
        waitUntil(3);
        sendKey(loginPage.getPasswordField(), "admin123");
        saveData(PASSWORD, "admin123");
    }

    @When("user clicks on Login button")
    public void userClicksOnLoginButton() {
        click(loginPage.getSubmitButton(), 2);
    }

    @Then("user is redirect to homepage")
    public void userIsRedirectToHomePage() {
        waitUntil(3);
        highlightElement(homePage.getDashboardSing());
        Assert.assertEquals("Dashboard", homePage.getDashboardSing().getText());
    }

    @Then("user clicks on LogOut button")
    public void userClicksOnLogOut() {
        click(homePage.getUserMeniu(),1);
        waitUntil(3);
        highlightElement(homePage.getLogonButton());
        waitUntil(2);
        click(homePage.getLogonButton(),1);
    }

    @Then("insert username")
    public void insertUsername() {
        waitUntil(3);
        sendKey(loginPage.getUsernameField(), getData(USERNAME).toString());
    }

    @Then("insert password")
    public void insertPassword() {
        waitUntil(3);
        sendKey(loginPage.getPasswordField(), getData(PASSWORD).toString());
    }
}
