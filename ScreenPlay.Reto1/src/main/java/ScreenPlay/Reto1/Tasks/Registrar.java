package ScreenPlay.Reto1.Tasks;

import java.util.List;

import ScreenPlay.Reto1.Interactions.Esperar5;
import ScreenPlay.Reto1.Interactions.SeleccionarLista;
import ScreenPlay.Reto1.Model.RegistroAutomatico;
import ScreenPlay.Reto1.userInterface.IngresoFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registrar implements Task {
	
	private List<RegistroAutomatico> registroautomatico;
	
	public Registrar(List<RegistroAutomatico> registroformulario) {
	        super();
	        this.registroautomatico = registroformulario;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		 actor.attemptsTo(Enter.theValue(registroautomatico.get(0).getFirstName()).into(IngresoFormulario.PRIMER_NOMBRE));
		 actor.attemptsTo(Enter.theValue(registroautomatico.get(0).getLastName()).into(IngresoFormulario.PRIMER_APELLIDO));
		 actor.attemptsTo(Enter.theValue(registroautomatico.get(0).getAdress()).into(IngresoFormulario.DIRECCION));
		 actor.attemptsTo(Enter.theValue(registroautomatico.get(0).getEmail()).into(IngresoFormulario.CORREO));
		 actor.attemptsTo(Enter.theValue(registroautomatico.get(0).getPhone()).into(IngresoFormulario.NUMERO));
		 actor.attemptsTo(Click.on(IngresoFormulario.GENERO));
		 actor.attemptsTo(Click.on(IngresoFormulario.HOBBIES));
		 actor.attemptsTo(Click.on(IngresoFormulario.LENGUAJES));
		 actor.attemptsTo(SeleccionarLista.Desde(IngresoFormulario.LENGUAJES2, registroautomatico.get(0).getLanguages().trim()));
		 actor.attemptsTo(Click.on(IngresoFormulario.CLICK_VACIO));
		 actor.attemptsTo(SelectFromOptions.byVisibleText(registroautomatico.get(0).getSkills()).from(IngresoFormulario.FORTALEZAS));
		 actor.attemptsTo(SelectFromOptions.byVisibleText(registroautomatico.get(0).getCountry()).from(IngresoFormulario.PAIS));
		 actor.attemptsTo(Click.on(IngresoFormulario.SELECCIONAR_PAIS));
		 actor.attemptsTo(SeleccionarLista.Desde(IngresoFormulario.SELECCIONAR_PAIS2, registroautomatico.get(0).getSelecttCountry().trim()));
		 actor.attemptsTo(SelectFromOptions.byVisibleText(registroautomatico.get(0).getYear()).from(IngresoFormulario.AÑO));
		 actor.attemptsTo(SelectFromOptions.byVisibleText(registroautomatico.get(0).getMont()).from(IngresoFormulario.MES));
		 actor.attemptsTo(SelectFromOptions.byVisibleText(registroautomatico.get(0).getDay()).from(IngresoFormulario.DIA));
		 actor.attemptsTo(Enter.theValue(registroautomatico.get(0).getPassword()).into(IngresoFormulario.CONTRASEÑA));
		 actor.attemptsTo(Enter.theValue(registroautomatico.get(0).getComPassword()).into(IngresoFormulario.CONFIRMAR_CONTRASEÑA));
		 actor.attemptsTo(Click.on(IngresoFormulario.BOTON_INGRESAR));
		 actor.attemptsTo(Esperar5.aMoment());		
	}

	public static Registrar datos(List<RegistroAutomatico> registroAuto) {
		return Tasks.instrumented(Registrar.class, registroAuto);
	}
}