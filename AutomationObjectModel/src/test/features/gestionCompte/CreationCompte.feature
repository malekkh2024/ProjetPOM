@Exercice  

Feature: inscription
je veux m inscrir sur le site en creant un compte 
  @creationnn 
  Scenario: Creation du compte 
    
    Given acceder sur URL "https://automationexercise.com/"
    When cliquer sur s inscrir  login boutton
    And saisir un nom "test" et taper l email  "tesfvdsfdssqd4514df8t@test.com"
    And cliquer sur login 
    And choisir MR ou MMe 
    And saisr un MDP "sjqcoscksqjok"
    And choisir la date de naissance "19" , "7" , "2000"
    And saisir un prenom "nadhir" et le nom de famille "test"  
    And saisir une adresse postale " 15 rue le roi  " 
    And choisir le pays "India"
    And saisr l etat " tunis "
    And saisir la ville " tunis "
    And code postale " 2008"    
    And saisir numero de portable " 20525452 "
    And cliquer sur creation du compte
   Then Verification que le message "ACCOUNT CREATED!" est affiche

 