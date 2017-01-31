package steps;

import bank.KnowsTheDomain;
import bank.Money;
import bank.Teller;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.SnippetType;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.Assert;
import transformer.MoneyConverter;



/**
 * Created by Sega on 24.01.2017.
 */

public class Steps extends AbstractTestNGCucumberTests{
    KnowsTheDomain helper = new KnowsTheDomain();
    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount)throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals(amount, helper.getMyAccount().getBalance(),"Incorrect account balance -");
    }
    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int dollars) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }
    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals(helper.getTeller().cashSlot.getContents(),dollars, "Incorrect amount dispensed -");
    }
    @Then("^the balance of my account should be \\$(\\d+)\\.(\\d+)$")
    public void theBalanceOfMyAccountShouldBe$(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
