package co.com.retochoucairserenity.tasks.createmeeting;

import co.com.retochoucairserenity.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.retochoucairserenity.userinterface.createmeetinguser.SaveMeetingUser.*;
import static co.com.retochoucairserenity.userinterface.createmeetinguser.SaveUnitUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaveUnit implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOX_UNIT),
                Click.on(BOX_UNIT_NAME),
                Enter.theValue("Reunión0001").into(BOX_UNIT_NAME),

                Click.on(BTN_SAVE_UNIT),

                Click.on(BTN_SAVE_WHOLE_MEET),



                Esperar.unTiempo(2000)


        );
    }
    public static SaveUnit enPagina() {
        return instrumented(SaveUnit.class);}

}


