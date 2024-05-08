package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinition {

    @Given("the user "test user" is not logged in")
    public void theUserTestUserIsNotLoggedIn() {
        System.out.println("Executing step: the user "test user" is not logged in");
    }

    @When("the user with <user_id> tries to login with their credentials")
    public void theUserWithTriesToLoginWithTheirCredentials(String user_id) {
        System.out.println("Executing step: the user with <user_id> tries to login with their credentials");
    }

    @Then("the server should return a "Session ID" indicating active session")
    public void theServerShouldReturnASessionIdIndicatingActiveSession() {
        System.out.println("Executing step: the server should return a "Session ID" indicating active session");
    }

    @And("retain the session data for subsequent requests")
    public void retainTheSessionDataForSubsequentRequests() {
        System.out.println("Executing step: retain the session data for subsequent requests");
    }

    @Given("the "Logged in" user with session <session_id>")
    public void theLoggedInUserWithSession(String session_id) {
        System.out.println("Executing step: the "Logged in" user with session <session_id>");
    }

    @When("the user attempts to add <product_ids> to the cart")
    public void theUserAttemptsToAddToTheCart(String product_ids) {
        System.out.println("Executing step: the user attempts to add <product_ids> to the cart");
    }

    @Then("the server should check for inventory")
    public void theServerShouldCheckForInventory() {
        System.out.println("Executing step: the server should check for inventory");
    }

    @And("notify the user about unavailable items")
    public void notifyTheUserAboutUnavailableItems() {
        System.out.println("Executing step: notify the user about unavailable items");
    }

    @And("add available items to the cart with a proper subtotal calculation")
    public void addAvailableItemsToTheCartWithAProperSubtotalCalculation() {
        System.out.println("Executing step: add available items to the cart with a proper subtotal calculation");
    }

    @Given("the user with <user_id> has items in the cart and session <session_id>")
    public void theUserWithHasItemsInTheCartAndSession(String user_id, String session_id) {
        System.out.println("Executing step: the user with <user_id> has items in the cart and session <session_id>");
    }

    @And("the user selects <payment_method> as the payment option")
    public void theUserSelectsAsThePaymentOption(String payment_method) {
        System.out.println("Executing step: the user selects <payment_method> as the payment option");
    }

    @When("the order is confirmed and processed")
    public void theOrderIsConfirmedAndProcessed() {
        System.out.println("Executing step: the order is confirmed and processed");
    }

    @Then("the server should update order status dynamically based on payment confirmation")
    public void theServerShouldUpdateOrderStatusDynamicallyBasedOnPaymentConfirmation() {
        System.out.println("Executing step: the server should update order status dynamically based on payment confirmation");
    }

    @And("dispatch the order and reduce the inventory accordingly")
    public void dispatchTheOrderAndReduceTheInventoryAccordingly() {
        System.out.println("Executing step: dispatch the order and reduce the inventory accordingly");
    }

}
