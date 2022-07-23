package co.com.retochoucairserenity.tasks.createmeeting;

import co.com.retochoucairserenity.interactions.Wait;
import co.com.retochoucairserenity.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.retochoucairserenity.userinterface.createmeetinguser.CreateMeetingUser.BOX_MEETING_TYPE;
import static co.com.retochoucairserenity.userinterface.createmeetinguser.LocationMeetingUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LocationMeeting implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_BOX_LOCATION),
                Click.on(BOX_EDIT_LOCATION),
                Hit.the(Keys.ARROW_DOWN).into(BOX_EDIT_LOCATION),
                Hit.the(Keys.ARROW_DOWN).into(BOX_EDIT_LOCATION),
                Hit.the(Keys.ENTER).into(BOX_EDIT_LOCATION),
                Click.on(LIST_EDIT_LOCATION),
                Click.on(BOX_EDIT_NAME_LOCATION),
                Enter.theValue("Principal").into(BOX_EDIT_NAME_LOCATION),                WaitElement.esClickable(BOX_MEETING_TYPE),
                Click.on(BOX_ADDRESS),
                Enter.theValue("4564123").into(BOX_ADDRESS),
                Click.on(BOX_LATITUDE),
                Enter.theValue("07625465465").into(BOX_LATITUDE),
                Click.on(BOX_LONGITUDE),
                Enter.theValue("-4653521").into(BOX_LONGITUDE),
                Click.on(BOX_LONGITUDE),
                WaitElement.esClickable(BTN_SAVE_LOCATION),
                Click.on(BTN_SAVE_LOCATION),

                Wait.unTiempo(2000)
        );
    }
    public static LocationMeeting enPagina() {
        return instrumented(LocationMeeting.class);}

}


