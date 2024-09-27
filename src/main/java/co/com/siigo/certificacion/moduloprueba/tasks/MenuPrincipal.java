package co.com.siigo.certificacion.moduloprueba.tasks;

import co.com.siigo.certificacion.moduloprueba.userinterfaces.MenuPrincipalUI;
import co.com.siigo.certificacion.moduloprueba.utils.Util;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.InstrumentedTask;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class MenuPrincipal implements Task {

    Util util= new Util();
    public static MenuPrincipal clientes() {
        return Instrumented.instanceOf(MenuPrincipal.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MenuPrincipalUI.LBL_BARRA_SUPERIOR, WebElementStateMatchers.isEnabled()).forNoMoreThan(20).seconds()
        );
        util.clickParaElementoDentroDeShadow(MenuPrincipalUI.BTN_CREAR);
        util.clickParaElementoDentroDeShadow(MenuPrincipalUI.LBL_CREAR_CLIENTE);
    }
}
