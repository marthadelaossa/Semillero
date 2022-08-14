package com.bikesonline.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.bikesonline.www.features/busquedaExcel.feature",
        glue="com.bikesonline.www.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)
public class BusquedaExcelRunner {

}
