package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {


    @Given("^User is on the Facebook landing page$")
    public void user_is_on_the_facebook_landing_page() throws Throwable {
        System.out.println("User is on the landing page");
    }

    @When("^User logs into the application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_into_the_application_with_and(String arg1, String arg2) throws Throwable {
    	System.out.println(arg1 +" is trying to log into Facebook with password "+arg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("User has logged into Facebook");  
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("User profile is displaying properly");
    }

}