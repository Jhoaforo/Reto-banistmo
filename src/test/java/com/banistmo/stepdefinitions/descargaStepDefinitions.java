package com.banistmo.stepdefinitions;

import com.banistmo.task.menu;
import com.banistmo.userinterface.Componentes;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class descargaStepDefinitions {

    private Componentes pagina;

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }

    @Dado("^Usuario intenta abrir la pagina$")
    public void usuario_intenta_abrir_la_pagina(){
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );
    }

    @Cuando("^busca la informacion$")
    public void buscaLaInformacion() {
        theActorInTheSpotlight().attemptsTo(menu.darClick());

    }

    @Entonces("^deberia ver la descarga del archivo$")
    public void deberiaVerLaDescargaDelArchivo() {

    }

    }




