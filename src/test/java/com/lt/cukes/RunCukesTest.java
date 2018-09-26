package com.lt.cukes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.lt.cukes"})
@SpringBootTest(classes = {TestAppConfig.class})
public class RunCukesTest {


}
