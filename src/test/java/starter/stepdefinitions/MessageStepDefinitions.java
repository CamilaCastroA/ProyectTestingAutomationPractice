package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.yecht.Data;
import starter.Message.DoMessage;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class MessageStepDefinitions {
    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has an email")
    public void has_an_email(String name) {

        this.name=name;
    }

    @When("he send message data")
    public void he_send_message_data() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theNavegatetoMessage(),
                DoMessage.withData("camilacastro9713@gmail.com","mensaje")

        );

    }

    @Then("send message successfully")
    public void send_message_successfully() {

    }

}
