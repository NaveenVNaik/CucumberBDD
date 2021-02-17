package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

    @Given("^User is on net banking landing page$")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("inside user_is_on_net_banking_landing_page");
    }

    @When("^User login into application with Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2){
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() {
    	System.out.println("home_page_is_displayed");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1){
    	System.out.println(strArg1);
    }

}