package co.com.retochoucairserenity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/createmeeting.feature",
        glue = "co.com.retochoucairserenity.stepdefinitions.createmeeting",
        snippets = SnippetType.CAMELCASE
)
public class CreateMeetingR {
}
