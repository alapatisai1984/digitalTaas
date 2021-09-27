Feature: Adding iPhone to cart
 
  Scenario Outline: Adding <iphone> to cart
    Given I am on amazon landing page
    When I search iPhone <iphone>
    Then Add to cart
    
    | iphone  | 
    | iphone 12 256|
    | iphone 11|