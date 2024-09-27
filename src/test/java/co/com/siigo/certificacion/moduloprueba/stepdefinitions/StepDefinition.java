package co.com.siigo.certificacion.moduloprueba.stepdefinitions;

import co.com.siigo.certificacion.moduloprueba.tasks.IniciarSesion;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinition {

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }

    @Given("Inicio sesion en la plataforma de SIIGO")
    public void thisMethodIsResponsibleForParameterizingTheInstantiationOfChromedriver() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("pages.siigoUrl"));
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.con());
    }

    @Cuando("Estoy en el menu de clientes")
    public void estoyEnElMenuDeClientes() {
        
    }

    @Y("Diligencio el formulario con lo siguiente")
    public void diligencioElFormularioConLoSiguiente() {
        
    }

    @Entonces("valido la creacion del cliente")
    public void validoLaCreacionDelCliente() {
    }
}
