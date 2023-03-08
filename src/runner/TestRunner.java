package runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features",glue="stepDefinition")// Folder penyimpanan feature file

public class TestRunner {

}