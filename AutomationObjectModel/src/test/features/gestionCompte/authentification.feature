@tag
Feature: Authentification
  Je veux m authentifier au compte

   @Authentification
  Scenario: Authentification 
    Given acceder sur URL "https://automationexercise.com/"
    When cliquer sur s inscrir  login boutton
    And ecrire mail "tesfvdsfdssqd4514df8t@test.com" et  mot de paasse "sjqcoscksqjok"
    And cliquer sur LOGINN
    Then vérifier le mode profil de l utilisateur "test" est afficher 
    
   
