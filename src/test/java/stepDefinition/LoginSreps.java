package stepDefinition;

import Util.HighlightElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Getter;
import org.junit.Assert;

import static Actions.Action.*;
import static Util.HighlightElement.highlightElement;
import static Util.WaitUntil.waitUntil;

@Getter
public class LoginSreps extends AbstractStepDef {
    @Given("user insert username")
    public void UserInsertUsername() throws InterruptedException {
        navigate(loginPageUrl, driver);
        Thread.sleep(3000);
        sendKey(loginPage.getUsernameField(), "Admin");

    }

    @And("user insert password")
    public void UserInsertPassword() throws InterruptedException {
        Thread.sleep(3000);
        sendKey(loginPage.getPasswordField(), "admin123");

    }

    @When("user clicks on Login button")
    public void userClicksOnLoginButton() {
        click(loginPage.getSubmitButton(), 2);
    }

    @Then("user is redirect to homepage")
    public void userIsRedirectToHomePage()  throws InterruptedException {
        waitUntil(3);
        highlightElement(homePage.getDashboardSing());
        Assert.assertEquals("Dashboard", homePage.getDashboardSing().getText());

    }

}
