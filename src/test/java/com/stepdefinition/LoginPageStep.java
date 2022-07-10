package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Given("User is on Adactin Login page")
	public void userIsOnAdactinLoginPage() throws FileNotFoundException, IOException {
		
	}

	@When("User should login {string} and {string}")
	public void userShouldLoginAnd(String userName, String password) throws InterruptedException {

		pom.getLoginPage().login(userName, password);
	
	
	}
	

	@Then("User should login with the help of enter key {string} and {string}")
	public void userShouldLoginWithTheHelpOfEnterKeyAnd(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(userName, password);
	}

	@Then("User should verify Login error message that contains {string}")
	public void userShouldVerifyLoginErrorMessageThatContains(String expected) {
		pom.getLoginPage().login();
		String actual = getText(pom.getLoginPage().getTxtInvalidmsg());
		Assert.assertTrue("Verify Invalid msg", actual.contains(expected));
		System.out.println(actual);
}
}
