package ScreenPlay.Reto1.Tasks;

import ScreenPlay.Reto1.userInterface.IngresoFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{
	
	private IngresoFormulario registroFormulario;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(registroFormulario));
	}
	
	public static Abrir lapaginaweb() {
		return Tasks.instrumented(Abrir.class);
	}
}