package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/OrangeHRM.feature" , 
		glue = {"stepDefinitions"}
		
		
		)


public class CukeRunner {

}



//import org.junit.runner.RunWith;
//import cucumber.api.junit.*; 
//import cucumber.api.junit.Cucumber;
//
//
//
//
//@RunWith(Cucumber.class)
//
//@CucumberOptions
//
////(
////		
////		features = ".//Features/OrangeHRM.feature", 
////		glue = {"src/stepDefinitions"}
////		
////		
////		)



