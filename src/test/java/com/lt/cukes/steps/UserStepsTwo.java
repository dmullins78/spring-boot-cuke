package com.lt.cukes.steps;

import com.lt.cukes.World;
import com.lt.cukes.java.User;
import com.lt.cukes.java.UserRepository;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserStepsTwo {

    @Autowired
    World world;


    @Then("^the service should return a (\\d+) status code$")
    public void theServiceShouldReturnAStatusCode(int expectedStatus) throws Throwable {
        assertEquals(world.statusCode, expectedStatus);
    }


    @Then("^the service should return:$")
    public void theServiceShouldReturn(String expected) throws Throwable {
        String actual = world.response;

        JSONAssert.assertEquals(expected, actual, true);
    }

}
