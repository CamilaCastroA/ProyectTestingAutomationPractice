package starter.Validate;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import starter.Message.DoMessage;
import starter.Message.MessageForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoValidate implements Task {

    private  final String email;

    public DoValidate(String email) {
        this.email = email;

    }

    public static Performable withEmail(String email){

        return instrumented (DoValidate.class, email);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(email).into(ValidateForm.EMAIL_FIELD),
                Click.on(ValidateForm.REGISTER_BUTTON)


        );
    }
}
