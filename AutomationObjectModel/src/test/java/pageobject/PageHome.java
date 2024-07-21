package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageHome {
	
	public  WebDriver driver;
	
	// creation de constructeur 
	
	    public  PageHome(WebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	// identification des elements ( design pattern )
	
	@FindBy(how=How.XPATH,using="//a[contains(@href, '/login')]") 
	
	public  WebElement bt_signupLogin;
	
    @FindBy (xpath = "//input[@data-qa='signup-name']")	
    
    public WebElement signup_name ;
    
    @FindBy (xpath = "//input[@data-qa='signup-email']")
    
    public WebElement signup_email;
    
    @FindBy (xpath = "//button[@data-qa='signup-button']")
    
    public WebElement login_boutton ;
    
    @FindBy (xpath = "//input[@id='id_gender1']")
    
    public WebElement mr; 
    
    @FindBy (xpath ="//input[@data-qa='password']")
    
    public WebElement mdp ; 
    
    @FindBy (xpath ="//select[@data-qa='days']")
    
    public WebElement jour ; 
    
    @FindBy (xpath ="//select[@data-qa='months']")
    
    public WebElement mois ; 
    
    @FindBy (xpath ="//select[@data-qa='years']")
    
    public WebElement annee; 
    
    @FindBy (xpath ="//input[@data-qa='first_name']")
    
    public WebElement first_name;
    
    
    @FindBy (xpath = "//input[@data-qa='last_name']")
    
    public WebElement last_name ;
    
    @FindBy (id = "address1")
    
    public WebElement address1 ;
    
    @FindBy (id = "country")
    
    public WebElement country ;
    
    @FindBy (id = "state")
    
    public WebElement state ;
    
    @FindBy (id = "city")
    
    public WebElement city ;
    
    @FindBy (id = "zipcode")
    
    public WebElement zipcode ;
    
    @FindBy (id = "mobile_number")
    public WebElement mobile_number ;
    
    @FindBy (xpath = "//button[@data-qa='create-account']")
    public WebElement create_account ;
    
    @FindBy (xpath = "//b[contains(text(),'Account Created!')]") 
    public WebElement txt_compte_creer ;
    //authentification
    @FindBy(how=How.XPATH,using="//input[@data-qa='login-email']")
	public WebElement email ;
    
	@FindBy(how=How.XPATH,using="//input[@placeholder='Password']")
	public WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Login']")
	public WebElement bt_login;
	@FindBy(how=How.XPATH,using="//b[normalize-space()='test']")
	public WebElement txt_profil_affiche;
	
	
	
	
	
	//  creation des methodes 
	public void GetUrl(String url) {
		driver.get(url);
	}
    public void Cliquer_sur_bt_signlogin() {
	    bt_signupLogin.click();
    }
	    public void signup_name(String name) {
	    	signup_name.sendKeys(name);
	    	
	    }
	    public void signup_email(String email) {
	    	signup_email.sendKeys(email);
	    }
		public void login_boutton() {
			login_boutton.click();
			
		}
		public void choisir_mr_ou_mme() {
			mr.click();
		}
		public void saisr_un_mdp(String mot_depasse) {
			mdp.sendKeys(mot_depasse);
		}
		public void choisir_la_date_de_naissance(String day, String month, String year) {
			Select liste_day= new Select(jour);
			liste_day.selectByValue(day);
			
			Select liste_month = new Select(mois);
			liste_month.selectByValue(month);
			
			Select liste_annee = new Select(annee);
			liste_annee.selectByValue(year);
			
			
		}
		public void saisir_un_prenom(String prenom) {
			last_name.sendKeys(prenom);
		}
		public void saisir_un_nom(String nom) {
			
			first_name.sendKeys(nom);
			
			
			
		}
		public void saisir_une_adresse_postale(String adresse) {
			address1.sendKeys(adresse);
			
		}
		public void choisir_le_pays(String pays) {
			Select liste_pays = new Select(country);
			liste_pays.selectByValue(pays);
		    
		}
		public void saisr_l_etat(String etat) {
			state.sendKeys(etat);
		}
		public void saisir_la_ville(String ville) {
			city.sendKeys(ville);
			
		}
		public void code_postale(String code_postale) {
			zipcode.sendKeys(code_postale);
		}
		public void saisir_numero_de_portable(String tel) {
			mobile_number.sendKeys(tel);
		}
		public void cliquer_sur_creation_du_compte() {
			create_account.click();
			
		}
		public String textAffiche() {
			String txt_obtenu = txt_compte_creer.getText();
			return txt_obtenu;
			
		}
		
		public void mail_et_mdp(String mail, String mdp) {
			email.sendKeys(mail);
			Password.sendKeys(mdp);
			
		}
		public void cliquer_sur_loginn() {
			bt_login.click();
		}
		public String ProfilAffiche() {
			String txt_obtenu =txt_profil_affiche.getText();
			return txt_obtenu;
		} 
		
}

