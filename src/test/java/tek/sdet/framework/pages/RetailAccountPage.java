package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement profileUpdateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;
	
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressButton;
	
	@FindBy(xpath ="//select[@id='countryDropdown']")
	public WebElement countryField;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberField;
	
	@FindBy(id = "streetInput")
	public WebElement streetAddressInput; 
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement aptNumberField;
	
	@FindBy(xpath = "//input[@id='cityInput']")
	public WebElement cityField;
	
	@FindBy(xpath ="//select[@name='state']")
	public WebElement stateField;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeField;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;
	
	

}
