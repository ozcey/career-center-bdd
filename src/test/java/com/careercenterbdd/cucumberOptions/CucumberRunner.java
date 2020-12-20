package com.careercenterbdd.cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.careercenterbdd.stepDefinitions"},
        tags = {"@Run"},
        strict = true
)
public class CucumberRunner {
}
