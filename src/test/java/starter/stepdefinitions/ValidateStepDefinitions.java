package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.Message.DoMessage;
import starter.Validate.DoValidate;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ValidateStepDefinitions {
    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("(.*) has a registered email")
    public void camila_has_a_registered_email(String name) {
        this.name=name;

    }

    @When("put email")
    public void put_email() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theValidate(),
                DoValidate.withEmail("camilacastro9713@gmail.com")

        );

    }

    @Then("Do not register email again")
    public void do_not_register_email_again() {

    }
}
