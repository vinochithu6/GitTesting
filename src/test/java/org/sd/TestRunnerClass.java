package org.sd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.sd",monochrome = true,dryRun = false,snippets = SnippetType.UNDERSCORE,plugin = {"html.Report"})
public class TestRunnerClass {
	

}
