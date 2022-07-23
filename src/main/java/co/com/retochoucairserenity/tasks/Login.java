package co.com.retochoucairserenity.tasks;

import co.com.retochoucairserenity.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucairserenity.userinterface.CreateNewBusinessUser.BOX_PASS;
import static co.com.retochoucairserenity.userinterface.CreateNewBusinessUser.BOX_USER;
import static co.com.retochoucairserenity.userinterface.CreateNewBusinessUser.BTN_SIGN_IN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {


    private final String usuario;
    private final String clave;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOX_USER),
                Enter.theValue(usuario).into(BOX_USER),
                Click.on(BOX_PASS),
                Enter.theValue(clave).into(BOX_PASS),
                Click.on(BTN_SIGN_IN),
                Wait.unTiempo(2000));

    }

    public static Login enPagina(String usuario, String clave) {
        return instrumented(Login.class, usuario, clave);
    }

}
