package com.tyltest.solution;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                plugin = {"pretty", "html:target/cucumber"},
                tags = {"@test"},
                features = {"src/test/resources"})
public class TestRunner {

}
