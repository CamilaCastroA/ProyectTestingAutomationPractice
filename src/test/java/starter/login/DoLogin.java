package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {


    private final String email;
    private final String passwd;

    public DoLogin(String email, String passwd) {
        this.email = email;
        this.passwd = passwd;
    }

    public static Performable withCredentials (String username, String password){
        return  instrumented (DoLogin.class, username, password);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginForm.USERNAME_FIELD),
                Enter.theValue(passwd).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)

        );
    }
}
