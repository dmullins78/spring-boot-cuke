package com.lt.cukes.steps;

import com.lt.cukes.World;
import com.lt.cukes.java.User;
import com.lt.cukes.java.UserRepository;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserStepsOne {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    World world;

    @Autowired
    UserRepository userRepository;

    @Given("^a user \"([^\"]*)\" with id (\\d+) exists$")
    public void aUserWithId(String name, long id) throws Throwable {
        world.id = id;
        userRepository.saveUser(new User(id, name));
    }


    @When("I get a user with that id")
    public void i_get_a_user_with_that_id() throws Exception {
        MockHttpServletResponse response = mockMvc
                .perform(get("/users/" + world.id))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse();

        world.statusCode = response.getStatus();
        world.response = response.getContentAsString();
    }

}
