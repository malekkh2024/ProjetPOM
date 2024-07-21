package stepdefinition;



import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Produits;



public class Products {
	
	WebDriver driver= SetUp.driver;
	 Produits products = new Produits(driver);

	@Given("cliquer sur boutton products")
	public void cliquer_sur_boutton_products() {
		products.cliquer_sur_boutton_products();
	}
	

	    
	@When("cliquer sur add to cart {string}")
     public void cliquer_sur_add_to_cart(String string) { 
     products.BlueTop(string);;
       
	
	    }  

	@When("appuyer_sur_continue_shopping")
	public void appuyer_sur_continue_shopping() {
	    products.appuyer_sur_continue_shopping();
	}
	@When("cliquer_sur_add_to_cart1")
	public void cliquer_sur_add_to_cart1(String MenTishrt) {
	  products.MenTishrt(MenTishrt);
	}
	
	@When("Continue_Shopping")
	public void Continue_Shopping(){
	   products.Continue_Shopping();
	}  
	@When("cliquer sur view cart")
	public void cliquer_sur_view_cart() {
	 products.cliquuer_sur_view_cart();   
	}
	

	@When("proceed_to_cheeck_out")
	public void proceed_to_cheeck_out() {
	products.proceed_to_cheeck_out();
	}
	@Then("place_order")
	public void cliquer_sur_place_order() {
	   products.place_order();
	}
	}
	






