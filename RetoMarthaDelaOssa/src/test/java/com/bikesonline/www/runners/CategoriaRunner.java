package com.bikesonline.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.bikesonline.www.features/categoria.feature",
        glue="com.bikesonline.www.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)
public class CategoriaRunner {
}
