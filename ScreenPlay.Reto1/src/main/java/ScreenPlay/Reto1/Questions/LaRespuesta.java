package ScreenPlay.Reto1.Questions;

import ScreenPlay.Reto1.userInterface.IngresoFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String>{
	
	public static LaRespuesta es() {
		return new LaRespuesta();
	}

	@Override
	public String answeredBy(Actor actor) {
	return Text.of(IngresoFormulario.CONFIRMAR_VERIFICAR).viewedBy(actor).asString();
	}
}