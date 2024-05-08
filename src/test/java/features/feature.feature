Feature: Enhanced Testing of JMP B2B E-commerce Platform API

  Scenario: Create a new user session with complex data
    Given the user "test user" is not logged in
    When the user with <user_id> tries to login with their credentials
    Then the server should return a "Session ID" indicating active session
    And retain the session data for subsequent requests

  Scenario: Update cart by adding multiple items and check for inventory
    Given the "Logged in" user with session <session_id>
    When the user attempts to add <product_ids> to the cart
    Then the server should check for inventory
    And notify the user about unavailable items
    And add available items to the cart with a proper subtotal calculation

  Scenario: Order with multiple payment methods and simulate order fulfillment
    Given the user with <user_id> has items in the cart and session <session_id>
    And the user selects <payment_method> as the payment option
    When the order is confirmed and processed
    Then the server should update order status dynamically based on payment confirmation
    And dispatch the order and reduce the inventory accordingly
