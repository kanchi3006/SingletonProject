package StepDef;

import Utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommomStepDef {

    Helper helper = new Helper();
    @Given("User hit the site url")
    public void userHitTheSiteUrl() {
        System.out.println("in");
        helper.navigateToSite("https://google.com");
    }


    @And("user clicks on add to cart")
    public void userClicksOnAddToCart() {

    }

    @Then("product is added to cart")
    public void productIsAddedToCart() {
    }
}
