package ScreenPlay.Reto1.StepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import ScreenPlay.Reto1.Model.RegistroAutomatico;
import ScreenPlay.Reto1.Questions.LaRespuesta;
import ScreenPlay.Reto1.Tasks.Abrir;
import ScreenPlay.Reto1.Tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class StepDefinitions {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor carlos = Actor.named("Carlos");
	
	@Before
	public void configuracionInicial() {
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que Carlos quiere acceder a la Web Automation Demo Site$")
	public void queCarlosQuiereAccederALaWebAutomationDemoSite() throws Exception {
		carlos.wasAbleTo(Abrir.lapaginaweb());
	}

	@Cuando("^el realiza el registro en la pagina$")
	public void elRealizaElRegistroEnLaPagina(List<RegistroAutomatico> automaticamente) {
		carlos.attemptsTo(Registrar.datos(automaticamente));
	}

	@Entonces("^el verifica que se carga la pantalla con texto (.*)$")
	public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(String palabraesperada)  {
		carlos.should(seeThat(LaRespuesta.es(),equalTo(palabraesperada)));
	}
}