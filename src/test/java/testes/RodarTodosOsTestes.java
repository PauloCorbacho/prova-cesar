package testes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/"
        , glue = {""}
        , plugin = {"pretty", "html:target/site/cucumber-pretty"
})

public class RodarTodosOsTestes {
}
