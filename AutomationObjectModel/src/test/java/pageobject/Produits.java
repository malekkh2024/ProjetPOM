package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Produits {
	WebDriver driver;
	//constructeur
	
	   public Produits(WebDriver driver) {
		this.driver=driver;{  
		PageFactory.initElements(driver, this);	
		}	
		
	}

@FindBy (xpath = "//a[@href='/products' and contains(., 'Products')]")
 public WebElement Products;

@FindBy (xpath ="//a[@data-product-id='1' and @class='btn btn-default add-to-cart' and contains(., 'Add to cart')]")
public WebElement BlueTop;

@FindBy(xpath ="//button[normalize-space()='Continue Shopping']")
public WebElement Continue_Shopping;

@FindBy (xpath ="//a@[data-product-id='2']")
public WebElement MenTishrt;

@FindBy (xpath ="//u[text()='View Cart']")
public WebElement view_cart;

@FindBy (xpath ="//a[normalize-space()='Proceed To Checkout']")
public WebElement proceed_to_cheeck_out;

@FindBy (xpath ="//a[normalize-space()='Place Order']")
public WebElement place_order;

@FindBy (xpath ="//input[@name='name_on_card']")
public WebElement Name_onCard; 

@FindBy (xpath ="//input[@name='card_number']")
public WebElement CardNumber;

@FindBy (xpath ="//input[@placeholder='ex. 311']")
public WebElement CVC;

@FindBy (xpath ="//input[@placeholder='MM']")
public WebElement month;

@FindBy (xpath ="//input[@placeholder='YYYY']")
public WebElement year;

@FindBy (xpath ="//button[@id='submit']")
public WebElement Pay_and_Confirm_Order ; 

	  
 
  //creation




public void cliquer_sur_boutton_products() {
	Products.click();
}
  public void BlueTop(String string) {
	  BlueTop.click();
	  
	  
  }
  public void  appuyer_sur_continue_shopping() {
	  Continue_Shopping.click();
	  
  }
  public void MenTishrt(String string) {
	  MenTishrt.click();
  }

public void  Continue_Shopping() {
	  Continue_Shopping.click();
}	  
  public void cliquuer_sur_view_cart() {
	  view_cart.click();
	  
  }
  public void proceed_to_cheeck_out() {
	  proceed_to_cheeck_out.click();
  }
  public void place_order() {
	  place_order.click();
	  
  }
  public void taper2(String string) {
	  Name_onCard.sendKeys(string);
	  
  }
  public void taper1(String string) {
	  CardNumber.sendKeys(string);
  }
  public void  tappper(String string) {
	  month.sendKeys(string);
  }
  public void t_aper(String string) {
	  year.sendKeys(string);
  }
  public void tapper(String string) {
	  CVC.sendKeys(string);
	 
  }
           public void  Pay() {
  Pay_and_Confirm_Order.click();
           }
}



