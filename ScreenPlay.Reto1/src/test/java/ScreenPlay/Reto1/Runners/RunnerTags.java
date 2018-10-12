package ScreenPlay.Reto1.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/Formulario.feature",
		tags= "@tag",
		glue="ScreenPlay.Reto1.StepDefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {
}
