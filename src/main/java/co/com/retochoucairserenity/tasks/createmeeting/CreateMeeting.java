package co.com.retochoucairserenity.tasks.createmeeting;

import co.com.retochoucairserenity.interactions.Esperar;
import co.com.retochoucairserenity.interactions.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.retochoucairserenity.userinterface.createmeetinguser.CreateMeetingUser.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;



public class CreateMeeting implements Task {

    private final String meetingName;
    private final String meetingNumber;
    private final String meetingType;


    public CreateMeeting(String meetingName, String meetingNumber, String meetingType) {
        this.meetingName = meetingName;
        this.meetingNumber = meetingNumber;
        this.meetingType = meetingType;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_MEETING),
                Click.on(OPC_MEETINGS),
                Click.on(BTN_NEW_MEET),
                EsperarElemento.esClickable(BOX_MEETING_NAME),
                Click.on(BOX_MEETING_NAME),
                Enter.theValue(meetingName).into(BOX_MEETING_NAME),
                Click.on(BOX_MEETING_NUMBER),
                Esperar.unTiempo(2000),

                Enter.theValue(meetingNumber).into(BOX_MEETING_NUMBER),                EsperarElemento.esClickable(BOX_MEETING_TYPE),
//                Click.on(BOX_MEETING_TYPE0),
                Esperar.unTiempo(2000),
                Click.on(BOX_EDIT_MEETING_TYPE),

                Click.on(BTN_SAVE_MEETING_TYPE),


                Esperar.unTiempo(2000),


                Esperar.unTiempo(2000)
        );

    }
    public static CreateMeeting enPagina(String meetingName, String meetingNumber, String meetingType) {
        return instrumented(CreateMeeting.class, meetingName, meetingNumber,meetingType);
    }


}
