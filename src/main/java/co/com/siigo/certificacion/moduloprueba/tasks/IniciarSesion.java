package co.com.siigo.certificacion.moduloprueba.tasks;

import co.com.siigo.certificacion.moduloprueba.userinterfaces.InicioSesionUI;
import co.com.siigo.certificacion.moduloprueba.userinterfaces.MenuPrincipalUI;
import co.com.siigo.certificacion.moduloprueba.utils.Util;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class IniciarSesion implements Task {

    Util util= new Util();
    public static IniciarSesion con() {
        return Instrumented.instanceOf(IniciarSesion.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                WaitUntil.the(InicioSesionUI.NOMBRE_SHADOW_CORREO, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds()
        );
        util.escribirShadow("admin@siigoautomationqa.com", "#username", "#username-input");
        util.escribirShadow("(#T0Nu@QrO","#current-password", "#password-input");
        t.attemptsTo(
                Click.on(InicioSesionUI.BTN_INICIAR_SESION)
        );

        util.clickParaElementoDentroDeShadow(MenuPrincipalUI.BTN_CREAR);
        util.clickParaElementoDentroDeShadow(MenuPrincipalUI.LBL_CREAR_CLIENTE);
        System.out.println("LLEGÓ");
    }
}
