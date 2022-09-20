package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultLocators {

//------Ama-01-Shoes
	//Validate Shoes Items
	@FindBy (xpath="//span[contains(text(),'shoes')]")
	public WebElement txtShoes;

//------Ama-02-BrandOutline
	//Validate Shirts Items
	@FindBy (xpath="(//span[contains(text(),'shirts')])[1]")
	public WebElement txtShirts;	
	//Validate Pants Items
	@FindBy (xpath="(//span[contains(text(),'pants')])[1]")
	public WebElement txtPants;
	//Checkbox Brand Adidas
	@FindBy (xpath="//li[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
	//Checkbox Brand Nike
	@FindBy (xpath="//li[@aria-label='Under Armour']")
	public WebElement cbxBrandUnderArmour;
	//Checkbox Brand Hanes
	@FindBy (xpath="//li[@aria-label='Hanes']")
	public WebElement cbxBrandHanes;

//------Ama-03-Cart
	//Link Shirt
	@FindBy (xpath="(//span[contains(text(),'Regular-Fit Quick-Dry Golf Polo Shirt')])[1]")
	public WebElement linkShirt;
	

//------Ama-06-SignIn	
	//Enter Email or Mobile Phone 
	@FindBy (xpath="//input[@id='ap_email']")
	public WebElement linkUserID;
	//Click on Continue
	@FindBy (xpath="//input[@id='continue']")
	public WebElement btnContinue;
	//Enter Password
	@FindBy (xpath="//input[@id='ap_password']")
	public WebElement linkPassword;
	//Click Sign In
	@FindBy (xpath="//input[@id='signInSubmit']")
	public WebElement clickSignIn;
	//User Sign In and Homepage Appear
	@FindBy (xpath="//span[contains(text(),'Hello, Anu')]")
	public WebElement appHomepage;



	
//------Ama-08-LogoClickable	
	//Verify Laptop Page
	@FindBy (xpath="(//span[contains(text(),'Laptop')])[1]")
	public WebElement vfyLaptop;
	//Click on Amazon Logo	
	@FindBy (xpath="//a[@aria-label='Amazon']")
	public WebElement btnLogo;
	


//------Ama-10-Career
	//Search Job
	@FindBy (xpath="(//input[@placeholder='Search for jobs by title or keyword'])[2]")
	public WebElement txtJobSearch;	
	//Search Location
	@FindBy (xpath="(//input[@id='location-typeahead'])[2]")
	public WebElement txtJobLocation;
	//Click
	@FindBy (xpath="//button[@id='search-button']")
	public WebElement btnJobSearch;	
	//Job Search Page Appear
	@FindBy (xpath="(//div[@class='container'])[1]")
	public WebElement jobHomepage;
	
	
//	@FindBy (xpath="")
//	public WebElement abc;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	











}
