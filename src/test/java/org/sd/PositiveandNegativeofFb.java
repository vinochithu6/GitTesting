package org.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegativeofFb extends BaseClass {
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch url of the amazon application")
	public void to_launch_url_of_the_amazon_application() {
		launchUrl("https://www.myntra.com/");

	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntrieBrowser();

	}

}
