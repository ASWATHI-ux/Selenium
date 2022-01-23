package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature",glue="steps")
//@CucumberOptions(dryRun=false)
public class run1 {

}
