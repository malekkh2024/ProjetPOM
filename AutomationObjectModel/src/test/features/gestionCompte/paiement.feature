@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given acceder sur URL "https://automationexercise.com/"
    When cliquer sur s inscrir  login boutton
    And ecrire mail "tesfvdsfdssqd4514df8t@test.com" et  mot de paasse "sjqcoscksqjok"
    Given cliquer sur boutton products
    When cliquer sur add to cart "Blue Top"
    And appuyer sur continue shopping
    And Cliquer sur add to cart "Men Tishrt"
    And cliquer sur view cart
    And cliquer sur proceed to cheeck out

  @tag2
  Scenario: paiement
    Given place order
    When saisir "<Name on Card>"
    And saisir  "<Card Number>"
    And saisir "<CVC>"
    And saisir "<month>" and "<year>"
    And cliquer sur Pay and Confirm Order
      | Name on Card  | Card Number      | CVC | month | year |
      | Tareef Hanson | 5542604706147025 | 198 |    11 |   28 |
      | Hagos Kadiev  | 5139004964686344 | 735 |    08 |   27 |
