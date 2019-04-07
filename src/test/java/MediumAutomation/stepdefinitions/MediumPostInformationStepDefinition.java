package mediumautomation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MediumPostInformationStepDefinition {

  @Managed(driver = "chrome")
  private WebDriver hisBrowser;
  private Actor katty = Actor.named("Katty");

  @Before
  public void setUp() {
    katty.can(BrowseTheWeb.with(hisBrowser));
  }

  @Given("^the medium home page loaded$")
  public void theMediumHomePageLoaded() throws Exception {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }
  
  
  @When("^I search the post stored in a excel file$")
  public void iSearchThePostStoredInAExcelFile() throws Exception {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }
  
  @Then("^the information about each post should be the same$")
  public void theInformationAboutEachPostShouldBeTheSame() throws Exception {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }

}
