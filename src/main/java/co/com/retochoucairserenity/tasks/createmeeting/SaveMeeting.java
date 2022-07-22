package co.com.retochoucairserenity.tasks.createmeeting;

import co.com.retochoucairserenity.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.retochoucairserenity.userinterface.createmeetinguser.SaveMeetingUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaveMeeting implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ORGANIZED_BY),
                Click.on(BOX_TITLE),
                Enter.theValue("Reunión11").into(BOX_TITLE),
                Click.on(BOX_FIRST_NAME),
                Enter.theValue("David").into(BOX_FIRST_NAME),
                Click.on(BOX_LAST_NAME),
                Enter.theValue("Caraballo").into(BOX_LAST_NAME),
                Click.on(BOX_EMAIL),
                Enter.theValue("jd.caraballoo@gmail.com").into(BOX_EMAIL),
                Click.on(BOX_IDENTITY),
                Enter.theValue("123456789").into(BOX_IDENTITY),
                Click.on(LIST_USERY),
                Hit.the(Keys.ARROW_DOWN).into(LIST_USERY),
                Hit.the(Keys.ARROW_DOWN).into(LIST_USERY),
                Hit.the(Keys.ENTER).into(LIST_USERY),
                Click.on(BTN_SAVE),

                Esperar.unTiempo(2000)
        );
    }
    public static SaveMeeting enPagina() {
        return instrumented(SaveMeeting.class);}

}


