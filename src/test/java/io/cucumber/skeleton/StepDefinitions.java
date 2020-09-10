package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        if ((new Belly()).eat(cukes) == 1) {
            assertTrue(false);
        }
    }

    @When("I wait {int} hour")
    public void i_wait_hour(int waitTime) {
        if ((new Belly()).wait(waitTime) == 1) {
            assertTrue(false);
        }
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        Belly belly = new Belly();
        belly.growl();
    }
}
