package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import static org.junit.Assert.assertTrue;

public class StepDefinitions {
    private CucumberPerson cperson;

    @Given("If I eat {int} cukes")
    public void i_have_cukes_in_my_belly(int cukes) {
        cperson = new CucumberPerson();
        if (cperson.eat(cukes) == 1) {
            assertTrue(false);
        }
    }

    @Given("If I drink {int} beers")
    public void i_have_beers_in_my_belly(int beers) {
        cperson = new CucumberPerson();
        if (cperson.drink(beers) == 1) {
            assertTrue(false);
        }
    }

    @And("I wait {int} hours")
    public void i_wait_hour(int waitTime) {
        if (cperson.wait(waitTime) == 1) {
            assertTrue(false);
        }
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        assertTrue(cperson.growl());
    }

    @Then("I will burp")
    public void i_will_burp() {
        assertTrue(cperson.burp());
    }

    @Then("I will be sick")
    public void i_will_be_sick() {
        assertTrue(!cperson.sick());
    }

    @But("I will be fine")
    public void i_will_be_fine() {
        assertTrue(!cperson.sick());
    }
}