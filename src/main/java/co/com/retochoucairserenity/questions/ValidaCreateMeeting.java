package co.com.retochoucairserenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.retochoucairserenity.userinterface.CreateNewBusinessUser.VALIDAR_CREATE_NEW_BUSEINESS;
import static co.com.retochoucairserenity.userinterface.createmeetinguser.SaveUnitUser.VALIDAR_CREATE_NEW_MEETING;

public class ValidaCreateMeeting implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        if(VALIDAR_CREATE_NEW_MEETING.resolveFor(actor).isVisible())
            return true;
            return false;
    }

    public static ValidaCreateMeeting exitosa(){
        return new ValidaCreateMeeting();
    }
}
