package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
		@CucumberOptions(
				features= {"C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\src\\test\\resources\\Feature\\FundTransfer.feature"},
				glue="stepdef2",
			    plugin = {"pretty","html:target/cucumber-reports"}
				)	


		public class Runnerclass_FT 
	{
			

	}

