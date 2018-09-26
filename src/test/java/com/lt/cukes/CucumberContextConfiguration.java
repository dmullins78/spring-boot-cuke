package com.lt.cukes;

import cucumber.api.java.Before;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@AutoConfigureMockMvc
@SpringBootTest(classes = TestAppConfig.class)
public class CucumberContextConfiguration  {

    @Before
    public void setup_cucumber_spring_context(){
        // Dummy method so cucumber will recognize this class as glue and use its context configuration.
    }

}
