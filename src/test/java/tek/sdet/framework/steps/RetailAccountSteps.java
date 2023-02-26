package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}

	@When("User update Name {string} and phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated name and phone Values");

	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {

		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on update button");
	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}

	@When("User click on Add Address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressButton);
		logger.info("user clicked on Add address option");
	}

	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {

		List<List<String>> addressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().countryField, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		sendText(factory.accountPage().fullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.accountPage().streetAddressInput, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.accountPage().aptNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		sendText(factory.accountPage().cityField, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateField, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		sendText(factory.accountPage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		logger.info("user filled the new address form with information provided in data table");
	}

	@When("User click Add your Address button")
	public void userClickAddYoutAddressButton() {
		click(factory.accountPage().addYourAddressButton);
		logger.info("user clicked on add your address button");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
		Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
	}

}
