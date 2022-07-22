package co.com.retochoucairserenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.retochoucairserenity.userinterface.CreateNewBusinessUser.VALIDAR_CREATE_NEW_BUSEINESS;

public class ValidaCreateBusiness implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        if(VALIDAR_CREATE_NEW_BUSEINESS.resolveFor(actor).isVisible())
            return true;
            return false;
    }

    public static ValidaCreateBusiness exitosa(){
        return new ValidaCreateBusiness();
    }
}
