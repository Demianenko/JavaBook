package stepsDefenitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by Sega on 24.01.2017.
 */
public class Steps {
    @Given("I have deposited \\$(\\d+) in my (\\w+) Account")
    public void iHaveDeposited$InMyAccount(int amount, String accountType) {
// TODO: code goes here
    }
    @When("")
    public void iTransferred(int amount, String accountTypeFrom, String accountTypeTo){
        //TODO : code goes here
    }
}
