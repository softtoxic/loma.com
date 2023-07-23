
Feature: Verify the product cart
  As a user I want verify the product cart


  Scenario : User should Verify the product filter by name and price
    Given I am on home page
    When I mouse hoover on women
    And I mouse hoover on Tops
    And I click on Jackets
    And I select sort by filter "Product Name"
    Then I should see the products are sorted by product name
    And I select sort filter "price"
    Then I should see the products are sorted by filter Price






