package com.banistmo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.banistmo.userinterface.Componentes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class menu implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(ACERCA_NOSOTROS,isVisible()),Click.on(ACERCA_NOSOTROS),
                Click.on(INFORMACION_COORPORATIVA),
                Click.on(SOSTENIBILIDAD),
                Scroll.to(GENERACION),
                Click.on(GENERACION));


    }
    public static menu darClick() { return instrumented(menu.class); }
}
