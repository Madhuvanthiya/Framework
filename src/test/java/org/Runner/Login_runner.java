package org.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/java/Features/login.feature"},
		   dryRun = !true,
	        glue= {"org.Step","org.Hooks"},
	        snippets = SnippetType.CAMELCASE,
	        monochrome = true,
	        plugin = {
	        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	         )


public class Login_runner {

}
