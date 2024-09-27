package co.com.siigo.certificacion.moduloprueba.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPrincipalUI {
    public static final String BTN_CREAR = " document.querySelector('#layout-navbar > header-root > generalheader > siigo-header-molecule')"
            + ".shadowRoot"
            + ".querySelector('[id*=wc-] > header > nav > div > div:nth-child(2) > ul > li:nth-child(5) > siigo-button-atom')"
            + ".shadowRoot"
            + ".querySelector('[id*=wc-] > div > button');";
    public static final String LBL_CREAR_CLIENTE = "document.querySelector('#layout-navbar > header-root > generalheader > siigo-header-molecule').shadowRoot.querySelector('[id*=wc-] > header > nav > div > div:nth-child(2) > ul > li:nth-child(5) > siigo-header-create-button-dropdown > div > div.content-create-items.content-create-items-title-hidden.content-create-items-open > div:nth-child(1) > li:nth-child(4) > div > a')";
    public static final Target LBL_BARRA_SUPERIOR = Target.the("Barra superior").located(By.id("navbar-container"));
}
