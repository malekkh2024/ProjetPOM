@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given acceder sur URL "https://automationexercise.com/"
    When cliquer sur s inscrir  login boutton
    And ecrire mail "tesfvdsfdssqd4514df8t@test.com" et  mot de paasse "sjqcoscksqjok"

  @tag1
  Scenario: Ajout produit
    Given cliquer sur boutton products
    When cliquer sur add to cart "Blue Top"
    And appuyer sur continue shopping
    And Cliquer sur add to cart "Men Tishrt"
    And cliquer sur view cart
    And cliquer sur proceed to cheeck out
    
