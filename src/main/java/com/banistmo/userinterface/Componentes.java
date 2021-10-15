package com.banistmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")

public class Componentes extends PageObject {
    public static final Target ACERCA_NOSOTROS = Target.the("acerca de nosotros ").locatedBy("//a[text()='Acerca de nosotros']");
    public static final Target INFORMACION_COORPORATIVA = Target.the("informacion").locatedBy("//a[text()='Información Corporativa']");
    public static final Target SOSTENIBILIDAD = Target.the("sostenibilidad").locatedBy("//a[text()='Sostenibilidad']");
    public static final Target GENERACION = Target.the("generacion").locatedBy("//a[text()='Generación Sostenible']");

}
