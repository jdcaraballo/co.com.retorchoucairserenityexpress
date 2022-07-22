package co.com.retochoucairserenity.stepdefinitions.createbusiness;


import co.com.retochoucairserenity.interactions.HomePage;
import co.com.retochoucairserenity.questions.ValidaCreateBusiness;
import co.com.retochoucairserenity.tasks.CreateBusiness;
import co.com.retochoucairserenity.tasks.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


public class CreateBusinessStep {

    @Given("^que (.*) abre la pagina con usuario: (.*) y la clave: (.*)$")
    public void queDavidAbreLaPagina(String actor, String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina()
        );
    OnStage.theActorInTheSpotlight().attemptsTo(
            Login.enPagina(usuario, clave));

    }
    @When("^el crea un new business con el nombre de: (.*)$")
    public void newBusiness (String nameBusiness) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            CreateBusiness.enPagina(nameBusiness)
    );
    }

    @Then("^el puede verlo en Business Units$")
    public void verBusinessUnits() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidaCreateBusiness.exitosa()));


    }



}
