package co.com.retochoucairserenity.tasks;

import co.com.retochoucairserenity.interactions.Esperar;
import co.com.retochoucairserenity.interactions.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retochoucairserenity.userinterface.CreateNewBusinessUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateBusiness implements Task {
    private final String nameBusiness;

    public CreateBusiness(String nameBusiness) {
        this.nameBusiness = nameBusiness;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MEN_ORGANIZATION),
                Click.on(MEN_BUSINESS_UNITS),
                Click.on(MEN_CREATE_BUSINESS_UNITS),
                Click.on(BOX_NAME_BUSINESS),
                EsperarElemento.esClickable(BOX_NAME_BUSINESS),
                Enter.theValue(nameBusiness).into(BOX_NAME_BUSINESS),
                Click.on(BTN_SAVE_BUSINESS),
                Esperar.unTiempo(2000)
        );

    }
    public static CreateBusiness enPagina(String nameBusiness) {
        return instrumented(CreateBusiness.class, nameBusiness);
    }
}
