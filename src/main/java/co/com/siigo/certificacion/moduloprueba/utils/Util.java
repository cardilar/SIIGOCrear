package co.com.siigo.certificacion.moduloprueba.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Util extends PageObject {
    public Util(){}

    public void escribirShadow(String cadena, String idHostCSSelector, String idContentCSSelector){
        WebElement shadowHost = getDriver().findElement(By.cssSelector(idHostCSSelector));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector(idContentCSSelector));
        shadowContent.sendKeys(cadena);
    }

    public void clickParaElementoDentroDeShadow(String jsPath){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        String script = "return " + jsPath;
        WebElement button = (WebElement) js.executeScript(script);
        button.click();


    }
}