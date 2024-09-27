package co.com.siigo.certificacion.moduloprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionUI {
    public static final Target NOMBRE_SHADOW_CORREO = Target.the("Ingresa correo ")
            .locatedBy("#username");
    public static final Target BTN_INICIAR_SESION = Target.the("Iniciar Sesion")
            .located(By.id("login-submit"));
}
