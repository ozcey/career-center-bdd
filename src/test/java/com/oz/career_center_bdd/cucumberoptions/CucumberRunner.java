package com.oz.career_center_bdd.cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com/oz/career_center_bdd/stepdefinitions"},
        tags = "@run"
)
public class CucumberRunner {

}
