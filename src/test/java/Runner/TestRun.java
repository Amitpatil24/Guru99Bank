package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
         features = "src/test/java/features/DataDrivenWithMap.feature",   // path of the feature file
         glue = {"step_definition"},                 // path of the step definition file
         monochrome = true,              // display the console output in proper readable format
         plugin ={"pretty","html:test-output.html","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},   // to generate different types of report
         dryRun = false          // it is used to correct mapping between feature file and step definition file

        //  strict = true -- it will check if any step is not defined in step definition file
)

public class TestRun {

}
