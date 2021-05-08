package starter.Message;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoMessage implements Task {

    private  final String email;
    private  final String message;

    public DoMessage(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public static Performable withData(String email, String message){
        return instrumented (DoMessage.class, email, message);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Customer service").from(MessageForm.MESSAGE_SELECTOR),
                Enter.theValue(email).into(MessageForm.EMAIL_FIELD),
                Enter.theValue(message).into(MessageForm.MESSAGE_TEXTAREA),
                Click.on(MessageForm.LOGIN_BUTTON)


        );

    }
}
