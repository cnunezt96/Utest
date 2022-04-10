package utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest.model.UtestDatos;
import utest.questions.Responder;
import utest.tasks.*;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Camio quiere registrarse en Utest$")
    public void camioQuiereRegistrarseEnUtest() {
        OnStage.theActorCalled("Camilo").wasAbleTo(Abrir.pagina());

    }


    @When("^El usuario ingresa los datos requeridos por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistema(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.pagina(datos),LlenarDireccion.pagina(datos),
        LlenarDispositivos.pagina(datos),LlenarFinal.pagina(datos)
        );

    }

    @Then("^El registro se completa al ver el boton de Complete Setup$")
    public void elRegistroSeCompletaAlVerElBotonDeCompleteSetup(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(datos)));

    }



}
