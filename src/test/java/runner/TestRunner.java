package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(       
	
	features=".",
	glue= {"stepDefS"},
	plugin={"pretty"}
	
)

public class TestRunner {
	

}
