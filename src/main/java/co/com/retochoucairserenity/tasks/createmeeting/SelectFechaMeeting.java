package co.com.retochoucairserenity.tasks.createmeeting;

import co.com.retochoucairserenity.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.retochoucairserenity.userinterface.createmeetinguser.SelectFechaMeetingUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFechaMeeting implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INITIAL_DATE),
                Click.on(SELECT_INITIAL_DAY),
                Click.on(FINAL_DATE),
                Click.on(SELECT_FINAL_DAY),
                Click.on(SELECT_INITIAL_DHOUR),
                SelectFromOptions.byVisibleText("10:00").from(SELECT_INITIAL_DHOUR),
                Click.on(SELECT_FINAL_HOUR),
                SelectFromOptions.byVisibleText("14:00").from(SELECT_FINAL_HOUR),
                Wait.unTiempo(2000)
        );
    }
    public static SelectFechaMeeting enPagina() {
        return instrumented(SelectFechaMeeting.class);}

}


