package upskill.amazon.pageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.amazon.pageElements.AmazonHomepageLocators;
import upskill.amazon.pageElements.AmazonSearchResultLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class AmazonSearchResultActions {

	AmazonSearchResultLocators AmazonSearchResultLocatorsObj;


	public AmazonSearchResultActions() {
		AmazonSearchResultLocatorsObj = new AmazonSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonSearchResultLocatorsObj);
		
	}
//------Ama-01-Shoes
	public void verifyShoes(){
	AmazonSearchResultLocatorsObj.txtShoes.isDisplayed();
	
	}
//------Ama-02-BrandOutline
	public void filterBrand(String brand){
		if(brand.equals("Adidas")){
		AmazonSearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if(brand.equals("Under Armour")){
			AmazonSearchResultLocatorsObj.cbxBrandUnderArmour.click();
		} else if(brand.equals("Hanes")){
			AmazonSearchResultLocatorsObj.cbxBrandHanes.click();
		} else {
		System.out.println(" Brand not found, please implement");
		}
		}	

	public void verifyBrandItems(String brand){
		if(brand.equals("Adidas")){
			AmazonSearchResultLocatorsObj.txtShoes.isDisplayed();
			} else if(brand.equals("Under Armour")){
				AmazonSearchResultLocatorsObj.txtShirts.isDisplayed();
			} else if(brand.equals("Hanes")){
				AmazonSearchResultLocatorsObj.txtPants.isDisplayed();
			} else {
			System.out.println(" Brand not found, please implement");
			}
	}
	public void selectShirt(){
		AmazonSearchResultLocatorsObj.linkShirt.click();
	}

//------Ama-06-SignIn
	public void enterEmailPhone(){
		AmazonSearchResultLocatorsObj.linkUserID.sendKeys("imtiaz.anu@gmail.com");
	}
	public void clickContinue(){
		AmazonSearchResultLocatorsObj.btnContinue.click();
	}
	public void enterPassword(){
		AmazonSearchResultLocatorsObj.linkPassword.sendKeys("abcd");
	}
	public void clickSignIn(){
		AmazonSearchResultLocatorsObj.clickSignIn.click();
	}
	public void signInHomepage(){
		AmazonSearchResultLocatorsObj.appHomepage.isDisplayed();
	}

//------Ama-08-LogoClickable
	public void verifyLaptop(){
		AmazonSearchResultLocatorsObj.vfyLaptop.isDisplayed();	
	}
	public void clickLogo(){
		AmazonSearchResultLocatorsObj.btnLogo.click();
	}
		
//------Ama-10-Career
	public void searchJob() throws Exception {
		AmazonSearchResultLocatorsObj.txtJobSearch.sendKeys(ReadExcelSheet.getMapData("AmaCareer-01"));
		Thread.sleep(2000);
		}	
	public void searchLocation() throws Exception{
		AmazonSearchResultLocatorsObj.txtJobLocation.sendKeys(ReadExcelSheet.getMapData("AmaCareer-02"));
		Thread.sleep(2000);
	}
	public void clickJobSearch() throws Exception {
		AmazonSearchResultLocatorsObj.btnJobSearch.click();	
		Thread.sleep(2000);
	}
	public void jobSearchPage(){
		AmazonSearchResultLocatorsObj.jobHomepage.isDisplayed();
	}
}
