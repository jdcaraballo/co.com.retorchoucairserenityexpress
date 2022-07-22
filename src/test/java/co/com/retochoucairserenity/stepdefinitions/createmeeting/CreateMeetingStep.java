package co.com.retochoucairserenity.stepdefinitions.createmeeting;


import co.com.retochoucairserenity.interactions.HomePage;
import co.com.retochoucairserenity.questions.ValidaCreateMeeting;
import co.com.retochoucairserenity.tasks.createmeeting.*;
import co.com.retochoucairserenity.tasks.Login;
import cucumber.api.java.en.*;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


public class CreateMeetingStep {

    @Given("^que (.*) abre la pagina con usuario: (.*) y la clave: (.*)$")
    public void queDavidAbreLaPagina(String actor, String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina()
        );
    OnStage.theActorInTheSpotlight().attemptsTo(
            Login.enPagina(usuario, clave));

    }
    @When("^el agenda una reunion (.*), (.*), (.*)$")
    public void newBusiness (String meetingName, String meetingNumber, String meetingType) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            CreateMeeting.enPagina(meetingName, meetingNumber, meetingType)
    );
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectFechaMeeting.enPagina()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                LocationMeeting.enPagina()
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                SaveMeeting.enPagina()
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                SaveUnit.enPagina()
        );

    }

    @Then("^el puede verlo en Business Meet$")
    public void verBusinessMeet() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidaCreateMeeting.exitosa()));


    }



}
