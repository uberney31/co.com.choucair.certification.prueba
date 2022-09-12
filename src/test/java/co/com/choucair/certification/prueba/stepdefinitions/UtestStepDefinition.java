
package co.com.choucair.certification.prueba.stepdefinitions;

import co.com.choucair.certification.prueba.model.Utest_Datos;
import co.com.choucair.certification.prueba.tasks.AbrirPagina;
import co.com.choucair.certification.prueba.tasks.LlenarPaginaDireccion;
import co.com.choucair.certification.prueba.tasks.LlenarPaginaInfopersonal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinition {
    @Managed(driver="chrome")
    private WebDriver navegador;
    private Actor actor= Actor.named("Uberney");
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Se requiere registarse en la pagina de utest$")
    public void seRequiereRegistarseEnLaPaginaDeUtest() {
       theActorCalled("Uberney").wasAbleTo(AbrirPagina.laPagina());
    }


    @When("^ingresa toda la informacion necesaria$")
    public void ingresaTodaLaInformacionNecesaria(List<Utest_Datos> datos) {
        theActorInTheSpotlight().attemptsTo(LlenarPaginaInfopersonal.laPagina(datos), LlenarPaginaDireccion.laPagina(datos));
    }

    @Then("^se completa el registro$")
    public void seCompletaElRegistro() {
    }
}
